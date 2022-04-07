package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetTransactionDto;

import java.util.List;

public class BudgetTransactionsResponseClientDto {

    private List<BudgetTransactionDto> transactions;

    public List<BudgetTransactionDto> getTransactions() {
        return transactions;
    }

    public BudgetTransactionsResponseClientDto setTransactions(List<BudgetTransactionDto> transactions) {
        this.transactions = transactions;
        return this;
    }
}
