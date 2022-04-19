import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;


import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class Router {
    @Bean
    public RouterFunction<ServerResponse> userRouter(UserHandler handler) {
        return route().GET("/hello", accept(MediaType.APPLICATION_FORM_URLENCODED), handler::getHello).build();
    }
}
