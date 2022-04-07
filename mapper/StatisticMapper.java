package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.StatisticApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Statistic;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.StatisticClientDto;

public class StatisticMapper {

    public static Statistic toEntity(StatisticApiDTO input) {
        return new Statistic().setDescription(input.getDescription())
                              .setResolution(input.getResolution())
                              .setPadResultUntilToday(input.getPadResultUntilToday())
                              .setPeriods(input.getPeriods())
                              .setTypes(input.getTypes());
    }

    public static StatisticClientDto toClient(Statistic entity) {
        return new StatisticClientDto().setDescription(entity.getDescription())
                                       .setResolution(entity.getResolution())
                                       .setPadResultUntilToday(entity.getPadResultUntilToday())
                                       .setPeriods(entity.getPeriods())
                                       .setTypes(entity.getTypes());
    }

    public static Statistic toEntity(StatisticClientDto clientDto) {
        return new Statistic().setDescription(clientDto.getDescription())
                              .setResolution(clientDto.getResolution())
                              .setPayload(clientDto.getPayload())
                              .setPeriod(clientDto.getPeriod())
                              .setType(clientDto.getType())
                              .setUserId(clientDto.getUserId())
                              .setValue(clientDto.getValue());
    }

    public static StatisticApiDTO toApi(Statistic entity) {
        return new StatisticApiDTO().setDescription(entity.getDescription())
                                    .setResolution(entity.getResolution())
                                    .setPayload(entity.getPayload())
                                    .setPeriod(entity.getPeriod())
                                    .setType(entity.getType())
                                    .setUserId(entity.getUserId())
                                    .setValue(entity.getValue());
    }
}
