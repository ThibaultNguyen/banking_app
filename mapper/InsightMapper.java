package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.InsightApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Insight;
import com.soprabanking.dxp.tppconnectortinkais.model.business.InsightProposedAction;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightActionableResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.InsightsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.InsightDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.business.InsightProposedActionDto;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class InsightMapper {

    private InsightMapper() {
    }

    public static List<Insight> toEntities(InsightsResponseClientDto clientDto) {
        return clientDto.getInsightsResponse().stream().map(i -> new Insight().setInsightData(i.getInsightData())
                                                                                     .setDateArchived(i.getDateArchived())
                                                                                     .setDateInsightCreated(i.getDateInsightCreated())
                                                                                     .setDescription(i.getDescription())
                                                                                     .setId(i.getId())
                                                                                     .setTitle(i.getTitle())
                                                                                     .setType(i.getType())
                                                                                     .setUserId(i.getUserId()))
                        .collect(toList());
    }

    public static InsightApiDTO toApi(Insight insight) {
        return new InsightApiDTO().setInsightData(insight.getInsightData())
                                  .setDateArchived(insight.getDateArchived())
                                  .setDateInsightCreated(insight.getDateInsightCreated())
                                  .setDescription(insight.getDescription())
                                  .setId(insight.getId())
                                  .setTitle(insight.getTitle())
                                  .setType(insight.getType())
                                  .setUserId(insight.getUserId());
    }

    public static Insight toEntity(InsightActionableResponseClientDto clientDto) {
        return toInsight(clientDto.getInsightDto()).setAction(toActions(clientDto.getAction()));
    }

    public static Insight toEntity(InsightResponseClientDto clientDto) {
        return toInsight(clientDto.getInsightResponse());
    }

    public static Insight toEntity(InsightApiDTO input) {
        return new Insight().setInsightData(input.getInsightData())
                            .setDateArchived(input.getDateArchived())
                            .setDateInsightCreated(input.getDateInsightCreated())
                            .setDescription(input.getDescription())
                            .setId(input.getId())
                            .setTitle(input.getTitle())
                            .setType(input.getType())
                            .setUserId(input.getUserId());
    }

/*    public static InsightActionableApiDTO toApi(InsightActionableResponseClientDto input) {
        return new InsightActionableApiDTO().setAction(input.getAction());
    }*/

    public static InsightClientDto toClient(Insight entity) {
        return new InsightClientDto().setDateArchived(entity.getDateArchived())
                                     .setDateInsightCreated(entity.getDateInsightCreated())
                                     .setDescription(entity.getDescription())
                                     .setTitle(entity.getTitle())
                                     .setType(entity.getType());
    }

    private static Insight toInsight(InsightDto clientDto) {
        return new Insight().setCreatedTime(clientDto.getCreatedTime())
                            .setDateArchived(clientDto.getDateArchived())
                            .setDateInsightCreated(clientDto.getDateInsightCreated())
                            .setDescription(clientDto.getDescription())
                            .setId(clientDto.getId())
                            .setInsightData(clientDto.getInsightData())
                            .setTitle(clientDto.getTitle())
                            .setType(clientDto.getType())
                            .setUserId(clientDto.getUserId());
    }

    private static List<InsightProposedAction> toActions(List<InsightProposedActionDto> insightProposedActionDtos) {
        return insightProposedActionDtos.stream().map(a -> new InsightProposedAction().setLabel(a.getLabel()))
                                        .collect(toList());
    }
}
