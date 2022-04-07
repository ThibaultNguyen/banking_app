package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.Map;

public class CredentialRelayedClientDto {

    private Map<String, String> parameters;

    private String state;

    public Map<String, String> getParameters() {
        return parameters;
    }

    public CredentialRelayedClientDto setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public String getState() {
        return state;
    }

    public CredentialRelayedClientDto setState(String state) {
        this.state = state;
        return this;
    }
}
