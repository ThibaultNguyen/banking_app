package com.soprabanking.dxp.tppconnectortinkais.client.tink.pfm;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.insight.ActionableInsightResponseClientDTO;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.insight.SelectInsightActionResquestClientDTO;
import reactor.core.publisher.Mono;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.INSIGHT_ACTION;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_INSIGHTS;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface InsightClient {

    @GET(TINK_INSIGHTS)
    Mono<List<ActionableInsightResponseClientDTO>> findAll(@Header(AUTHORIZATION) String customerBearer);

    @POST(INSIGHT_ACTION)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<Response<Void>> reportAction(@Header(AUTHORIZATION) String customerBearer,
                                      @Body SelectInsightActionResquestClientDTO insightClientDto);
}
