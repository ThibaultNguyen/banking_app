package com.soprabanking.dxp.tppconnectortinkais.client.tink.pfm;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CategorizeTransactionsClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SimilarTransactionsClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SuggestTransactionsClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.TransactionClientDto;
import reactor.core.publisher.Mono;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_TRANSACTIONS;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_TRANSACTIONS_CATEGORIZE;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_TRANSACTIONS_DETAILS;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_TRANSACTIONS_SIMILAR;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_TRANSACTIONS_SUGGEST;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface TransactionClient {

    @GET(TINK_TRANSACTIONS_DETAILS)
    Mono<TransactionClientDto> details(@Header(AUTHORIZATION) String customerBearer, @Path(value = "id") String transactionId);

    @GET(TINK_TRANSACTIONS_SIMILAR)
    Mono<SimilarTransactionsClientDto> similar(@Header(AUTHORIZATION) String customerBearer, @Path(value = "id") String transactionId);

    @PUT(TINK_TRANSACTIONS_CATEGORIZE)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<Response<Void>> categorize(@Header(AUTHORIZATION) String customerBearer,
                                    @Body CategorizeTransactionsClientDto categorizeTransactionsClientDto);

    @GET(TINK_TRANSACTIONS_SUGGEST)
    Mono<SuggestTransactionsClientDto> suggestRefactor(@Header(AUTHORIZATION) String customerBearer);

    // TODO : to expose later
    @PUT(TINK_TRANSACTIONS_DETAILS)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<TransactionClientDto> updateById(@Header(AUTHORIZATION) String customerBearer, @Path(value = "id") String transactionId,
                                          @Body TransactionClientDto transactionClientDto);

    // TODO : to expose later
    @PUT(TINK_TRANSACTIONS)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<List<TransactionClientDto>> update(@Header(AUTHORIZATION) String customerBearer,
                                            @Body List<TransactionClientDto> transactionsClientDto);
}
