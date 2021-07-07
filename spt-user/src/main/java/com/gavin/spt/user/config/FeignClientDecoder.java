package com.gavin.spt.user.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.FeignException;
import feign.Response;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public class FeignClientDecoder extends SpringDecoder {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public FeignClientDecoder(ObjectFactory<HttpMessageConverters> messageConverters) {
        super(messageConverters);
    }

    @Override
    public Object decode(Response response, Type type) throws IOException, FeignException {
        String result = response.body().toString();
        if (type instanceof Class && !StringUtils.isEmpty(result)) {
            Response build = Response.builder()
                    .body(new ObjectMapper().writeValueAsString(objectMapper.readValue(result, (Class<? extends Object>) type)), Charset.defaultCharset())
                    .headers(response.headers())
                    .reason(response.reason())
                    .status(response.status())
                    .request(response.request())
                    .build();
            return super.decode(build, type);
        }
        return super.decode(response, type);
    }
}
