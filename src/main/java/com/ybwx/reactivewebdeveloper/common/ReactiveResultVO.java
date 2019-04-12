package com.ybwx.reactivewebdeveloper.common;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseCookie;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class ReactiveResultVO<T> implements ServerResponse {

    private Integer code;
    private String message;
    private T data;

    @Override
    public HttpStatus statusCode() {
        return null;
    }

    @Override
    public HttpHeaders headers() {
        return null;
    }

    @Override
    public MultiValueMap<String, ResponseCookie> cookies() {
        return null;
    }

    @Override
    public Mono<Void> writeTo(ServerWebExchange serverWebExchange, Context context) {
        return null;
    }
}
