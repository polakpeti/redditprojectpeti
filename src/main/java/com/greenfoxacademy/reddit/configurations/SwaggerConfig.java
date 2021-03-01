package com.greenfoxacademy.reddit.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
@EnableScheduling

//http://localhost:8080/swagger-ui/index.html

public class SwaggerConfig {
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Reddit Project",
                "Blog manager",
                "1.0",
                "Free to use",
                new Contact("Reddit", "post a page", "polakpeti@gmail.com"),
                "Free to use", "url",
                Collections.emptyList());
    }
}