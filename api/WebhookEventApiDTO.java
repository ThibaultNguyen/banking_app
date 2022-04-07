package com.soprabanking.dxp.tppconnectortinkais.model.api;

/**
 * API representation of a
 */

public class WebhookEventApiDTO {

    private String event;

    public String getEvent() {
        return event;
    }

    public WebhookEventApiDTO setEvent(String event) {
        this.event = event;
        return this;
    }
}
