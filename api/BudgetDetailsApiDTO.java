/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

import javax.money.MonetaryAmount;
import java.util.List;

/**
 * API representation of an Aspsp
 */
public class BudgetDetailsApiDTO implements DTO {

    private BudgetApiDTO budget;

    private MonetaryAmount averageSpentAmount;

    private MonetaryAmount totalSpentAmount;

    private List<BudgetPeriodApiDTO> period;

    public List<BudgetPeriodApiDTO> getPeriod() {
        return period;
    }

    public BudgetDetailsApiDTO setPeriod(List<BudgetPeriodApiDTO> period) {
        this.period = period;
        return this;
    }

    public BudgetApiDTO getBudget() {
        return budget;
    }

    public BudgetDetailsApiDTO setBudget(BudgetApiDTO budget) {
        this.budget = budget;
        return this;
    }

    public MonetaryAmount getAverageSpentAmount() {
        return averageSpentAmount;
    }

    public BudgetDetailsApiDTO setAverageSpentAmount(MonetaryAmount averageSpentAmount) {
        this.averageSpentAmount = averageSpentAmount;
        return this;
    }

    public MonetaryAmount getTotalSpentAmount() {
        return totalSpentAmount;
    }

    public BudgetDetailsApiDTO setTotalSpentAmount(MonetaryAmount totalSpentAmount) {
        this.totalSpentAmount = totalSpentAmount;
        return this;
    }



}
