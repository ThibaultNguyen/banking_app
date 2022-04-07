package com.soprabanking.dxp.tppconnectortinkais.client;

public interface ServicesNameConstants {

    String TINK_TEST_URL = "${default.test.url.tink:}";

    String TINK_HOST = "${tink.external-service-name:api.tink.com}";

    String TPP_ASPSP_MANAGEMENT = "${service.name.tpp-service-aspsp-management:tpp-service-aspsp-management}";

    String TPP_ASPSP_MANAGEMENT_TEST_URL = "${default.test.url.tpp-service-aspsp-management:}";

    String TPP_CONSENT = "${service.name.tpp-service-customer-consent:tpp-service-customer-consent}";

    String TPP_CONSENT_TEST_URL = "${default.test.url.tpp-service-customer-consent:}";
}
