package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

import java.math.BigDecimal;
import java.util.List;

/**
 * API representation of a SuggestTransaction
 */
public class SuggestTransactionsApiDTO implements DTO {

    private String categorizationImprovement;

    private BigDecimal categorizationLevel;

    private BigDecimal numberOfClusters;

    private BigDecimal numberOfTransactions;

    private BigDecimal numberOfUncategorizedTransactions;

    private List<TransactionClusterApiDTO> clusters;

    public BigDecimal getNumberOfClusters() {
        return numberOfClusters;
    }

    public SuggestTransactionsApiDTO setNumberOfClusters(BigDecimal numberOfClusters) {
        this.numberOfClusters = numberOfClusters;
        return this;
    }

    public BigDecimal getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public SuggestTransactionsApiDTO setNumberOfTransactions(BigDecimal numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
        return this;
    }

    public BigDecimal getNumberOfUncategorizedTransactions() {
        return numberOfUncategorizedTransactions;
    }

    public SuggestTransactionsApiDTO setNumberOfUncategorizedTransactions(BigDecimal numberOfUncategorizedTransactions) {
        this.numberOfUncategorizedTransactions = numberOfUncategorizedTransactions;
        return this;
    }

    public String getCategorizationImprovement() {
        return categorizationImprovement;
    }

    public SuggestTransactionsApiDTO setCategorizationImprovement(String categorizationImprovement) {
        this.categorizationImprovement = categorizationImprovement;
        return this;
    }

    public BigDecimal getCategorizationLevel() {
        return categorizationLevel;
    }

    public SuggestTransactionsApiDTO setCategorizationLevel(BigDecimal categorizationLevel) {
        this.categorizationLevel = categorizationLevel;
        return this;
    }

    public List<TransactionClusterApiDTO> getClusters() {
        return clusters;
    }

    public SuggestTransactionsApiDTO setClusters(List<TransactionClusterApiDTO> clusters) {
        this.clusters = clusters;
        return this;
    }
}
