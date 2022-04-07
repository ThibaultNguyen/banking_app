package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.mapper.ConsentMapper;
import com.soprabanking.dxp.ais.common.connector.model.api.ConsentCreationResponseApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.InternalConsentApiDto;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Consent;
import org.springframework.stereotype.Component;

/**
 * Generic mapper that maps the common {@link InternalConsentApiDto} to an internal business object
 */
@Component
public class ConsentMapperImpl implements ConsentMapper<Consent> {

    private static InternalConsentApiDto toConsentResponse(Consent consent) {
        return new InternalConsentApiDto().setAspspId(consent.getAspspId())
                                          .setPsuId(consent.getPsuId())
                                          .setId(consent.getId());
    }

    @Override
    public Consent toEntity(InternalConsentApiDto dto) {
        return new Consent().setId(dto.getId())
                            .setAspspId(dto.getAspspId())
                            .setPsuId(dto.getPsuId())
                            .setCallBackUri(dto.getCallBackUri());
    }

    @Override
    public ConsentCreationResponseApiDto toApi(Consent consent) {
        return new ConsentCreationResponseApiDto().setConsent(toConsentResponse(consent))
                                                  .setRedirectUri(consent.getRedirectUrl())
                                                  .setState(consent.getState());
    }
}
