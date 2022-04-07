package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.List;

public class CategorizeTransactionsClientDto {

    private List<CategorizeTransactionClientDto> categorizationList;

    public List<CategorizeTransactionClientDto> getCategorizationList() {
        return categorizationList;
    }

    public CategorizeTransactionsClientDto setCategorizationList(List<CategorizeTransactionClientDto> categorizationList) {
        this.categorizationList = categorizationList;
        return this;
    }
}
