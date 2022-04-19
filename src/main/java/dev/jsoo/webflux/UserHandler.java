package dev.jsoo.webflux;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {
    public Mono<ServerResponse> getHello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(new User(request.queryParam("name").get()));
    }
}
