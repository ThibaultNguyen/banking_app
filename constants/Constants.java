package com.soprabanking.dxp.tppconnectortinkais.constants;

public interface Constants {

    String CONTENT_TYPE_APPLICATION_JSON = "Content-Type: application/json";

    String EXTERNAL_USER_ID = "external_user_id";

    String ACTOR_CLIENT_ID = "actor_client_id";

    String PARTNER_SCOPE = "user:create,authorization:grant,link-session:write";

    String CUSTOMER_SCOPE = "accounts:read,transactions:read,user:read,"
                            + "credentials:read,credentials:refresh,credentials:write,"
                            + "transfer:read,transfer:execute,"
                            + "payment:write,payment:read,"
                            + "budgets:read,budgets:write,"
                            + "statistics:read,"
                            + "transactions:categorize";

    String AIS_TINK_LINK_SCOPE = "accounts:read,transactions:read,user:read,"
                                 + "credentials:read,credentials:refresh,credentials:write,"
                                 + "transfer:read,transfer:execute,"
                                 + "payment:write,payment:read";

    String DELEGATE_SCOPE = "authorization:read,user:read,credentials:read,credentials:write,credentials:refresh," +
                            "providers:read," +
                            "payment:read," +
                            "transfer:read,transfer:execute," +
                            "link-session:read";

    String TINK_SETUP = "tink-setup";

    String AWAITING_THIRD_PARTY_APP_AUTHENTICATION = "AWAITING_THIRD_PARTY_APP_AUTHENTICATION";

    String UPDATED = "UPDATED";

    String PARTNER_TOKEN_CACHE_NAME = "partner-tokens";

    String CUSTOMER_ACCESS_TOKEN_CACHE_NAME = "customer-access-tokens";

    String CUSTOMER_REFRESH_TOKEN_CACHE_NAME = "customer-refresh-tokens";

    String BEARER = "Bearer ";

    int MAX_TRANSACTIONS_RESULTS = 1000;

    String TRANSFER_IBAN = "iban://";

    String COUNTRY_CODE = "countryCode";
}
