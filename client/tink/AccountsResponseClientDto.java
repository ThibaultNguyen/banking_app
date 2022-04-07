package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.List;

public class AccountsResponseClientDto {

    private List<AccountClientDto> accounts;

    public List<AccountClientDto> getAccounts() {
        return accounts;
    }

    public AccountsResponseClientDto setAccounts(List<AccountClientDto> accounts) {
        this.accounts = accounts;
        return this;
    }
}