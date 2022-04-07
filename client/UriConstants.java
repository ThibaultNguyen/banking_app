package com.soprabanking.dxp.tppconnectortinkais.client;

import static com.soprabanking.dxp.commons.api.ApiConstants.ID_PATH;

public interface UriConstants {

    String CONSENT = "api/consents/{consentId}";

    String ASPSP_MANAGEMENT_STANDARD = "api/aspsps/{aspspId}/standard";

    String ASPSP_ID = "aspspId";

    String USERS_CREATE = "api/v1/user/create";

    String PROVIDERS = "api/v1/providers";

    String EXTERNAL_ASPSP = "/api/external-aspsps";

    String BUDGETS = "/api/budgets";

    String BUDGETS_TRANSACTIONS = ID_PATH + "/transactions";

    String TINK_BUDGETS = "api/v1/budgets";

    String BUDGET_ID = TINK_BUDGETS + "/{id}";

    String BUDGET_DETAILS = BUDGET_ID + "/details";

    String BUDGET_TRANSACTIONS = BUDGET_ID + "/transactions";

    String BUDGET_RECURRING = TINK_BUDGETS + "/recurring";

    String BUDGET_ONE_OFF = TINK_BUDGETS + "/one-off";

    String MARKET = "/{market}";

    String OAUTH_TOKEN = "api/v1/oauth/token";

    String BUDGETS_SUMMARIES = TINK_BUDGETS + "/summaries";

    String OAUTH_AUTHORIZATION_GRANT = "/api/v1/oauth/authorization-grant";

    String CREDENTIALS = "api/v1/credentials";

    String CREDENTIALS_DETAIL = "api/v1/credentials/{credentialId}";

    String CREDENTIALS_REFRESH = "api/v1/credentials/{credentialId}/refresh";

    String CREDENTIALS_THIRD_PARTY_RELAYED = "api/v1/credentials/third-party/callback/relayed";

    String ACCOUNTS_LIST = "api/v1/accounts/list";

    String TRANSFER = "api/v1/transfer";

    String PAYMENT_REQUEST = "/api/v1/payments/requests";

    String SESSION = "/link/v1/session";

    String TRANSFER_DETAIL = "api/v1/transfer/{id}/status";

    String SEARCH_TRANSACTIONS = "api/v1/search";

    String OAUTH_AUTHORIZATION_GRANT_DELEGATE = "api/v1/oauth/authorization-grant/delegate";

    String STATISTICS = "/api/statistics";

    String CATEGORIES = "/api/categories";

    String TINK_CATEGORIES = "api/v1/categories";

    String TINK_STATISTICS = "api/v1/statistics/query";

    String TINK_TRANSACTIONS = "api/v1/transactions";

    String TRANSACTION_ID = "/{id}";

    String CATEGORIZE_MULTIPLE = "/categorize-multiple";

    String TINK_TRANSACTIONS_CATEGORIZE = TINK_TRANSACTIONS + CATEGORIZE_MULTIPLE;

    String SUGGEST = "/suggest";

    String TINK_TRANSACTIONS_SUGGEST = TINK_TRANSACTIONS + SUGGEST;

    String TINK_TRANSACTIONS_DETAILS = TINK_TRANSACTIONS + TRANSACTION_ID;

    String SIMILAR = "/similar";

    String TINK_TRANSACTIONS_SIMILAR = TINK_TRANSACTIONS + TRANSACTION_ID + SIMILAR;

    String TRANSACTIONS = "/api/transactions";
    String INSIGHTS = "/api/insights";

    String TINK_INSIGHTS = "api/v1/insights";

    String INSIGHT_ARCHIVED = TINK_INSIGHTS + "/archived";

    String INSIGHT_ACTION = TINK_INSIGHTS + "/action";

    String INSIGHT_ID = TINK_INSIGHTS + "/{id}";
}
