package com.uce.RestApiBook.Config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Api Rest CRUD",
        version = "1.0",
        description = "This is CRUD for understand api rest"
    )
)
public class SwaggerConfig {
    
}
