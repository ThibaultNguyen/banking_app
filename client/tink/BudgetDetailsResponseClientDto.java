package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetPeriodDto;

import java.util.List;

public class BudgetDetailsResponseClientDto {

    private BudgetDto budgetSpecification;

    private CurrencyDenominatedAmount averageSpentAmount;

    private CurrencyDenominatedAmount totalSpentAmount;

    private Long start;

    private Long end;

    private List<BudgetPeriodDto> budgetPeriods;

    public BudgetDto getBudgetSpecification() {
        return budgetSpecification;
    }

    public BudgetDetailsResponseClientDto setBudgetSpecification(BudgetDto budgetSpecification) {
        this.budgetSpecification = budgetSpecification;
        return this;
    }

    public CurrencyDenominatedAmount getAverageSpentAmount() {
        return averageSpentAmount;
    }

    public BudgetDetailsResponseClientDto setAverageSpentAmount(CurrencyDenominatedAmount averageSpentAmount) {
        this.averageSpentAmount = averageSpentAmount;
        return this;
    }

    public CurrencyDenominatedAmount getTotalSpentAmount() {
        return totalSpentAmount;
    }

    public BudgetDetailsResponseClientDto setTotalSpentAmount(CurrencyDenominatedAmount totalSpentAmount) {
        this.totalSpentAmount = totalSpentAmount;
        return this;
    }

    public Long getStart() {
        return start;
    }

    public BudgetDetailsResponseClientDto setStart(Long start) {
        this.start = start;
        return this;
    }

    public Long getEnd() {
        return end;
    }

    public BudgetDetailsResponseClientDto setEnd(Long end) {
        this.end = end;
        return this;
    }

    public List<BudgetPeriodDto> getBudgetPeriods() {
        return budgetPeriods;
    }

    public BudgetDetailsResponseClientDto setBudgetPeriods(List<BudgetPeriodDto> budgetPeriods) {
        this.budgetPeriods = budgetPeriods;
        return this;
    }
}
