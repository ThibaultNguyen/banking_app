package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.business.WebhookEvent;

import java.util.List;

public class WebhookDto {

    private String clientId;

    private List<WebhookEventDto> events;

    private boolean global;

    private String id;

    private String secret;

    private String url;

    private String userId;

    public String getClientId() {
        return clientId;
    }

    public WebhookDto setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public List<WebhookEventDto> getEvents() {
        return events;
    }

    public WebhookDto setEvents(List<WebhookEventDto> events) {
        this.events = events;
        return this;
    }

    public boolean isGlobal() {
        return global;
    }

    public WebhookDto setGlobal(boolean global) {
        this.global = global;
        return this;
    }

    public String getId() {
        return id;
    }

    public WebhookDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public WebhookDto setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WebhookDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public WebhookDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
