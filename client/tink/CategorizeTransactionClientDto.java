package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.List;

public class CategorizeTransactionClientDto {

    private String categoryId;

    private List<String> transactionIds;

    public String getCategoryId() {
        return categoryId;
    }

    public CategorizeTransactionClientDto setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public List<String> getTransactionIds() {
        return transactionIds;
    }

    public CategorizeTransactionClientDto setTransactionIds(List<String> transactionIds) {
        this.transactionIds = transactionIds;
        return this;
    }
}

