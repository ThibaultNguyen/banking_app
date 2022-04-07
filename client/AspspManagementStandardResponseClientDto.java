/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.client;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

/**
 * ASPSP Standard Information
 */
public class AspspManagementStandardResponseClientDto {

    public String externalId;

    private String name;

    private String url;

    private Map<String, String> specifics;

    public String getExternalId() {
        return externalId;
    }

    public AspspManagementStandardResponseClientDto setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AspspManagementStandardResponseClientDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AspspManagementStandardResponseClientDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public Map<String, String> getSpecifics() {
        return specifics;
    }

    public AspspManagementStandardResponseClientDto setSpecifics(Map<String, String> specifics) {
        this.specifics = specifics;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("url", url)
                .append("specifics", specifics)
                .toString();
    }
}