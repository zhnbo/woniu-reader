package com.woniuxy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 配置类
 * @author zh_o
 * @date: 2020-10-06
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * 接口扫描路径
     */
    public static final String SWAGGER2_SCAN_BASE_PACKAGE = "com.woniuxy.reader.controller";

    /**
     * 版本号
     */
    public static final String VERSION = "1.0.0";

    /**
     * Swagger 核心对象
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER2_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        // api 信息
       return new ApiInfoBuilder()
                .title("蜗牛阅读").description("蜗牛阅读 API 接口文档").version(VERSION)
                .contact(new Contact("zh_o", "com.woniuxy.zh_o", "private_zho@foxmail.com"))
                .build();
    }

}
