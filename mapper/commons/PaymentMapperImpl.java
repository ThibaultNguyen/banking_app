package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.model.api.InternalConsentApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.mapper.PaymentMapper;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.AccountApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.AccountReferenceApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.CreditorInformationApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.DebtorInformationApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PartyApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PaymentApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PaymentCreationResponseApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PostalAddressApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.RemittanceInformationApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.enums.AccountReferenceType;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.enums.AuthorisationStatus;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.enums.PaymentStatus;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Payment;
import com.soprabanking.dxp.tppconnectortinkais.model.business.PaymentAddress;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static com.soprabanking.dxp.tppconnectortinkais.utils.MapperUtils.ifNotNull;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toOffsetDateTimeIfExists;
import static java.util.Optional.ofNullable;

/**
 * Generic mapper that maps the common {@link InternalConsentApiDto} to an internal business object
 */
@Component
public class PaymentMapperImpl implements PaymentMapper<Payment> {

    @Override
    public Payment toEntity(PaymentApiDto paymentApiDto) {
        return ofNullable(
                new Payment().setEndToEndIdentification(paymentApiDto.getEndToEndIdentification())
                             .setAddress(ifNotNull(paymentApiDto.getCreditorInformation().getParty().getPostalAddress(),
                                                   PaymentMapperImpl::toPaymentAddress))
                             .setAspspId(paymentApiDto.getAspspId())
                             .setPaymentId(paymentApiDto.getId())
                             .setPsuId(paymentApiDto.getPsuId())
                             .setAmount(paymentApiDto.getInstructedAmount())
                             .setCreditorInformation(
                                     paymentApiDto.getCreditorInformation().getAccount().getReference().getId())
                             .setDebtorInformation(
                                     paymentApiDto.getDebtorInformation().getAccount().getReference().getId())
                             .setCreditorName(
                                     paymentApiDto.getCreditorInformation()
                                                  .getParty()
                                                  .getName())
                             .setCallBackUri(paymentApiDto.getCallBackUri())
                             .setRequestedExecutionDate(paymentApiDto.getRequestedExecutionDate())
                             .setCommunication(
                                     ifNotNull(paymentApiDto.getRemittanceInformation(), PaymentMapperImpl::toCommunication))).orElse(null);
    }

    @Override
    public PaymentCreationResponseApiDto toApi(Payment payment) {
        return ofNullable(
                new PaymentCreationResponseApiDto().setPayment(toPaymentApi(payment))
                                                   .setRedirectUri(payment.getRedirectUrl())).orElse(null);
    }

    private PaymentApiDto toPaymentApi(Payment payment) {
        return new PaymentApiDto().setAspspId(payment.getAspspId())
                                  .setInstructedAmount(payment.getAmount())
                                  .setPsuId(payment.getPsuId())
                                  .setAuthorisationStatus(toAuthorisationStatus(payment.getAuthorisationStatus()))
                                  .setCreationDateTime(toOffsetDateTimeIfExists(payment.getCreated()))
                                  .setCreditorInformation(
                                          ifNotNull(payment, PaymentMapperImpl::toCreditorInformationApiDto))
                                  .setDebtorInformation(
                                          ifNotNull(payment, PaymentMapperImpl::toDebtorInformationApiDto))
                                  .setId(payment.getPaymentId())
                                  .setRemittanceInformation(
                                          ifNotNull(payment.getCommunication(), PaymentMapperImpl::toRemittanceInformation))
                                  .setRequestedExecutionDate(payment.getRequestedExecutionDate())
                                  .setStatus(toPaymentStatus(payment.getStatus()))
                                  .setEndToEndIdentification(payment.getEndToEndIdentification());
    }

    private static AuthorisationStatus toAuthorisationStatus(String status) {
        return AuthorisationStatus.AWAITING_AUTHORISATION;
    }

    private static PaymentStatus toPaymentStatus(String status) {
        return PaymentStatus.RCVD;
    }

    private static CreditorInformationApiDto toCreditorInformationApiDto(Payment payment) {
        return new CreditorInformationApiDto().setAccount(toAccountApi(payment.getCreditorInformation()))
                                              .setParty(new PartyApiDto().setPostalAddress(
                                                      ifNotNull(payment.getAddress(), PaymentMapperImpl::toPostalAddress))
                                                                         .setName(payment.getCreditorName()));
    }

    private static PaymentAddress toPaymentAddress(PostalAddressApiDto addressApiDto) {
        return new PaymentAddress().setBuildingNumber(addressApiDto.getBuildingNumber())
                                   .setCity(addressApiDto.getCity())
                                   .setCountryCode(addressApiDto.getCountryCode())
                                   .setPostalCode(addressApiDto.getPostalCode())
                                   .setStreet(addressApiDto.getStreet());
    }

    private static PostalAddressApiDto toPostalAddress(PaymentAddress address) {
        return new PostalAddressApiDto().setBuildingNumber(address.getBuildingNumber())
                                        .setCity(address.getCity())
                                        .setCountryCode(address.getCountryCode())
                                        .setPostalCode(address.getPostalCode())
                                        .setStreet(address.getStreet());
    }

    private static DebtorInformationApiDto toDebtorInformationApiDto(Payment payment) {
        return new DebtorInformationApiDto().setAccount(toAccountApi(payment.getDebtorInformation()));
    }

    private static AccountApiDto toAccountApi(String account) {
        return new AccountApiDto().setCurrency("EUR")
                                  .setReference(new AccountReferenceApiDto().setId(account)
                                                                            .setType(
                                                                                    AccountReferenceType.IBAN));
    }

    private static RemittanceInformationApiDto toRemittanceInformation(String communication) {
        return new RemittanceInformationApiDto().setUnstructured(communication)
                                                .setStructured(communication);
    }

    private static String toCommunication(RemittanceInformationApiDto apiDto) {
        if (Objects.nonNull(apiDto.getStructured())) {
            return apiDto.getStructured();
        }
        if (Objects.nonNull(apiDto.getUnstructured())) {
            return apiDto.getUnstructured();
        }
        return null;
    }
}
