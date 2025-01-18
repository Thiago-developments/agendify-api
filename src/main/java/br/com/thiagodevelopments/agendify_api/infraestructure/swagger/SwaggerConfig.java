package br.com.thiagodevelopments.agendify_api.infraestructure.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Agendify API")
                        .version("1.0.0")
                        .description("Esta API permite o agendamento e controle de transferências"));
    }
}
