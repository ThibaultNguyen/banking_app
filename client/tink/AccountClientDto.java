package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

public class AccountClientDto {

    private String accountNumber;

    private String balance;

    // Values: CHECKING, SAVINGS, INVESTMENT, MORTGAGE, CREDIT_CARD, LOAN, PENSION, OTHER, EXTERNAL
    private String type;

    private String bankId;

    private String id;

    private String credentialsId;

    private String name;

    private String userId;

    private String holderName;

    private boolean closed;

    private String currencyCode;

    private String financialInstitutionId;

    public String getBalance() {
        return balance;
    }

    public AccountClientDto setBalance(String balance) {
        this.balance = balance;
        return this;
    }

    public String getId() {
        return id;
    }

    public AccountClientDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountClientDto setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public String getBankId() {
        return bankId;
    }

    public AccountClientDto setBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }

    public String getCredentialsId() {
        return credentialsId;
    }

    public AccountClientDto setCredentialsId(String credentialsId) {
        this.credentialsId = credentialsId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AccountClientDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public AccountClientDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getHolderName() {
        return holderName;
    }

    public AccountClientDto setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    public boolean isClosed() {
        return closed;
    }

    public AccountClientDto setClosed(boolean closed) {
        this.closed = closed;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public AccountClientDto setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getFinancialInstitutionId() {
        return financialInstitutionId;
    }

    public AccountClientDto setFinancialInstitutionId(String financialInstitutionId) {
        this.financialInstitutionId = financialInstitutionId;
        return this;
    }

    public String getType() {
        return type;
    }

    public AccountClientDto setType(String type) {
        this.type = type;
        return this;
    }
}
