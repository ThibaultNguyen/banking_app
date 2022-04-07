package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.ais.common.connector.model.api.CategoryApiDto;
import com.soprabanking.dxp.tppconnectortinkais.model.business.Category;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionClientDto;

public class CategoryMapper {

    public static CategoryApiDto toApi(Category input) {
        return new CategoryApiDto().setId(input.getId())
                                   .setName(input.getName())
                                   .setType(input.getType())
                                   .setTypeName(input.getTypeName());
    }

    public static Category toEntity(TransactionClientDto input) {
        return new Category().setId(input.getCategoryId())
                             .setType(input.getCategoryType());
    }
}
