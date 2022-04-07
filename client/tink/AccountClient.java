package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.AccountsResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;
import retrofit2.http.Header;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.ACCOUNTS_LIST;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface AccountClient {

    @GET(ACCOUNTS_LIST)
    Mono<AccountsResponseClientDto> findAccounts(@Header(AUTHORIZATION) String customerToken);
}
