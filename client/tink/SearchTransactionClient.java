package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionsClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionsResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.SEARCH_TRANSACTIONS;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface SearchTransactionClient {

    @POST(SEARCH_TRANSACTIONS)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<TransactionsResponseClientDto> searchTransactions(@Header(AUTHORIZATION) String customerToken,
                                                           @Body TransactionsClientDto transactionsClientDto);
}
