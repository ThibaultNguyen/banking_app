/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetFilter;

import javax.money.MonetaryAmount;
import javax.validation.constraints.Null;
import java.time.OffsetDateTime;

import static com.soprabanking.dxp.tppconnectortinkais.model.api.Groups.CreateOneOff;
import static com.soprabanking.dxp.tppconnectortinkais.model.api.Groups.CreateRecurring;
import static com.soprabanking.dxp.tppconnectortinkais.model.api.Groups.Update;

/**
 * API representation of a Budget
 */
public class BudgetApiDTO implements DTO {

    @Null(groups = {CreateOneOff.class, CreateRecurring.class, Update.class})
    private String id;

    private String name;

    private MonetaryAmount amount;

    @Null(groups = {CreateOneOff.class, CreateRecurring.class, Update.class})
    private Boolean archived;

    private BudgetFilter filter;

    @Null(groups = {CreateRecurring.class})
    private OffsetDateTime oneOffStartDate;

    @Null(groups = {CreateRecurring.class})
    private OffsetDateTime oneOffEndDate;

    @Null(groups = {CreateOneOff.class})
    private String recurringPeriodicity;

    @Null(groups = {CreateOneOff.class, CreateRecurring.class, Update.class})
    private String periodicityType;

    public String getRecurringPeriodicity() {
        return recurringPeriodicity;
    }

    public BudgetApiDTO setRecurringPeriodicity(String recurringPeriodicity) {
        this.recurringPeriodicity = recurringPeriodicity;
        return this;
    }

    public String getPeriodicityType() {
        return periodicityType;
    }

    public BudgetApiDTO setPeriodicityType(String periodicityType) {
        this.periodicityType = periodicityType;
        return this;
    }

    public OffsetDateTime getOneOffStartDate() {
        return oneOffStartDate;
    }

    public BudgetApiDTO setOneOffStartDate(OffsetDateTime oneOffStartDate) {
        this.oneOffStartDate = oneOffStartDate;
        return this;
    }

    public OffsetDateTime getOneOffEndDate() {
        return oneOffEndDate;
    }

    public BudgetApiDTO setOneOffEndDate(OffsetDateTime oneOffEndDate) {
        this.oneOffEndDate = oneOffEndDate;
        return this;
    }

    public String getId() {
        return id;
    }

    public BudgetApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BudgetApiDTO setName(String name) {
        this.name = name;
        return this;
    }

    public MonetaryAmount getAmount() {
        return amount;
    }

    public BudgetApiDTO setAmount(MonetaryAmount amount) {
        this.amount = amount;
        return this;
    }

    public Boolean getArchived() {
        return archived;
    }

    public BudgetApiDTO setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    public BudgetFilter getFilter() {
        return filter;
    }

    public BudgetApiDTO setFilter(BudgetFilter filter) {
        this.filter = filter;
        return this;
    }

    @Override
    public String toString() {
        return "BudgetApiDTO{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", amount=" + amount +
               ", archived=" + archived +
               ", filter=" + filter +
               ", startDate=" + oneOffStartDate +
               ", endDate=" + oneOffEndDate +
               ", recurringPeriodicity='" + recurringPeriodicity + '\'' +
               ", periodicityType='" + periodicityType + '\'' +
               '}';
    }
}
