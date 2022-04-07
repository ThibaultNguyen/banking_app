/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

import javax.validation.constraints.NotBlank;

/**
 * API representation of an Aspsp
 */
public class ExternalAspspApiDTO implements DTO {

    @NotBlank
    private String accessType;

    @NotBlank
    private String label;

    @NotBlank
    private String externalGroupId;

    private String countryCode;

    @NotBlank
    private String externalNameId;

    private String status;

    private String logo;

    public String getAccessType() {
        return accessType;
    }

    public ExternalAspspApiDTO setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public ExternalAspspApiDTO setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getExternalGroupId() {
        return externalGroupId;
    }

    public ExternalAspspApiDTO setExternalGroupId(String externalGroupId) {
        this.externalGroupId = externalGroupId;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public ExternalAspspApiDTO setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getExternalNameId() {
        return externalNameId;
    }

    public ExternalAspspApiDTO setExternalNameId(String externalNameId) {
        this.externalNameId = externalNameId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ExternalAspspApiDTO setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public ExternalAspspApiDTO setLogo(String logo) {
        this.logo = logo;
        return this;
    }


}
