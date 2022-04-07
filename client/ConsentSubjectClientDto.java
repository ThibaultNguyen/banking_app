/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.client;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject of the consent as returned by tpp-service-customer-consent
 */
public class ConsentSubjectClientDto {

    private String resourceId;

    private String iban;

    private List<String> permissions = new ArrayList<>();

    public String getResourceId() {
        return resourceId;
    }

    public ConsentSubjectClientDto setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public String getIban() {
        return iban;
    }

    public ConsentSubjectClientDto setIban(String iban) {
        this.iban = iban;
        return this;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public ConsentSubjectClientDto setPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
}
