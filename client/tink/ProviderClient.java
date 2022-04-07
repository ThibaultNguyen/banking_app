package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.ProvidersResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.MARKET;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.PROVIDERS;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface ProviderClient {

    @GET(PROVIDERS)
    Mono<ProvidersResponseClientDto> findProviders(
            @Header(AUTHORIZATION) String bearer, @Query("name") String name,
            @Query(value = "includeTestProviders") Boolean includeTestProviders,
            @Query(value = "excludeNonTestProviders") Boolean excludeNonTestProviders);

    @GET(PROVIDERS + MARKET)
    Mono<ProvidersResponseClientDto> findProviders(@Path(value = "market") String market);

}
