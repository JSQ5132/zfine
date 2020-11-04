package com.ykxj.zfine.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"com.ykxj.zfine.dao.clickhouse"}, sqlSessionFactoryRef = "sqlSessionFactoryClickHouse")
public class MybatisClickHosueConfig {

	@Autowired
    @Qualifier("clickhouse")
    private DataSource clickhouse;

	@Bean
    public SqlSessionFactory sqlSessionFactoryClickHouse() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(clickhouse); // clickhouse

        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath*:mapper/clickhouse/*.xml"));

        return factoryBean.getObject();
    }

	@Bean
    public SqlSessionTemplate sqlSessionTemplateClickHouse() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryClickHouse()); // 使用上面配置的Factory
        return template;
    }

    @Bean
    public PlatformTransactionManager txManager(@Qualifier("clickhouse") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
