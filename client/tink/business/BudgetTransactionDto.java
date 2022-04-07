package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CurrencyDenominatedAmount;

public class BudgetTransactionDto {

    private String accountId;

    private CurrencyDenominatedAmount amount;

    private String categoryCode;

    private Long date;

    private String description;

    private CurrencyDenominatedAmount dispensableAmount;

    private String id;

    public String getAccountId() {
        return accountId;
    }

    public BudgetTransactionDto setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public CurrencyDenominatedAmount getAmount() {
        return amount;
    }

    public BudgetTransactionDto setAmount(CurrencyDenominatedAmount amount) {
        this.amount = amount;
        return this;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public BudgetTransactionDto setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    public Long getDate() {
        return date;
    }

    public BudgetTransactionDto setDate(Long date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BudgetTransactionDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public CurrencyDenominatedAmount getDispensableAmount() {
        return dispensableAmount;
    }

    public BudgetTransactionDto setDispensableAmount(CurrencyDenominatedAmount dispensableAmount) {
        this.dispensableAmount = dispensableAmount;
        return this;
    }

    public String getId() {
        return id;
    }

    public BudgetTransactionDto setId(String id) {
        this.id = id;
        return this;
    }
}
