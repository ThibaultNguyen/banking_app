package com.soprabanking.dxp.tppconnectortinkais.model.api;

import com.soprabanking.dxp.commons.constants.DTO;

/**
 * API representation of a tink category
 */
public class CategoryPfmApiDTO implements DTO {

    private String id;

    private String code;

    private String primaryName;

    private String secondaryName;

    private String type;

    private String typeName;

    public String getId() {
        return id;
    }

    public CategoryPfmApiDTO setId(String id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CategoryPfmApiDTO setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public CategoryPfmApiDTO setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
        return this;
    }

    public String getSecondaryName() {
        return secondaryName;
    }

    public CategoryPfmApiDTO setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
        return this;
    }

    public String getType() {
        return type;
    }

    public CategoryPfmApiDTO setType(String type) {
        this.type = type;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public CategoryPfmApiDTO setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

}
