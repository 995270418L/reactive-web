package com.ybwx.reactivewebdeveloper.handler;

import com.ybwx.reactivewebdeveloper.bean.Person;
import com.ybwx.reactivewebdeveloper.common.ReactiveResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class ReactiveMachineHandler {

    /**
     * path variable and request parameter retrieve .
     * @param request
     * @return
     */
    public Mono<ReactiveResultVO<?>> machineModel(final ServerRequest request){
        String agentId = request.pathVariable("id");
        Integer port = (Integer) request.attribute("port").orElse(null);
        log.info("agent_id : {}, port: {}", agentId, port);
        return ServerResponse.ok().body(Mono.create(new Person("steve","steve","steve@qq.com")));
    }
}
