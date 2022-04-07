package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightActionData;

public class InsightProposedActionDto {

    private InsightActionData data;

    private String label;

    public InsightActionData getData() {
        return data;
    }

    public InsightProposedActionDto setData(InsightActionData data) {
        this.data = data;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public InsightProposedActionDto setLabel(String label) {
        this.label = label;
        return this;
    }
}
