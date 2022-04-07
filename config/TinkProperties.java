package com.soprabanking.dxp.tppconnectortinkais.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.TINK_SETUP;

@ConfigurationProperties(TINK_SETUP)
public class TinkProperties {

    private TinkLink tinkLink;

    private ProvidersQueries providersQueries;

    private LoginCredentials loginCredentials;

    private Integer numberOfPolling;

    private Integer delayBetweenPolling;

    private String redirectUri;

    private String redirectUriPis;

    public String getRedirectUriPis() {
        return redirectUriPis;
    }

    public TinkProperties setRedirectUriPis(String redirectUriPis) {
        this.redirectUriPis = redirectUriPis;
        return this;
    }

    public TinkLink getTinkLink() {
        return tinkLink;
    }

    public TinkProperties setTinkLink(TinkLink tinkLink) {
        this.tinkLink = tinkLink;
        return this;
    }

    public ProvidersQueries getProvidersQueries() {
        return providersQueries;
    }

    public TinkProperties setProvidersQueries(ProvidersQueries providersQueries) {
        this.providersQueries = providersQueries;
        return this;
    }

    public LoginCredentials getLoginCredentials() {
        return loginCredentials;
    }

    public TinkProperties setLoginCredentials(LoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
        return this;
    }

    public Integer getNumberOfPolling() {
        return numberOfPolling;
    }

    public TinkProperties setNumberOfPolling(Integer numberOfPolling) {
        this.numberOfPolling = numberOfPolling;
        return this;
    }

    public Integer getDelayBetweenPolling() {
        return delayBetweenPolling;
    }

    public TinkProperties setDelayBetweenPolling(Integer delayBetweenPolling) {
        this.delayBetweenPolling = delayBetweenPolling;
        return this;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public TinkProperties setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
}
