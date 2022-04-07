package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.BudgetApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.BudgetDetailsApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.api.BudgetPeriodApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Budget;
import com.soprabanking.dxp.tppconnectortinkais.model.business.BudgetPeriod;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetDetailsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.BudgetPeriodDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.OneOffPeriodicity;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.RecurringPeriodicity;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.enums.PeriodUnit;

import java.time.OffsetDateTime;
import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.utils.MapperUtils.toEnum;
import static com.soprabanking.dxp.tppconnectortinkais.utils.MonetaryAmountMapper.toCurrencyDenominatedAmount;
import static com.soprabanking.dxp.tppconnectortinkais.utils.MonetaryAmountMapper.toMonetaryAmount;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toOffsetDateTimeIfExists;
import static com.soprabanking.dxp.tppconnectortinkais.utils.OffsetDateTimeMapper.toTimeStampIfExist;
import static java.util.stream.Collectors.toList;

public class BudgetMapper {

    private BudgetMapper() {
    }

    public static List<Budget> toEntities(BudgetsResponseClientDto clientDto) {
        return clientDto.getBudgetSpecifications().stream().map(b -> new Budget().setBudgetAmount(toMonetaryAmount(b.getAmount()))
                                                                                 .setArchived(b.getArchived())
                                                                                 .setFilter(b.getFilter())
                                                                                 .setId(b.getId())
                                                                                 .setName(b.getName())
                                                                                 .setStartDate(mapOneOffStartPeriodicityIfExists(
                                                                                         b.getOneOffPeriodicity()))
                                                                                 .setEndDate(mapOneOffEndPeriodicityIfExists(
                                                                                         b.getOneOffPeriodicity()))
                                                                                 .setPeriodicityType(
                                                                                         b.getPeriodicityType().toString())
                                                                                 .setRecurringPeriodicity(
                                                                                         mapRecurringPeriodicityIfExists(
                                                                                                 b.getRecurringPeriodicity())))
                        .collect(toList());
    }

    public static BudgetApiDTO toApi(Budget budget) {
        return new BudgetApiDTO().setAmount(budget.getBudgetAmount())
                                 .setArchived(budget.getArchived())
                                 .setFilter(budget.getFilter())
                                 .setId(budget.getId())
                                 .setName(budget.getName())
                                 .setOneOffStartDate(budget.getStartDate())
                                 .setOneOffEndDate(budget.getEndDate())
                                 .setPeriodicityType(budget.getPeriodicityType())
                                 .setRecurringPeriodicity(budget.getRecurringPeriodicity());
    }

    public static Budget toEntity(BudgetDetailsResponseClientDto clientDto) {
        return toBudget(clientDto.getBudgetSpecification())
                .setPeriods(toPeriods(clientDto.getBudgetPeriods()))
                .setAverageSpentAmount(toMonetaryAmount(clientDto.getAverageSpentAmount()))
                .setTotalSpentAmount(toMonetaryAmount(clientDto.getTotalSpentAmount()));
    }

    public static Budget toEntity(BudgetResponseClientDto clientDto) {
        return toBudget(clientDto.getBudgetSpecification());
    }

    public static Budget toEntity(BudgetApiDTO input) {
        return new Budget().setId(input.getId())
                           .setName(input.getName())
                           .setBudgetAmount(input.getAmount())
                           .setRecurringPeriodicity(input.getRecurringPeriodicity())
                           .setPeriodicityType(input.getPeriodicityType())
                           .setStartDate(input.getOneOffStartDate())
                           .setEndDate(input.getOneOffEndDate())
                           .setFilter(input.getFilter());
    }

    public static BudgetDetailsApiDTO toApi(BudgetDetailsResponseClientDto input) {
        return new BudgetDetailsApiDTO().setAverageSpentAmount(toMonetaryAmount(input.getAverageSpentAmount()))
                                        .setPeriod(toBudgetPeriods(input.getBudgetPeriods()));
    }

    public static BudgetClientDto toClient(Budget entity) {
        return new BudgetClientDto().setAmount(toCurrencyDenominatedAmount(entity.getBudgetAmount()))
                                    .setFilter(entity.getFilter())
                                    .setName(entity.getName())
                                    .setOneOffPeriodicity(toOneOffPeriodicityIfExists(entity))
                                    .setRecurringPeriodicity(toRecurringPeriodicity(entity));
    }

    private static String mapRecurringPeriodicityIfExists(RecurringPeriodicity recurringPeriodicity) {
        return recurringPeriodicity != null ? recurringPeriodicity.getPeriodUnit().toString() : null;
    }

    private static OffsetDateTime mapOneOffEndPeriodicityIfExists(OneOffPeriodicity oneOffPeriodicity) {
        return oneOffPeriodicity != null ? toOffsetDateTimeIfExists(oneOffPeriodicity.getEnd()) : null;
    }

    private static OffsetDateTime mapOneOffStartPeriodicityIfExists(OneOffPeriodicity oneOffPeriodicity) {
        return oneOffPeriodicity != null ? toOffsetDateTimeIfExists(oneOffPeriodicity.getStart()) : null;
    }

    private static Budget toBudget(BudgetDto clientDto) {
        return new Budget().setBudgetAmount(toMonetaryAmount(clientDto.getAmount()))
                           .setArchived(clientDto.getArchived())
                           .setFilter(clientDto.getFilter())
                           .setId(clientDto.getId())
                           .setName(clientDto.getName())
                           .setStartDate(toOffsetDateTimeIfExists(clientDto.getOneOffPeriodicity().getStart()))
                           .setEndDate(toOffsetDateTimeIfExists(clientDto.getOneOffPeriodicity().getEnd()))
                           .setPeriodicityType(clientDto.getPeriodicityType().toString())
                           .setRecurringPeriodicity(mapRecurringPeriodicityIfExists(clientDto.getRecurringPeriodicity()));
    }

    private static List<BudgetPeriodApiDTO> toBudgetPeriods(List<BudgetPeriodDto> budgetPeriodDtos) {
        return budgetPeriodDtos.stream().map(r -> new BudgetPeriodApiDTO().setSpentAmount(toMonetaryAmount(r.getSpentAmount()))
                                                                          .setStartDate(
                                                                                  toOffsetDateTimeIfExists(r.getStart()))
                                                                          .setEndDate(
                                                                                  toOffsetDateTimeIfExists(r.getEnd())))
                               .collect(toList());
    }

    private static List<BudgetPeriod> toPeriods(List<BudgetPeriodDto> budgetPeriodDtos) {
        return budgetPeriodDtos.stream().map(r -> new BudgetPeriod().setSpentAmount(toMonetaryAmount(r.getSpentAmount()))
                                                                    .setStartPeriod(
                                                                            toOffsetDateTimeIfExists(r.getStart()))
                                                                    .setEndPeriod(
                                                                            toOffsetDateTimeIfExists(r.getEnd())))
                               .collect(toList());
    }

    private static OneOffPeriodicity toOneOffPeriodicityIfExists(Budget entity) {
        return entity.getStartDate() != null ? new OneOffPeriodicity().setStart(toTimeStampIfExist(entity.getStartDate()))
                                                                      .setEnd(toTimeStampIfExist(entity.getEndDate())) : null;
    }

    private static RecurringPeriodicity toRecurringPeriodicity(Budget entity) {
        return new RecurringPeriodicity().setPeriodUnit(
                toEnum(PeriodUnit.class, entity.getRecurringPeriodicity()));
    }
}
