package com.soprabanking.dxp.tppconnectortinkais.config;

public class TinkLink {

    private boolean enabled;

    boolean iFrame;

    boolean testProvider;

    public boolean isEnabled() {
        return enabled;
    }

    public TinkLink setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean isiFrame() {
        return iFrame;
    }

    public TinkLink setiFrame(boolean iFrame) {
        this.iFrame = iFrame;
        return this;
    }

    public boolean isTestProvider() {
        return testProvider;
    }

    public TinkLink setTestProvider(boolean testProvider) {
        this.testProvider = testProvider;
        return this;
    }
}
