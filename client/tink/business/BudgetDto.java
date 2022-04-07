package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CurrencyDenominatedAmount;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.enums.PeriodicityType;

public class BudgetDto {

    private CurrencyDenominatedAmount amount;

    private Boolean archived;

    private BudgetFilter filter;

    private String id;

    private String name;

    private OneOffPeriodicity oneOffPeriodicity;

    private RecurringPeriodicity recurringPeriodicity;

    private PeriodicityType periodicityType;

    public CurrencyDenominatedAmount getAmount() {
        return amount;
    }

    public BudgetDto setAmount(CurrencyDenominatedAmount amount) {
        this.amount = amount;
        return this;
    }

    public Boolean getArchived() {
        return archived;
    }

    public BudgetDto setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    public BudgetFilter getFilter() {
        return filter;
    }

    public BudgetDto setFilter(BudgetFilter filter) {
        this.filter = filter;
        return this;
    }

    public String getId() {
        return id;
    }

    public BudgetDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BudgetDto setName(String name) {
        this.name = name;
        return this;
    }

    public OneOffPeriodicity getOneOffPeriodicity() {
        return oneOffPeriodicity;
    }

    public BudgetDto setOneOffPeriodicity(OneOffPeriodicity oneOffPeriodicity) {
        this.oneOffPeriodicity = oneOffPeriodicity;
        return this;
    }

    public RecurringPeriodicity getRecurringPeriodicity() {
        return recurringPeriodicity;
    }

    public BudgetDto setRecurringPeriodicity(RecurringPeriodicity recurringPeriodicity) {
        this.recurringPeriodicity = recurringPeriodicity;
        return this;
    }

    public PeriodicityType getPeriodicityType() {
        return periodicityType;
    }

    public BudgetDto setPeriodicityType(PeriodicityType periodicityType) {
        this.periodicityType = periodicityType;
        return this;
    }
}
