package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialRelayedClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.UserClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.UserResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.CREDENTIALS;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.CREDENTIALS_DETAIL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.CREDENTIALS_REFRESH;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.CREDENTIALS_THIRD_PARTY_RELAYED;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.USERS_CREATE;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface UserManagementClient {

    @POST(USERS_CREATE)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<Response<UserResponseClientDto>> createUser(@Header(AUTHORIZATION) String bearer, @Body UserClientDto user);

    @POST(CREDENTIALS)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<CredentialResponseClientDto> createCredential(@Header(AUTHORIZATION) String customerBearer, @Body CredentialClientDto credential);

    @GET(CREDENTIALS_DETAIL)
    Mono<CredentialResponseClientDto> retrieveCredential(@Header(AUTHORIZATION) String customerBearer,
                                                         @Path(value = "credentialId") String credentialId);

    @GET(CREDENTIALS)
    Mono<List<CredentialResponseClientDto>> retrieveCredentials(@Header(AUTHORIZATION) String customerBearer);

    @DELETE(CREDENTIALS_DETAIL)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<Response<Void>> deleteCredential(@Header(AUTHORIZATION) String customerBearer,
                                          @Path(value = "credentialId") String credentialId);

    @POST(CREDENTIALS_THIRD_PARTY_RELAYED)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<CredentialResponseClientDto> relayedCredential(@Header(AUTHORIZATION) String customerBearer,
                                                        @Body CredentialRelayedClientDto credentialRelayed);

    @POST(CREDENTIALS_REFRESH)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<Response<Void>> refreshCredential(@Header(AUTHORIZATION) String customerBearer,
                                           @Path(value = "credentialId") String credentialId,
                                           @Body CredentialClientDto credentialClientDto);
}
