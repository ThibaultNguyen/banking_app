package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.ais.common.connector.model.api.RemittanceInformationApiDto;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator;
import com.soprabanking.dxp.ais.common.connector.model.entity.constant.TransactionStatus;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Transaction;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionResultClientDto;

import javax.money.MonetaryAmount;
import java.math.BigDecimal;

import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator.CREDIT;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.CreditDebitIndicator.DEBIT;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.TransactionStatus.BOOKED;
import static com.soprabanking.dxp.ais.common.connector.model.entity.constant.TransactionStatus.PENDING;
import static com.soprabanking.dxp.tppconnectortinkais.utils.MapperUtils.ifNotNull;
import static com.soprabanking.dxp.tppconnectortinkais.utils.MonetaryAmountMapper.toMonetaryAmount;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toOffsetDateTimeIfExists;

public class TransactionsMapper {

    private TransactionsMapper() {
    }

    public static Transaction toEntity(TransactionResultClientDto input) {
        return toEntity(input.getTransaction());
    }

    public static Transaction toEntity(TransactionClientDto input) {
        return new Transaction().setAmount(toAmount(input))
                                .setRemittanceInformation(new RemittanceInformationApiDto().setUnstructured(input.getOriginalDescription()))
                                .setBookingDateTime(toOffsetDateTimeIfExists(input.getOriginalDate()))
                                .setValueDateTime(toOffsetDateTimeIfExists(input.getOriginalDate()))
                                .setStatus(toBookedStatus(input))
                                .setId(input.getId())
                                .setCreditDebitIndicator(ifNotNull(input.getOriginalAmount(), TransactionsMapper::toSign))
                                .setCategory(CategoryMapper.toEntity(input));
    }

    private static MonetaryAmount toAmount(TransactionClientDto input) {
        return toMonetaryAmount(input.getCurrencyDenominatedAmount());
    }

    private static TransactionStatus toBookedStatus(TransactionClientDto transactionClientDto) {
        return transactionClientDto.isPending() ? PENDING : BOOKED;
    }

    private static CreditDebitIndicator toSign(BigDecimal amount) {
        return amount.signum() > 0 ? CREDIT : DEBIT;
    }
}
