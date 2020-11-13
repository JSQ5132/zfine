package com.ykxj.zfine.config;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author JiangShengQiang
 * @date 2020/11/13 15:42
 * @desc 数据源配置类，指定MySQL数据源和clickhouse数据源
 */
@Configuration
public class DataSourceConfig {

	@Bean(name = "mysql")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.mysql") // application.yml中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "clickhouse")
    @ConfigurationProperties(prefix = "spring.datasource.clickhouse") // application.yml中对应属性的前缀
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


}
