package com.woniuxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:transaction.cfg.xml")
@ServletComponentScan("com.woniuxy.filter")
public class WoniuReaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoniuReaderApplication.class, args);
    }

}
