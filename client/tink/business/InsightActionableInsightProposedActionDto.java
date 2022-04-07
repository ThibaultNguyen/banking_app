package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightActionData;

public class InsightActionableInsightProposedActionDto {

    private InsightActionData data;

    private String label;

    public InsightActionData getData() {
        return data;
    }

    public InsightActionableInsightProposedActionDto setData(InsightActionData data) {
        this.data = data;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public InsightActionableInsightProposedActionDto setLabel(String label) {
        this.label = label;
        return this;
    }
}
