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
import java.time.OffsetDateTime;

/**
 * API representation of an Aspsp
 */
public class BudgetPeriodApiDTO implements DTO {

    private MonetaryAmount spentAmount;

    private OffsetDateTime startDate;

    private OffsetDateTime endDate;

    public MonetaryAmount getSpentAmount() {
        return spentAmount;
    }

    public BudgetPeriodApiDTO setSpentAmount(MonetaryAmount spentAmount) {
        this.spentAmount = spentAmount;
        return this;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public BudgetPeriodApiDTO setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public BudgetPeriodApiDTO setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
        return this;
    }
}
