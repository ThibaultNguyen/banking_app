package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import java.util.Map;

public class CredentialResponseClientDto {

    private String id;

    private String appUri;

    private String providerName;

    private String type;

    private String status;

    private Long sessionExpiryDate;

    private Map<String, Object> fields;

    private String supplementalInformation;

    private String userId;

    public String getAppUri() {
        return appUri;
    }

    public CredentialResponseClientDto setAppUri(String appUri) {
        this.appUri = appUri;
        return this;
    }

    public String getId() {
        return id;
    }

    public CredentialResponseClientDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getProviderName() {
        return providerName;
    }

    public CredentialResponseClientDto setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public String getType() {
        return type;
    }

    public CredentialResponseClientDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CredentialResponseClientDto setStatus(String status) {
        this.status = status;
        return this;
    }

    public Long getSessionExpiryDate() {
        return sessionExpiryDate;
    }

    public CredentialResponseClientDto setSessionExpiryDate(Long sessionExpiryDate) {
        this.sessionExpiryDate = sessionExpiryDate;
        return this;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public CredentialResponseClientDto setFields(Map<String, Object> fields) {
        this.fields = fields;
        return this;
    }

    public String getSupplementalInformation() {
        return supplementalInformation;
    }

    public CredentialResponseClientDto setSupplementalInformation(String supplementalInformation) {
        this.supplementalInformation = supplementalInformation;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CredentialResponseClientDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}