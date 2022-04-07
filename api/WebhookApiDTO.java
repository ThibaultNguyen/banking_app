package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.tppconnectortinkais.model.business.WebhookEvent;

import java.util.List;

public class WebhookApiDTO {

    private String clientId;

    private List<WebhookEvent> events;

    private boolean global;

    private String id;

    private String secret;

    private String url;

    private String userId;

    public String getClientId() {
        return clientId;
    }

    public WebhookApiDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public List<WebhookEvent> getEvents() {
        return events;
    }

    public WebhookApiDTO setEvents(List<WebhookEvent> events) {
        this.events = events;
        return this;
    }

    public boolean isGlobal() {
        return global;
    }

    public WebhookApiDTO setGlobal(boolean global) {
        this.global = global;
        return this;
    }

    public String getId() {
        return id;
    }

    public WebhookApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public WebhookApiDTO setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WebhookApiDTO setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public WebhookApiDTO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
