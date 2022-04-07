package com.soprabanking.dxp.tppconnectortinkais.config;

public class ProvidersQueries {

    private Boolean includeTestProviders;

    private Boolean excludeNonTestProviders;

    public Boolean getIncludeTestProviders() {
        return includeTestProviders;
    }

    public ProvidersQueries setIncludeTestProviders(Boolean includeTestProviders) {
        this.includeTestProviders = includeTestProviders;
        return this;
    }

    public Boolean getExcludeNonTestProviders() {
        return excludeNonTestProviders;
    }

    public ProvidersQueries setExcludeNonTestProviders(Boolean excludeNonTestProviders) {
        this.excludeNonTestProviders = excludeNonTestProviders;
        return this;
    }
}
