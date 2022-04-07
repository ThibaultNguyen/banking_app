package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * API representation of a Transaction Cluster for PFM
 */
public class TransactionClusterApiDTO implements DTO {

    private BigDecimal categorizationImprovement;

    private String description;

    public List<TransactionPfmApiDTO> getTransactions() {
        return transactions;
    }

    public TransactionClusterApiDTO setTransactions(List<TransactionPfmApiDTO> transactions) {
        this.transactions = transactions;
        return this;
    }

    private List<TransactionPfmApiDTO> transactions;

    public BigDecimal getCategorizationImprovement() {
        return categorizationImprovement;
    }

    public TransactionClusterApiDTO setCategorizationImprovement(BigDecimal categorizationImprovement) {
        this.categorizationImprovement = categorizationImprovement;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TransactionClusterApiDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
