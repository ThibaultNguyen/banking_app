/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.model.client;

import com.soprabanking.dxp.ais.common.connector.model.api.enums.ConsentStatus;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Consent object as retrieved from Tpp-Service-customer-Consent
 */
public class ConsentClientDto {

    private String id;

    private String psuId;

    private String aspspId;

    private OffsetDateTime validityDate;

    private OffsetDateTime signingDate;

    private List<ConsentSubjectClientDto> subjects;

    private ConsentStatus authorisationStatus;

    public String getId() {
        return id;
    }

    public ConsentClientDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getPsuId() {
        return psuId;
    }

    public ConsentClientDto setPsuId(String psuId) {
        this.psuId = psuId;
        return this;
    }

    public String getAspspId() {
        return aspspId;
    }

    public ConsentClientDto setAspspId(String aspspId) {
        this.aspspId = aspspId;
        return this;
    }

    public OffsetDateTime getValidityDate() {
        return validityDate;
    }

    public ConsentClientDto setValidityDate(OffsetDateTime validityDate) {
        this.validityDate = validityDate;
        return this;
    }

    public OffsetDateTime getSigningDate() {
        return signingDate;
    }

    public ConsentClientDto setSigningDate(OffsetDateTime signingDate) {
        this.signingDate = signingDate;
        return this;
    }

    public List<ConsentSubjectClientDto> getSubjects() {
        return subjects;
    }

    public ConsentClientDto setSubjects(List<ConsentSubjectClientDto> subjects) {
        this.subjects = subjects;
        return this;
    }

    public ConsentStatus getAuthorisationStatus() {
        return authorisationStatus;
    }

    public ConsentClientDto setAuthorisationStatus(ConsentStatus authorisationStatus) {
        this.authorisationStatus = authorisationStatus;
        return this;
    }

    @Override
    public String toString() {
        return "ConsentClientDto{" +
               "id='" + id + '\'' +
               ", psuId='" + psuId + '\'' +
               ", aspspId='" + aspspId + '\'' +
               ", validityDate=" + validityDate +
               ", signingDate=" + signingDate +
               ", subjects=" + subjects +
               ", authorisationStatus=" + authorisationStatus +
               '}';
    }
}