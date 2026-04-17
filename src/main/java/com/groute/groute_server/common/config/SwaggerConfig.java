package com.groute.groute_server.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("GLIT API")
                        .description("GLIT 백엔드 API 문서")
                        .version("v1.0.0"));
    }

    @Bean
    public GroupedOpenApi authApi() {
        return GroupedOpenApi.builder()
                .group("Auth")
                .packagesToScan("com.groute.groute_server.auth")
                .build();
    }

    @Bean
    public GroupedOpenApi calendarApi() {
        return GroupedOpenApi.builder()
                .group("Calendar")
                .packagesToScan("com.groute.groute_server.calendar")
                .build();
    }

    @Bean
    public GroupedOpenApi homeApi() {
        return GroupedOpenApi.builder()
                .group("Home")
                .packagesToScan("com.groute.groute_server.home")
                .build();
    }

    @Bean
    public GroupedOpenApi recordApi() {
        return GroupedOpenApi.builder()
                .group("Record")
                .packagesToScan("com.groute.groute_server.record")
                .build();
    }

    @Bean
    public GroupedOpenApi reportApi() {
        return GroupedOpenApi.builder()
                .group("Report")
                .packagesToScan("com.groute.groute_server.report")
                .build();
    }

    @Bean
    public GroupedOpenApi userApi() {
        return GroupedOpenApi.builder()
                .group("User")
                .packagesToScan("com.groute.groute_server.user")
                .build();
    }
}
