package com.soprabanking.dxp.tppconnectortinkais.client.tink;

import com.soprabanking.dxp.commons.client.config.External;
import com.soprabanking.dxp.commons.client.config.RetrofitClient;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.PaymentRequestClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SessionClientDto;
import reactor.core.publisher.Mono;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_HOST;
import static com.soprabanking.dxp.tppconnectortinkais.client.ServicesNameConstants.TINK_TEST_URL;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.PAYMENT_REQUEST;
import static com.soprabanking.dxp.tppconnectortinkais.client.UriConstants.SESSION;
import static com.soprabanking.dxp.tppconnectortinkais.constants.Constants.CONTENT_TYPE_APPLICATION_JSON;
import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@External
@RetrofitClient(value = TINK_HOST, url = TINK_TEST_URL)
public interface PaymentRequestClient {

    @POST(PAYMENT_REQUEST)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<PaymentRequestClientDto> create(@Header(AUTHORIZATION) String customerToken,
                                         @Body PaymentRequestClientDto paymentRequestClientDto);

    @POST(SESSION)
    @Headers(CONTENT_TYPE_APPLICATION_JSON)
    Mono<SessionClientDto> setSession(@Header(AUTHORIZATION) String partnerToken,
                                      @Body SessionClientDto sessionClientDto);
}
