package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import java.util.List;

public class InsightActionableDto {

    private Integer createdTime;

    private String InsightData;

    private String description;

    private String id;

    private List<InsightActionableInsightProposedActionDto> insightActions ;

    private String title;

    private String type;

    private String userId;

    public Integer getCreatedTime() {
        return createdTime;
    }

    public InsightActionableDto setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getInsightData() {
        return InsightData;
    }

    public InsightActionableDto setInsightData(String insightData) {
        InsightData = insightData;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InsightActionableDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public InsightActionableDto setId(String id) {
        this.id = id;
        return this;
    }

    public List<InsightActionableInsightProposedActionDto> getInsightActions() {
        return insightActions;
    }

    public InsightActionableDto setInsightActions(List<InsightActionableInsightProposedActionDto> insightActions) {
        this.insightActions = insightActions;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InsightActionableDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public InsightActionableDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public InsightActionableDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
