package com.example.demo.config;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.diogo.restapi"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo((metaInfo()));
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Lista Project API REST",
                "API REST de cadastro de projetos.",
                "1.0",
                "Terms of Service",
                new Contact("Diogo Barbosa", "https://www.linkedin.com/in/diogobarbosa22/",
                        "diibarbosa22@gmail.com"),
                "Apache License Version 2.0",
                "hhtps://www.apache.org/license.html", new ArrayList<VendorExtension>()
        );
        return apiInfo;
    };


}
