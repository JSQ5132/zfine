package com.ykxj.zfine.config;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
//
//	@Bean(name = "mysql")
//    @ConfigurationProperties(prefix = "spring.datasource.mysql") // application.yml中对应属性的前缀
//    public DataSource dataSource1() {
//        return DataSourceBuilder.create().build();
//    }

    @Bean(name = "clickhouse")
    @ConfigurationProperties(prefix = "spring.datasource.clickhouse") // application.yml中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


}
