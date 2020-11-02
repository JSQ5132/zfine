package com.ykxj.zfine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZfineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZfineApplication.class, args);
    }

}
