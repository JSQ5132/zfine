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

/**
 * @author JiangShengQiang
 * @date 2020/11/13 15:46
 * @desc Mybatis的MySQL数据源配置
 */
@Configuration
@MapperScan(basePackages = {"com.ykxj.zfine.dao.mysql"}, sqlSessionFactoryRef = "sqlSessionFactoryMysql")
public class MybatisMySQLConfig {

	@Autowired
    @Qualifier("mysql")
    private DataSource mysql;

	@Bean
    public SqlSessionFactory sqlSessionFactoryMysql() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mysql); // mysql

        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
        .getResources("classpath*:com/**/mapper/mysql/*.xml"));

        return factoryBean.getObject();
    }

	@Bean
    public SqlSessionTemplate sqlSessionTemplateMysql() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactoryMysql()); // 使用上面配置的Factory
        return template;
    }

    @Bean
    public PlatformTransactionManager txManagerMysql(@Qualifier("mysql") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
