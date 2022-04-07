package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

public class WebhookEventDto {

    private String event;

    public String getEvent() {
        return event;
    }

    public WebhookEventDto setEvent(String event) {
        this.event = event;
        return this;
    }
}
