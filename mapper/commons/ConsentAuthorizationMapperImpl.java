/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.mapper.ConsentAuthorizationMapper;
import com.soprabanking.dxp.ais.common.connector.model.api.ConsentAuthorizationApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.InternalConsentApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.SubjectApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Account;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Consent;
import com.soprabanking.dxp.tppconnectortinkais.model.entity.Credential;
import org.springframework.stereotype.Component;

import java.util.Collection;

import static com.soprabanking.dxp.ais.common.connector.model.api.enums.ConsentStatus.AUTHORIZED;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

/**
 * Generic mapper that maps the common {@link ConsentAuthorizationApiDto} to an internal business object
 */
@Component
public class ConsentAuthorizationMapperImpl implements ConsentAuthorizationMapper<Consent> {

    @Override
    public Consent toEntity(ConsentAuthorizationApiDto consentAuthorizationApiDto) {
        return new Consent().setCode(consentAuthorizationApiDto.getAuthorizationCode())
                            .setState(consentAuthorizationApiDto.getState())
                            .setCredentialId(consentAuthorizationApiDto.getCredentialsId());
    }

    @Override
    public InternalConsentApiDto toApi(Consent consent) {
        return new InternalConsentApiDto().setId(consent.getId())
                                          .setAspspId(consent.getAspspId())
                                          .setPsuId(consent.getPsuId())
                                          .setAuthorisationStatus(consent.getStatus())
                                          .setSubjects(consent.getIbanAccountIdMap()
                                                              .entrySet()
                                                              .stream()
                                                              .map(e -> new SubjectApiDTO().setIban(e.getKey()).setResourceId(e.getValue()))
                                                              .collect(toList()));
    }

    public static Consent toEntity(Credential credential, Collection<Account> accounts) {
        return new Consent().setId(credential.getResourceId())
                            .setAspspId(credential.getAspspId())
                            .setPsuId(credential.getUserId())
                            .setStatus(AUTHORIZED)
                            .setIbanAccountIdMap(accounts.stream().collect(toMap(Account::getAccountNumber, Account::getAccountId)));
    }
}
