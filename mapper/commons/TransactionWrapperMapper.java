/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.mapper.commons;

import com.soprabanking.dxp.ais.common.connector.mapper.TransactionMapper;
import com.soprabanking.dxp.ais.common.connector.model.api.TransactionApiDto;
import com.soprabanking.dxp.ais.common.connector.model.api.TransactionResultApiDto;
import com.soprabanking.dxp.commons.page.Range;
import com.soprabanking.dxp.tppconnectortinkais.mapper.CategoryMapper;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Transaction;
import com.soprabanking.dxp.tppconnectortinkais.model.business.TransactionsWrapper;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionsClientDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import static java.time.LocalTime.MAX;
import static java.time.LocalTime.MIN;
import static java.time.ZoneOffset.UTC;
import static java.util.stream.Collectors.toList;

/**
 * Generic mapper that maps the common {@link TransactionResultApiDto} to an internal business object
 */
@Component
public class TransactionWrapperMapper implements TransactionMapper<TransactionsWrapper> {

    public static TransactionsClientDto toClient(Range range, String accountId,
                                                 LocalDate dateFrom,
                                                 LocalDate dateTo,
                                                 String bookedStatus,
                                                 String queryString) {
        return new TransactionsClientDto()
                .setAccounts(Collections.singletonList(accountId))
                .setStartDate(toTimeStampIfExist(dateFrom, MIN))
                .setEndDate(toTimeStampIfExist(dateTo, MAX))
                .setIncludeUpcoming("DEBIT".equals(bookedStatus))
                .setLimit(range.getPageSize())
                .setOffset(range.getOffset())
                .setQueryString(queryString)
                .setOrder("DESC")
                .setSort("DATE");
    }

    private static Long toTimeStampIfExist(LocalDate date, LocalTime localTime) {
        return date != null ? OffsetDateTime.of(date, localTime, UTC).toInstant().toEpochMilli() : null;
    }

    private static TransactionApiDto toTransactionApiDto(Transaction transaction) {
        return new TransactionApiDto().setAmount(transaction.getAmount())
                                      .setBookingDateTime(transaction.getBookingDateTime())
                                      .setCounterPartyName(transaction.getCounterPartyName())
                                      .setCounterPartyReferences(transaction.getCounterPartyReferences())
                                      .setCreditDebitIndicator(transaction.getCreditDebitIndicator())
                                      .setEndToEndIdentification(transaction.getEndToEndIdentification())
                                      .setRemittanceInformation(transaction.getRemittanceInformation())
                                      .setId(transaction.getId())
                                      .setEntryReference(transaction.getEntryReference())
                                      .setStatus(transaction.getStatus())
                                      .setCategory(CategoryMapper.toApi(transaction.getCategory()));
    }

    private static List<TransactionApiDto> toApis(List<Transaction> inputs) {
        return inputs.stream().map(TransactionWrapperMapper::toTransactionApiDto).collect(toList());
    }

    @Override
    public TransactionsWrapper toEntity(TransactionApiDto transactionApiDto) {
        return null;
    }

    @Override
    public TransactionResultApiDto toApi(TransactionsWrapper transactionsWrapper) {
        return new TransactionResultApiDto().setTransactions(toApis(transactionsWrapper.getTransactions()))
                                            .setCount(transactionsWrapper.getCount());
    }
}
