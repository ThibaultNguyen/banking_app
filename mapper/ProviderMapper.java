package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.ExternalAspspApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.ExternalAspsp;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.ProviderClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.ProvidersResponseClientDto;

import java.util.List;
import java.util.stream.Collectors;

public class ProviderMapper {

    private ProviderMapper() {
    }

    public static ExternalAspspApiDTO toApi(ExternalAspsp externalAspsp) {
        return new ExternalAspspApiDTO().setAccessType(externalAspsp.getAccessType())
                                        .setCountryCode(externalAspsp.getCountryCode())
                                        .setExternalGroupId(externalAspsp.getExternalGroupId())
                                        .setExternalNameId(externalAspsp.getExternalNameId())
                                        .setLabel(externalAspsp.getLabel())
                                        .setLogo(externalAspsp.getLogo())
                                        .setStatus(externalAspsp.getStatus());
    }

    public static List<ExternalAspsp> toEntities(ProvidersResponseClientDto clientDto) {
        return clientDto.getProviders().stream().map(ProviderMapper::toEntity).collect(Collectors.toList());
    }

    public static ExternalAspsp toEntity(ProviderClientDto clientDto) {
        return new ExternalAspsp().setAccessType(clientDto.getAccessType())
                                  .setCountryCode(clientDto.getMarket())
                                  .setExternalGroupId(clientDto.getGroupDisplayName())
                                  .setExternalNameId(clientDto.getName())
                                  .setLabel(clientDto.getDisplayName())
                                  .setLogo(clientDto.getImages().getIcon())
                                  .setStatus(clientDto.getStatus());
    }
}
