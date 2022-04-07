/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.mapper.AccountMapper;
import com.soprabanking.dxp.ais.common.connector.model.api.AccountApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.ReferenceApiDto;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType;
import com.soprabanking.dxp.commons.error.DxpSbsFeedback;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.CACC;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.LOAN;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.MGLD;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.MOMA;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.OTHR;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.SACC;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ExternalCashAccountType.SVGS;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.ReferenceType.IBAN;
import static com.soprabanking.dxp.commons.error.DxpTechnicalCode.ERROR_INTERNAL;
import static com.soprabanking.dxp.tppconnectortinkais.mapper.BalanceMapper.toApiList;
import static java.lang.String.format;
import static java.util.Collections.singletonList;

/**
 * Generic mapper that maps the common {@link AccountApiDto} to an internal business object
 */
@Component
public final class AccountMapperImpl implements AccountMapper<Account> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountMapperImpl.class);

    @Override
    public Account toEntity(AccountApiDto account) {
        return null;
    }

    @Override
    public AccountApiDto toApi(Account account) {
        return new AccountApiDto().setId(account.getAccountId())
                                  .setName(account.getName())
                                  .setCashAccountType(mapCashAccountTypeIfExist(account.getType()))
                                  .setBalances(toApiList(account.getBalance()))
                                  .setReferences(toReferencesApi(account))
                                  .setCurrency(account.getCurrencyCode())
                                  .setAspspId(account.getAspspId());
    }

    private static ExternalCashAccountType mapCashAccountTypeIfExist(String type) {
        switch (type) {
            case "CHECKING":
            case "EXTERNAL":
                return CACC;
            case "SAVINGS":
            case "INVESTMENT":
                return SVGS;
            case "MORTGAGE":
                return MOMA;
            case "CREDIT_CARD":
                return SACC;
            case "LOAN":
                return LOAN;
            case "PENSION":
                return MGLD;
            case "OTHER":
                return OTHR;
            default:
                throw new DxpSbsFeedback(format("Unable to find type for %s", type), ERROR_INTERNAL, LOGGER::info).toException();
        }
    }

    private static List<ReferenceApiDto> toReferencesApi(Account account) {
        return singletonList(new ReferenceApiDto().setType(IBAN).setId(account.getAccountNumber()));
    }
}
