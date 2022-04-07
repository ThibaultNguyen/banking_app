package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(SnakeCaseStrategy.class)
public class AuthorizationGrantClientDto {

    private String code;

    public String getCode() {
        return code;
    }

    public AuthorizationGrantClientDto setCode(String code) {
        this.code = code;
        return this;
    }
}