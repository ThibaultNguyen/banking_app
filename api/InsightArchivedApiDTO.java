package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

/**
 * API representation of an insight
 */

public class InsightArchivedApiDTO implements DTO {

    private String insightData;

    private Integer dateArchived;

    private Integer dateInsightCreated;

    private String description;

    private String id;

    private String title;

    private String type;

    private String userId;

    public String getInsightData() {
        return insightData;
    }

    public InsightArchivedApiDTO setInsightData(String insightData) {
        this.insightData = insightData;
        return this;
    }

    public Integer getDateArchived() {
        return dateArchived;
    }

    public InsightArchivedApiDTO setDateArchived(Integer dateArchived) {
        this.dateArchived = dateArchived;
        return this;
    }

    public Integer getDateInsightCreated() {
        return dateInsightCreated;
    }

    public InsightArchivedApiDTO setDateInsightCreated(Integer dateInsightCreated) {
        this.dateInsightCreated = dateInsightCreated;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InsightArchivedApiDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public InsightArchivedApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InsightArchivedApiDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public InsightArchivedApiDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public InsightArchivedApiDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
