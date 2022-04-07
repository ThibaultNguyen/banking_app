package com.soprabanking.dxp.tppconnectortinkais.model.client.tink;

public class CurrencyDenominatedAmount {

    private Long unscaledValue;

    private Integer scale;

    private String currencyCode;

    public Long getUnscaledValue() {
        return unscaledValue;
    }

    public CurrencyDenominatedAmount setUnscaledValue(Long unscaledValue) {
        this.unscaledValue = unscaledValue;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public CurrencyDenominatedAmount setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public Integer getScale() {
        return scale;
    }

    public CurrencyDenominatedAmount setScale(Integer scale) {
        this.scale = scale;
        return this;
    }

}
