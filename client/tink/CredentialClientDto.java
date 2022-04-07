package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.Map;

public class CredentialClientDto {

    private Map fields;

    private String callbackUri;

    private String providerName;

    private boolean triggerRefresh = true;

    public String getCallbackUri() {
        return callbackUri;
    }

    public CredentialClientDto setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }

    public Map getFields() {
        return fields;
    }

    public CredentialClientDto setFields(Map fields) {
        this.fields = fields;
        return this;
    }

    public String getProviderName() {
        return providerName;
    }

    public CredentialClientDto setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public boolean isTriggerRefresh() {
        return triggerRefresh;
    }

    public CredentialClientDto setTriggerRefresh(boolean triggerRefresh) {
        this.triggerRefresh = triggerRefresh;
        return this;
    }
}
