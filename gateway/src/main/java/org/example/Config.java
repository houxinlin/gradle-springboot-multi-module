package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class Config {


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("api_route", r -> r.path("/api/**")
                        .filters(f -> f.stripPrefix(1)) // 移除一个路径段
                        .uri("http://localhost:8080"))
                .build();
    }
//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/csdn")
//                        .uri("https://blog.csdn.net"))
//                .build();
//    }
}
