package com.example.tfexample.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(ServletContext servletContext) {
        Server server = new Server().url(servletContext.getContextPath()).description("server url");
        List<Server> servers = new ArrayList<Server>();
        servers.add(server);

        Info info = new Info()
                .title("Kyowon Development Standards Document")
                .version("v1.0.0")
                .description("교원 에듀테크개발팀 개발 표준 문서입니다.");

        return new OpenAPI()
                .components(new Components())
                .info(info)
                .servers(List.of(server));

    }
}
