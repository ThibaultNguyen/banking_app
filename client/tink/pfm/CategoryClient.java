package com.soprabanking.dxp.tppconnectortinkais.client.tink.pfm;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CategoryClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;

import java.util.List;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.TINK_CATEGORIES;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface CategoryClient {

    @GET(TINK_CATEGORIES)
    Mono<List<CategoryClientDto>> listOfCategories();
}
