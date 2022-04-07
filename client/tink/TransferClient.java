package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SignableOperationClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransferClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TRANSFER;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TRANSFER_DETAIL;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface TransferClient {

    @POST(TRANSFER)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<SignableOperationClientDto> create(@Header(AUTHORIZATION) String customerToken, @Body TransferClientDto transferClientDto);

    @GET(TRANSFER_DETAIL)
    Mono<SignableOperationClientDto> retrieveSigningStatus(@Header(AUTHORIZATION) String customerToken, @Path(value = "id") String id);
}
