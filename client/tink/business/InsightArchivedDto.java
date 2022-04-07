package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

public class InsightArchivedDto {

    private String InsightData;

    private Integer dateArchived;

    private Integer dateInsightCreated;

    private String description;

    private String id;

    private String title;

    private String type;

    private String userId;

    public String getInsightData() {
        return InsightData;
    }

    public InsightArchivedDto setInsightData(String insightData) {
        InsightData = insightData;
        return this;
    }

    public Integer getDateArchived() {
        return dateArchived;
    }

    public InsightArchivedDto setDateArchived(Integer dateArchived) {
        this.dateArchived = dateArchived;
        return this;
    }

    public Integer getDateInsightCreated() {
        return dateInsightCreated;
    }

    public InsightArchivedDto setDateInsightCreated(Integer dateInsightCreated) {
        this.dateInsightCreated = dateInsightCreated;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InsightArchivedDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public InsightArchivedDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InsightArchivedDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public InsightArchivedDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public InsightArchivedDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
