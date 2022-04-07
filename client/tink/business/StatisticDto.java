package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

public class StatisticDto {

    private String description;

    private String payload;

    private String period;

    private String resolution;

    private String type;

    private String userId;

    private String value;

    public String getDescription() {
        return description;
    }

    public StatisticDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public StatisticDto setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public StatisticDto setPeriod(String period) {
        this.period = period;
        return this;
    }

    public String getResolution() {
        return resolution;
    }

    public StatisticDto setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public String getType() {
        return type;
    }

    public StatisticDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public StatisticDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getValue() {
        return value;
    }

    public StatisticDto setValue(String value) {
        this.value = value;
        return this;
    }
}

