package com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.enums.PeriodUnit;

public class RecurringPeriodicity {

    private PeriodUnit periodUnit;

    public PeriodUnit getPeriodUnit() {
        return periodUnit;
    }

    public RecurringPeriodicity setPeriodUnit(PeriodUnit periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
}
