package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

import java.util.List;

/**
 * API representation of an actionable insight
 */

public class InsightActionableApiDTO implements DTO {

    private InsightApiDTO insight;

    private Integer createdTime;

    private List<InsightProposedActionApiDTO> action;

    private String insightAction;

    private String insightId;

    public InsightApiDTO getInsight() {
        return insight;
    }

    public InsightActionableApiDTO setInsight(InsightApiDTO insight) {
        this.insight = insight;
        return this;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public InsightActionableApiDTO setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public List<InsightProposedActionApiDTO> getAction() {
        return action;
    }

    public InsightActionableApiDTO setAction(List<InsightProposedActionApiDTO> action) {
        this.action = action;
        return this;
    }

    public String getInsightAction() {
        return insightAction;
    }

    public InsightActionableApiDTO setInsightAction(String insightAction) {
        this.insightAction = insightAction;
        return this;
    }

    public String getInsightId() {
        return insightId;
    }

    public InsightActionableApiDTO setInsightId(String insightId) {
        this.insightId = insightId;
        return this;
    }
}
