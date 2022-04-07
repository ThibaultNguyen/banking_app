package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

public class BudgetSummary {

    private BudgetPeriodDto budgetPeriod;

    private BudgetDto budgetSpecification;

    public BudgetPeriodDto getBudgetPeriod() {
        return budgetPeriod;
    }

    public BudgetSummary setBudgetPeriod(BudgetPeriodDto budgetPeriod) {
        this.budgetPeriod = budgetPeriod;
        return this;
    }

    public BudgetDto getBudgetSpecification() {
        return budgetSpecification;
    }

    public BudgetSummary setBudgetSpecification(BudgetDto budgetSpecification) {
        this.budgetSpecification = budgetSpecification;
        return this;
    }
}
