package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

import com.soprabanking.dxp.commons.constants.DTO;

/**
 * API representation of a tink category
 */
public class CategoryClientDto implements DTO {

    private String id;

    private String code;

    private Boolean defaultChild;

    private String parent;

    private String primaryName;

    private String searchTerms;

    private String secondaryName;

    private Integer sortOrder;

    private String type;

    public String getId() {
        return id;
    }

    public CategoryClientDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public CategoryClientDto setCode(String code) {
        this.code = code;
        return this;
    }

    public Boolean getDefaultChild() {
        return defaultChild;
    }

    public CategoryClientDto setDefaultChild(Boolean defaultChild) {
        this.defaultChild = defaultChild;
        return this;
    }

    public String getParent() {
        return parent;
    }

    public CategoryClientDto setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getPrimaryName() {
        return primaryName;
    }

    public CategoryClientDto setPrimaryName(String primaryName) {
        this.primaryName = primaryName;
        return this;
    }

    public String getSearchTerms() {
        return searchTerms;
    }

    public CategoryClientDto setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
        return this;
    }

    public String getSecondaryName() {
        return secondaryName;
    }

    public CategoryClientDto setSecondaryName(String secondaryName) {
        this.secondaryName = secondaryName;
        return this;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public CategoryClientDto setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getType() {
        return type;
    }

    public CategoryClientDto setType(String type) {
        this.type = type;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public CategoryClientDto setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    private String typeName;
}
