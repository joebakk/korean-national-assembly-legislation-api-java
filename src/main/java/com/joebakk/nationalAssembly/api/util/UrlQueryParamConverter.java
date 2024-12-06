package com.joebakk.nationalAssembly.api.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joebakk.nationalAssembly.api.Operation;
import okhttp3.HttpUrl;
import okhttp3.Request;

import java.util.Map;

public class UrlQueryParamConverter {
    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static Request createRequest(Operation operation, Object requestData) {
        HttpUrl.Builder builder = operation.httpUrlBuilder();
        MAPPER.convertValue(requestData, new TypeReference<Map<String, Object>>() {})
                .forEach((key, value) -> builder.addQueryParameter(key, value.toString()));
        return new Request.Builder()
                .url(builder.build())
                .build();
    }
}
