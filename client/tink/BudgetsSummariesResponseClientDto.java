package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetSummary;

import java.util.List;

public class BudgetsSummariesResponseClientDto {

    private List<BudgetSummary> budgetSummaries;

    public List<BudgetSummary> getBudgetSummaries() {
        return budgetSummaries;
    }

    public BudgetsSummariesResponseClientDto setBudgetSummaries(List<BudgetSummary> budgetSummaries) {
        this.budgetSummaries = budgetSummaries;
        return this;
    }
}
