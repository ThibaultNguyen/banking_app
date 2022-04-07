package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import java.util.List;

public class BudgetFilter {

    private List<BudgetFilterAccount> accounts;

    private List<BudgetFilterCategory> categories;

    private String freeTextQuery;

    private List<BudgetFilterTag> tags;

    public List<BudgetFilterAccount> getAccounts() {
        return accounts;
    }

    public BudgetFilter setAccounts(List<BudgetFilterAccount> accounts) {
        this.accounts = accounts;
        return this;
    }

    public List<BudgetFilterCategory> getCategories() {
        return categories;
    }

    public BudgetFilter setCategories(List<BudgetFilterCategory> categories) {
        this.categories = categories;
        return this;
    }

    public String getFreeTextQuery() {
        return freeTextQuery;
    }

    public BudgetFilter setFreeTextQuery(String freeTextQuery) {
        this.freeTextQuery = freeTextQuery;
        return this;
    }

    public List<BudgetFilterTag> getTags() {
        return tags;
    }

    public BudgetFilter setTags(List<BudgetFilterTag> tags) {
        this.tags = tags;
        return this;
    }
}
