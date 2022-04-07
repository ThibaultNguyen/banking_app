package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.business.Account;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.AccountClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.AccountsResponseClientDto;

import java.util.List;
import java.util.stream.Collectors;

public class AccountsMapper {

    private AccountsMapper() {
    }

    public static List<Account> toEntities(AccountsResponseClientDto responseClientDto) {
        return responseClientDto.getAccounts()
                                .stream()
                                .map(AccountsMapper::toEntity)
                                .collect(Collectors.toList());
    }

    public static Account toEntity(AccountClientDto a) {
        return new Account().setAccountNumber(a.getAccountNumber())
                            .setBalance(BalanceMapper.toEntity(a.getBalance(), a.getCurrencyCode()))
                            .setType(a.getType())
                            .setClosed(a.isClosed())
                            .setCurrencyCode(a.getCurrencyCode())
                            .setFinancialInstitutionId(a.getFinancialInstitutionId())
                            .setCredentialsId(a.getCredentialsId())
                            .setName(a.getName())
                            .setUserId(a.getUserId())
                            .setAccountId(a.getId());
    }
}
