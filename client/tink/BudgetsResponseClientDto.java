package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetDto;

import java.util.List;

public class BudgetsResponseClientDto {

    private List<BudgetDto> budgetSpecifications;

    public List<BudgetDto> getBudgetSpecifications() {
        return budgetSpecifications;
    }

    public BudgetsResponseClientDto setBudgetSpecifications(List<BudgetDto> budgetSpecifications) {
        this.budgetSpecifications = budgetSpecifications;
        return this;
    }
}
