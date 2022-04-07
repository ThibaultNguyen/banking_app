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
 * API representation of a Budget Transaction
 */

public class BudgetTransactionApiDTO implements DTO {

    private String id;

    private String accountId;

    private MonetaryAmount amount;

    private String categoryCode;

    private OffsetDateTime date;

    private String description;

    private MonetaryAmount dispensableAmount;

    public String getId() {
        return id;
    }

    public BudgetTransactionApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getAccountId() {
        return accountId;
    }

    public BudgetTransactionApiDTO setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public MonetaryAmount getAmount() {
        return amount;
    }

    public BudgetTransactionApiDTO setAmount(MonetaryAmount amount) {
        this.amount = amount;
        return this;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public BudgetTransactionApiDTO setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public BudgetTransactionApiDTO setDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BudgetTransactionApiDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public MonetaryAmount getDispensableAmount() {
        return dispensableAmount;
    }

    public BudgetTransactionApiDTO setDispensableAmount(MonetaryAmount dispensableAmount) {
        this.dispensableAmount = dispensableAmount;
        return this;
    }

}
