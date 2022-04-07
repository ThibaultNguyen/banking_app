package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetFilter;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.OneOffPeriodicity;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.RecurringPeriodicity;

public class BudgetClientDto {

    private BudgetFilter filter;

    private CurrencyDenominatedAmount amount;

    private String name;

    private RecurringPeriodicity recurringPeriodicity;

    private OneOffPeriodicity oneOffPeriodicity;

    public RecurringPeriodicity getRecurringPeriodicity() {
        return recurringPeriodicity;
    }

    public BudgetClientDto setRecurringPeriodicity(RecurringPeriodicity recurringPeriodicity) {
        this.recurringPeriodicity = recurringPeriodicity;
        return this;
    }

    public OneOffPeriodicity getOneOffPeriodicity() {
        return oneOffPeriodicity;
    }

    public BudgetClientDto setOneOffPeriodicity(OneOffPeriodicity oneOffPeriodicity) {
        this.oneOffPeriodicity = oneOffPeriodicity;
        return this;
    }

    public BudgetFilter getFilter() {
        return filter;
    }

    public BudgetClientDto setFilter(BudgetFilter filter) {
        this.filter = filter;
        return this;
    }

    public CurrencyDenominatedAmount getAmount() {
        return amount;
    }

    public BudgetClientDto setAmount(CurrencyDenominatedAmount amount) {
        this.amount = amount;
        return this;
    }

    public String getName() {
        return name;
    }

    public BudgetClientDto setName(String name) {
        this.name = name;
        return this;
    }
}
