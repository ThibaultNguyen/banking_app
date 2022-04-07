package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.business.Payment;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.PaymentDestinationRequestClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.PaymentRequestClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SessionClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SignableOperationClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransferClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.entity.Credential;
import com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.TRANSFER_IBAN;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toTimeStampIfExist;

public class PaymentMapper {

    private PaymentMapper() {
    }

    public static TransferClientDto toTransferClient(Payment payment) {
        return new TransferClientDto().setAmount(new BigDecimal(String.valueOf(payment.getAmount().getNumber())))
                                      .setRedirectUri(payment.getCallBackUri())
                                      .setCurrency(payment.getAmount().getCurrency().getCurrencyCode())
                                      .setSourceUri(TRANSFER_IBAN + payment.getDebtorInformation())
                                      .setDestinationUri(TRANSFER_IBAN + payment.getCreditorInformation())
                                      .setDueDate(toTimeStampIfExist(payment.getRequestedExecutionDate()))
                                      .setSourceMessage(toSourceMessage(payment));
    }

    // TODO : Make the logic about "MessageType"
    public static PaymentRequestClientDto toPaymentRequestClient(Payment payment) {
        return new PaymentRequestClientDto().setAmount(new BigDecimal(String.valueOf(payment.getAmount().getNumber())))
                                            .setCurrency(payment.getAmount().getCurrency().getCurrencyCode())
                                            .setMarket(payment.getMarket())
                                            .setMessageType("FREE_TEXT")
                                            .setRecipientName(payment.getCreditorName())
                                            .setSourceMessage(payment.getCommunication())
                                            .setDestinations(toPaymentDestinations(payment));
    }

    public static SessionClientDto toClient(String sourceAccountNumber) {
        return new SessionClientDto().setSourceAccountNumber(sourceAccountNumber);
    }

    // TODO Fix hardcoded values
    public static Payment toEntity(SignableOperationClientDto clientDto) {
        return new Payment().setAuthorisationStatus("OK")
                            .setCreated(OffsetDateTimeMapper.toTimeStampIfExist(OffsetDateTime.now()))
                            .setStatus("OK")
                            .setAspspId("d00000000000000000000000")
                            .setPsuId("ID_PSU_SIGMUND");
    }

    public static Payment toEntity(Payment payment, Credential credential) {
        return payment.setRedirectUrl(credential.getRedirectUrl());
    }

    private static List<PaymentDestinationRequestClientDto> toPaymentDestinations(Payment payment) {
        return Collections.singletonList(new PaymentDestinationRequestClientDto().setAccountNumber(payment.getCreditorInformation())
                                                                                 .setReference("reference")
                                                                                 .setType("iban"));
    }

    private static String toSourceMessage(Payment payment) {
        return payment.getCommunication();
    }
}
