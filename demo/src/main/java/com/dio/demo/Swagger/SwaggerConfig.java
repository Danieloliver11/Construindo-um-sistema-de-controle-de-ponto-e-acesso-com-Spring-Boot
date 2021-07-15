package com.dio.demo.Swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	 @Bean
	    public Docket apiAdmin() {
	        return new Docket(DocumentationType.SWAGGER_2)
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("com.dio.demo"))
	            .paths(PathSelectors.ant("/**"))
	            .build()
	            .apiInfo(apiInfo())
	            .globalOperationParameters(
	                Collections.singletonList(
	                    new ParameterBuilder()
	                        .name("Authorization")
	                        .description("Header para Token JWT")
	                        .modelRef(new ModelRef("string"))
	                        .parameterType("header")
	                        .required(false)
	                        .build()
	                )
	            );
	    }

	    @Bean
	    public ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	            .title("bootcamp Santander Full-stack developer")
	            .description("REST API live coding")
	            .version("1.0.0")
	            .license("Apache License Version 2.0")
	            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	            .contact(new Contact("Daniel M Oliveira", "https://www.linkedin.com/in/danieloliver11/", "danielmoliveira06@gmail.com"))
	            .build();
	    }

}

//Open the web browser and type http://localhost:8081/swagger-ui.html
