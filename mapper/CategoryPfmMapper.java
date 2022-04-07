package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.api.CategoryPfmApiDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Category;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CategoryClientDto;

public class CategoryPfmMapper {

    public static CategoryPfmApiDTO toApi(Category input) {
        return new CategoryPfmApiDTO().setCode(input.getCode())
                                      .setId(input.getId())
                                      .setPrimaryName(input.getPrimaryName())
                                      .setSecondaryName(input.getSecondaryName())
                                      .setType(input.getType())
                                      .setTypeName(input.getTypeName());
    }

    public static Category toEntity(CategoryClientDto input) {
        return new Category().setCode(input.getCode())
                             .setId(input.getId())
                             .setPrimaryName(input.getPrimaryName())
                             .setSecondaryName(input.getSecondaryName())
                             .setType(input.getType())
                             .setTypeName(input.getTypeName());
    }
}
