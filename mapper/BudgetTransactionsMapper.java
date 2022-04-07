package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.BudgetTransactionApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.BudgetTransaction;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetTransactionsResponseClientDto;

import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.utils.MonetaryAmountMapper.toMonetaryAmount;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toOffsetDateTimeIfExists;
import static java.util.stream.Collectors.toList;

public class BudgetTransactionsMapper {

    private BudgetTransactionsMapper() {
    }

    public static List<BudgetTransaction> toEntities(BudgetTransactionsResponseClientDto clientDto) {
        return clientDto.getTransactions().stream().map(b -> new BudgetTransaction().setId(b.getId())
                                                                                    .setAmount(toMonetaryAmount(b.getAmount()))
                                                                                    .setCategoryCode(b.getCategoryCode())
                                                                                    .setAccountId(b.getAccountId())
                                                                                    .setDate(toOffsetDateTimeIfExists(b.getDate()))
                                                                                    .setDescription(b.getDescription())
                                                                                    .setDispensableAmount(
                                                                                            toMonetaryAmount(b.getDispensableAmount())))
                        .collect(toList());
    }

    public static BudgetTransactionApiDTO toApi(BudgetTransaction entity) {
        return new BudgetTransactionApiDTO().setId(entity.getId())
                                            .setAmount(entity.getAmount())
                                            .setCategoryCode(entity.getCategoryCode())
                                            .setAccountId(entity.getAccountId())
                                            .setDate(entity.getDate())
                                            .setDescription(entity.getDescription())
                                            .setDispensableAmount(
                                                    entity.getDispensableAmount());
    }
}
