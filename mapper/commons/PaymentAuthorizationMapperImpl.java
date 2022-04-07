package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.model.api.InternalConsentApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.mapper.PaymentAuthorizationMapper;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PaymentApiDto;
import com.soprabanking.dxp.tpp.pis.common.connector.model.api.PaymentAuthorizationApiDto;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Payment;
import org.springframework.stereotype.Component;

/**
 * Generic mapper that maps the common {@link InternalConsentApiDto} to an internal business object
 */
@Component
public class PaymentAuthorizationMapperImpl implements PaymentAuthorizationMapper<Payment> {

    @Override
    public Payment toEntity(PaymentAuthorizationApiDto paymentAuthorizationApiDTO) {
        return new Payment().setCode(paymentAuthorizationApiDTO.getAuthorizationCode())
                            .setState(paymentAuthorizationApiDTO.getState());
    }

    @Override
    public PaymentApiDto toApi(Payment entity) {
        return new PaymentApiDto();
    }
}
