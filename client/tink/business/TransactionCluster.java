package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionClientDto;

import java.math.BigDecimal;
import java.util.List;

public class TransactionCluster {

    private BigDecimal categorizationImprovement;

    private String description;

    private List<TransactionClientDto> transactions;

    public BigDecimal getCategorizationImprovement() {
        return categorizationImprovement;
    }

    public TransactionCluster setCategorizationImprovement(BigDecimal categorizationImprovement) {
        this.categorizationImprovement = categorizationImprovement;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TransactionCluster setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<TransactionClientDto> getTransactions() {
        return transactions;
    }

    public TransactionCluster setTransactions(List<TransactionClientDto> transactions) {
        this.transactions = transactions;
        return this;
    }
}
