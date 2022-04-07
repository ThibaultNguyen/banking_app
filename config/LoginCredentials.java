package com.soprabanking.dxp.tppconnectortinkais.config;

/**
 * Properties related to the App Credentials of Tink
 */

public class LoginCredentials {

    private String clientId;

    private String clientSecret;

    private String actorClientId;

    public String getClientId() {
        return clientId;
    }

    public LoginCredentials setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public LoginCredentials setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public String getActorClientId() {
        return actorClientId;
    }

    public LoginCredentials setActorClientId(String actorClientId) {
        this.actorClientId = actorClientId;
        return this;
    }
}
