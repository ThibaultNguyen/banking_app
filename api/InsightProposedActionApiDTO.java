package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

/**
 * API representation of an insight
 */

public class InsightProposedActionApiDTO implements DTO {

    private String insightActionData;

    private String label;

    public String getInsightActionData() {
        return insightActionData;
    }

    public InsightProposedActionApiDTO setInsightActionData(String insightActionData) {
        this.insightActionData = insightActionData;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public InsightProposedActionApiDTO setLabel(String label) {
        this.label = label;
        return this;
    }
}
