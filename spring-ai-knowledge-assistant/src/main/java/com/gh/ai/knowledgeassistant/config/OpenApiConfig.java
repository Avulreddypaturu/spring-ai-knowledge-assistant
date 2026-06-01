package com.gh.ai.knowledgeassistant.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI knowledgeAssistantOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring AI Knowledge Assistant API")
                        .version("v1")
                        .description("Enterprise Knowledge Assistant API built with Spring Boot, Spring AI, PostgreSQL, pgvector, and RAG."));
    }
}
