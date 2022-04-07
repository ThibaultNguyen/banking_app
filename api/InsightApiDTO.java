package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

/**
 * API representation of an insight
 */

public class InsightApiDTO implements DTO {

    private String insightData;

    private Integer dateArchived;

    private Integer dateInsightCreated;

    private String description;

    private String id;

    private String title;

    private String type;

    private String userId;

    private String insightAction;

    private String insightId;

    public String getInsightData() {
        return insightData;
    }

    public InsightApiDTO setInsightData(String insightData) {
        this.insightData = insightData;
        return this;
    }

    public Integer getDateArchived() {
        return dateArchived;
    }

    public InsightApiDTO setDateArchived(Integer dateArchived) {
        this.dateArchived = dateArchived;
        return this;
    }

    public Integer getDateInsightCreated() {
        return dateInsightCreated;
    }

    public InsightApiDTO setDateInsightCreated(Integer dateInsightCreated) {
        this.dateInsightCreated = dateInsightCreated;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public InsightApiDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getId() {
        return id;
    }

    public InsightApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InsightApiDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getType() {
        return type;
    }

    public InsightApiDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public InsightApiDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getInsightAction() {
        return insightAction;
    }

    public InsightApiDTO setInsightAction(String insightAction) {
        this.insightAction = insightAction;
        return this;
    }

    public String getInsightId() {
        return insightId;
    }

    public InsightApiDTO setInsightId(String insightId) {
        this.insightId = insightId;
        return this;
    }
}
