package com.example.Parcial2.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Api Estudiante")
                            .version("1.0")
                            .description("Documentación API para gestión estudiantil")
                            .contact(new Contact()
                                    .name("Jefferson Parra")
                                    .email("jefparra31@gmail.com")));
        }
    }




