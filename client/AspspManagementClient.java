/**
 * Copyright (c) 2012, 2019, Sopra Banking Software and/or its affiliates.
 * All rights reserved.
 * SOPRA BANKING SOFTWARE PROPRIETARY/CONFIDENTIAL.
 * Use is subject to license terms.
 * https://constellation.soprasteria.com/confluence2/display/TECARCH/EvoTA+License
 */
package com.soprabanking.dxp.tppconnectortinkais.client;

import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.AspspManagementStandardResponseClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TPP_ASPSP_MANAGEMENT;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TPP_ASPSP_MANAGEMENT_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.ASPSP_ID;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.ASPSP_MANAGEMENT_STANDARD;

/**
 * Retrofit client for aspsp information from TPP-ASPSP_Management
 */
@RetrofitClient(value = TPP_ASPSP_MANAGEMENT, url = TPP_ASPSP_MANAGEMENT_TEST_URL)
public interface AspspManagementClient {

    @GET(ASPSP_MANAGEMENT_STANDARD)
    Mono<AspspManagementStandardResponseClientDto> findStandardById(@Path(ASPSP_ID) String aspspId);
}