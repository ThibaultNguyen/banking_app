package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TokenClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.UserClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.entity.Credential;
import com.soprabanking.dxp.tppconnectortinkais.model.entity.Token;

public class TokenMapper {

    private TokenMapper() {
    }

    //TODO remove the hardcoded for the local value
    public static UserClientDto toClient(Credential c) {
        return new UserClientDto().setExternalUserId(c.getUserId())
                                  .setMarket(c.getMarket())
                                  .setLocale("fr_FR");
    }

    public static Token toEntity(TokenClientDto responseClientDto) {
        return new Token().setAccessToken(responseClientDto.getAccessToken())
                          .setRefreshToken(responseClientDto.getRefreshToken());
    }

    public static Token toEntity(TokenClientDto responseClientDto, String tokenId) {
        return toEntity(responseClientDto).withId(tokenId);
    }
}
