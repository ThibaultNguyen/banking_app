package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.CategoryPfmApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.SuggestTransactionsApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.TransactionClusterApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.TransactionPfmApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Category;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Transaction;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SuggestTransactionsClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.TransactionCluster;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class TransactionsPfmMapper {

    private TransactionsPfmMapper() {
    }

    public static SuggestTransactionsApiDTO toApi(SuggestTransactionsClientDto clientDto) {
        return new SuggestTransactionsApiDTO().setCategorizationImprovement(clientDto.getCategorizationImprovement())
                                              .setCategorizationLevel(clientDto.getCategorizationLevel())
                                              .setClusters(toTransactionCluster(clientDto.getClusters()))
                                              .setNumberOfClusters(clientDto.getNumberOfClusters())
                                              .setNumberOfUncategorizedTransactions(clientDto.getNumberOfUncategorizedTransactions())
                                              .setNumberOfTransactions(clientDto.getNumberOfTransactions());
    }

    public static TransactionPfmApiDTO toApi(Transaction transaction) {
        return new TransactionPfmApiDTO().setAmount(transaction.getAmount())
                                         .setRemittanceInformation(transaction.getRemittanceInformation())
                                         .setBookingDateTime(transaction.getBookingDateTime())
                                         .setValueDateTime(transaction.getValueDateTime())
                                         .setStatus(transaction.getStatus())
                                         .setId(transaction.getId())
                                         .setCreditDebitIndicator(transaction.getCreditDebitIndicator())
                                         .setCategory(toPfmCategory(transaction.getCategory()));
    }

    private static CategoryPfmApiDTO toPfmCategory(Category category) {
        return new CategoryPfmApiDTO().setCode(category.getCode())
                                      .setSecondaryName(category.getSecondaryName())
                                      .setId(category.getId())
                                      .setPrimaryName(category.getPrimaryName())
                                      .setType(category.getType())
                                      .setTypeName(category.getTypeName());
    }

    public static Transaction toEntity(TransactionPfmApiDTO transactionPfmApiDTO) {
        return new Transaction();
    }

    private static List<TransactionClusterApiDTO> toTransactionCluster(List<TransactionCluster> clusters) {
        return clusters.stream().map(x -> new TransactionClusterApiDTO().setCategorizationImprovement(x.getCategorizationImprovement())
                                                                        .setDescription(x.getDescription())
                                                                        .setTransactions(x.getTransactions()
                                                                                          .stream()
                                                                                          .map(t -> toApi(TransactionsMapper.toEntity(t)))
                                                                                          .collect(toList()))).collect(
                toList());
    }
}
