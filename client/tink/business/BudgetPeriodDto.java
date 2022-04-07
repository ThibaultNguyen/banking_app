package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CurrencyDenominatedAmount;

public class BudgetPeriodDto {

    private Long end;

    private CurrencyDenominatedAmount spentAmount;

    private Long start;

    public Long getEnd() {
        return end;
    }

    public BudgetPeriodDto setEnd(Long end) {
        this.end = end;
        return this;
    }

    public CurrencyDenominatedAmount getSpentAmount() {
        return spentAmount;
    }

    public BudgetPeriodDto setSpentAmount(CurrencyDenominatedAmount spentAmount) {
        this.spentAmount = spentAmount;
        return this;
    }

    public Long getStart() {
        return start;
    }

    public BudgetPeriodDto setStart(Long start) {
        this.start = start;
        return this;
    }
}
