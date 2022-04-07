package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.fasterxml.jackson.annotation.JsonView;
import com.soprabanking.dxp.commons.constants.DTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.Groups.QueryStatistics;
import com.soprabanking.dxp.tppconnectortinkais.model.api.Views.StatisticResponse;

import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.util.List;

/**
 * API representation of a statistic
 */
public class StatisticApiDTO implements DTO {

    @JsonView({StatisticResponse.class})
    private String description;

    private Boolean padResultUntilToday;

    private List<String> periods;

    @JsonView({StatisticResponse.class})
    private String resolution;

    private List<String> types;

    @Null(groups = {QueryStatistics.class})
    @JsonView({StatisticResponse.class})
    private String payload;

    @Null(groups = {QueryStatistics.class})
    @JsonView({StatisticResponse.class})
    private String period;

    @Null(groups = {QueryStatistics.class})
    @JsonView({StatisticResponse.class})
    private String type;

    @Null(groups = {QueryStatistics.class})
    @JsonView({StatisticResponse.class})
    private String userId;

    @Null(groups = {QueryStatistics.class})
    @JsonView({StatisticResponse.class})
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public StatisticApiDTO setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StatisticApiDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getPadResultUntilToday() {
        return padResultUntilToday;
    }

    public StatisticApiDTO setPadResultUntilToday(Boolean padResultUntilToday) {
        this.padResultUntilToday = padResultUntilToday;
        return this;
    }

    public List<String> getPeriods() {
        return periods;
    }

    public StatisticApiDTO setPeriods(List<String> periods) {
        this.periods = periods;
        return this;
    }

    public String getResolution() {
        return resolution;
    }

    public StatisticApiDTO setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public List<String> getTypes() {
        return types;
    }

    public StatisticApiDTO setTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public String getPayload() {
        return payload;
    }

    public StatisticApiDTO setPayload(String payload) {
        this.payload = payload;
        return this;
    }

    public String getPeriod() {
        return period;
    }

    public StatisticApiDTO setPeriod(String period) {
        this.period = period;
        return this;
    }

    public String getType() {
        return type;
    }

    public StatisticApiDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public StatisticApiDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
