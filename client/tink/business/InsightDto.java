package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

public class InsightDto {

    private Integer createdTime;

    private String insightData;

    private Integer dateArchived;

    private Integer dateInsightCreated;

    private String description;

    private String id;

    private String title;

    private String type;

    private String userId;

    public Integer getCreatedTime() {
        return createdTime;
    }

    public InsightDto setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getInsightData() {
        return insightData;
    }

    public InsightDto setInsightData(String insightData) {
        this.insightData = insightData;
        return this;
    }

    public Integer getDateArchived() {
        return dateArchived;
    }

    public InsightDto setDateArchived(Integer dateArchived) {
        this.dateArchived = dateArchived;
        return this;
    }

    public Integer getDateInsightCreated() {
        return dateInsightCreated;
    }

    public InsightDto setDateInsightCreated(Integer dateInsightCreated) {
        this.dateInsightCreated = dateInsightCreated;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InsightDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public InsightDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InsightDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public InsightDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public InsightDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
