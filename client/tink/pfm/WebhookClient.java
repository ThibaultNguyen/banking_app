package com.soprabanking.dxp.tppconnectortinkais.client.tink.pfm;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetDetailsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetTransactionsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetsResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.BudgetsSummariesResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGETS_SUMMARIES;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGET_DETAILS;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGET_ID;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGET_ONE_OFF;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGET_RECURRING;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.BUDGET_TRANSACTIONS;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_BUDGETS;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface WebhookClient {

    @POST(BUDGET_ONE_OFF)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<BudgetResponseClientDto> createOneOff(@Header(AUTHORIZATION) String customerBearer,
                                               @Body BudgetClientDto budgetClientDto);

    @DELETE(BUDGET_ID)
    Mono<Response<Void>> delete(@Header(AUTHORIZATION) String customerBearer,
                                @Path(value = "id") String budgetId);


    @GET(TINK_BUDGETS)
    Mono<BudgetsResponseClientDto> findAll(@Header(AUTHORIZATION) String customerBearer,
                                           @Query(value = "includeArchived") Boolean includeArchived);

}
