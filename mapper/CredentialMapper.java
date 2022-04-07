package com.soprabanking.dxp.tppconnectortinkais.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.soprabanking.dxp.commons.error.DxpSbsFeedback;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialRelayedClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.CredentialResponseClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SignableOperationClientDto;
import com.soprabanking.dxp.tppconnectortinkais.model.client.tink.SupplementaryInformation;
import com.soprabanking.dxp.tppconnectortinkais.model.entity.Credential;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.soprabanking.dxp.commons.error.DxpBusinessCode.INVALID_CONTENT;

public class CredentialMapper {

    private static final Logger LOGGER = LoggerFactory.getLogger(CredentialMapper.class);

    private static final String REGEX = "state=([^&]*)";

    private CredentialMapper() {
    }

    public static CredentialClientDto toClient(Credential credential) {
        return new CredentialClientDto().setCallbackUri(credential.getCallBackUri())
                                        .setFields(Collections.emptyMap())
                                        .setProviderName(credential.getProviderName());
    }

    public static CredentialRelayedClientDto toClientRelayed(Credential credential) {
        return new CredentialRelayedClientDto().setParameters(toParameterMap(credential))
                                               .setState(credential.getState());
    }

    public static Credential toEntity(CredentialResponseClientDto clientDto) {
        return new Credential().setCredentialId(clientDto.getId())
                               .setProviderName(clientDto.getProviderName());
    }

    public static Credential toEntity(CredentialResponseClientDto responseClientDto, ObjectMapper objectMapper, Credential credential) {
        String redirectUrl = extractRedirectUrlIfExists(responseClientDto.getSupplementalInformation(), objectMapper);
        return credential.setStatus(responseClientDto.getStatus())
                         .setRedirectUrl(redirectUrl)
                         .setState(extractStateIfExists(redirectUrl));
    }

    public static Credential toCredential(SignableOperationClientDto clientDto) {
        return new Credential().setCredentialId(clientDto.getCredentialsId())
                               .setExternalResourceId(clientDto.getUnderlyingId())
                               .setCreationTime(clientDto.getCreated());
    }

    private static String extractRedirectUrlIfExists(String jsonString, ObjectMapper objectMapper) {
        return Objects.nonNull(jsonString) ?
                jsonDeserialize(jsonString, objectMapper, SupplementaryInformation.class).getDesktop().getUrl() : null;

    }

    private static Map<String, String> toParameterMap(Credential credential) {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("code", credential.getCode());
        return parameters;
    }

    private static String extractStateIfExists(String redirectUrl) {
        if (StringUtils.isEmpty(redirectUrl)) {
            return null;
        }
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(redirectUrl);
        return matcher.find() ? matcher.group(1) : null;
    }

    private static <T> T jsonDeserialize(String data, ObjectMapper objectMapper, Class<T> objType) {
        try {
            return objectMapper.readValue(data, objType);
        } catch (Exception e) {
            throw new DxpSbsFeedback("Impossible to deserialize - Redirect URL not extracted", INVALID_CONTENT, LOGGER::warn).toException();
        }
    }
}
