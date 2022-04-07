package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetDto;

public class BudgetResponseClientDto {

    private BudgetDto budgetSpecification;

    public BudgetDto getBudgetSpecification() {
        return budgetSpecification;
    }

    public BudgetResponseClientDto setBudgetSpecification(BudgetDto budgetSpecification) {
        this.budgetSpecification = budgetSpecification;
        return this;
    }
}
