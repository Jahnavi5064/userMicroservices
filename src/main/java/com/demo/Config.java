//package com.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//
//
//public class Config {
//	@Bean
//    public Docket sampleApi()
//    {
//    return new Docket(DocumentationType.SWAGGER_2)
//            .select()
//            //.paths(PathSelectors.any())
//           .paths(PathSelectors.regex("/.*"))
//            .apis(RequestHandlerSelectors.basePackage("com.demo.controller"))
//            .build();
//
//    }
//	private ApiInfo metaInfo() {
//		return new ApiInfoBuilder().title("Swagger Api").description("swagger demo project").build();
//		}
//
//
//
//
//
//}
