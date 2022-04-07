package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.AuthorizationGrantClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TokenClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.OAUTH_AUTHORIZATION_GRANT;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.OAUTH_AUTHORIZATION_GRANT_DELEGATE;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.OAUTH_TOKEN;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.ACTOR_CLIENT_ID;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.EXTERNAL_USER_ID;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.CLIENT_ID;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.CLIENT_SECRET;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.CODE;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.GRANT_TYPE;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.REFRESH_TOKEN;
import static org.springframework.security.oauth2.core.endpoint.OAuth2ParameterNames.SCOPE;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface TokenClient {

    /*
     * Information about this endpoint can be found here : https://docs.tink.com/resources/getting-started/get-access-token
     * Please note, the validity of this endpoint is 30 min (no refresh_token is available)
     */
    @POST(OAUTH_TOKEN)
    @FormUrlEncoded
    Mono<TokenClientDto> tokenPartner(@Field(CLIENT_ID) String clientId,
                                      @Field(CLIENT_SECRET) String clientSecret,
                                      @Field(GRANT_TYPE) String grantType,
                                      @Field(SCOPE) String scope);

    /*
     * Information about this endpoint can be found here : https://docs.tink.com/resources/getting-started/retrieve-access-token
     * Please note, 24 hours validity.
     */
    @POST(OAUTH_TOKEN)
    @FormUrlEncoded
    Mono<TokenClientDto> tokenCustomer(@Field(CLIENT_ID) String clientId,
                                       @Field(CLIENT_SECRET) String clientSecret,
                                       @Field(GRANT_TYPE) String grantType,
                                       @Field(CODE) String code);

    @POST(OAUTH_TOKEN)
    @FormUrlEncoded
    Mono<TokenClientDto> refreshTokenCustomer(@Field(CLIENT_ID) String clientId,
                                       @Field(CLIENT_SECRET) String clientSecret,
                                       @Field(GRANT_TYPE) String grantType,
                                       @Field(REFRESH_TOKEN) String refrehToken);

    @POST(OAUTH_AUTHORIZATION_GRANT)
    @FormUrlEncoded
    Mono<AuthorizationGrantClientDto> fetchAuthorizationCode(@Header(AUTHORIZATION) String partnerToken,
                                                             @Field(EXTERNAL_USER_ID) String externalUserId,
                                                             @Field(SCOPE) String scope);

    @POST(OAUTH_AUTHORIZATION_GRANT_DELEGATE)
    @FormUrlEncoded
    Mono<AuthorizationGrantClientDto> delegateAuthorizationGrant(@Header(AUTHORIZATION) String partnerToken,
                                                                 @Field(ACTOR_CLIENT_ID) String actorClientId,
                                                                 @Field(EXTERNAL_USER_ID) String externalUserId,
                                                                 @Field(SCOPE) String scope);

}
