package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.ais.common.connector.model.api.BalanceApiDto;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Balance;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import java.math.BigDecimal;
import java.util.List;

import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.BalanceType.OPENING_BOOKED;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator.CREDIT;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator.DEBIT;
import static com.soprabanking.dxp.tppconnectortinkais.utils.MapperUtils.ifNotNull;
import static java.util.Collections.singletonList;

public class BalanceMapper {

    private BalanceMapper() {
    }

    public static Balance toEntity(String amount, String currency) {
        return new Balance().setCreditDebitIndicator(toSign(toMonetaryAmount(amount, currency)))
                            .setAmount(toMonetaryAmount(amount, currency));
    }

    public static Balance toEntity(MonetaryAmount balance) {
        return new Balance().setCreditDebitIndicator(toSign(balance))
                            .setAmount(balance);
    }

    public static List<BalanceApiDto> toApiList(Balance balance) {
        return singletonList(toApi(balance));
    }

    public static BalanceApiDto toApi(Balance balance) {
        return new BalanceApiDto().setAmount(balance.getAmount())
                                  .setType(OPENING_BOOKED)
                                  .setCreditDebitIndicator(ifNotNull(balance.getAmount(), BalanceMapper::toSign));
    }

    private static MonetaryAmount toMonetaryAmount(String amount, String currency) {
        return Money.of(new BigDecimal(amount), currency);
    }

    private static CreditDebitIndicator toSign(MonetaryAmount amount) {
        return amount.isNegative() ? DEBIT : CREDIT;
    }
}
