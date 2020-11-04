package com.ykxj.zfine.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author JiangShengQiang
 * @date 2020/11/4 14:06
 * @desc MyBatis配置类
 */
@Configuration
@MapperScan("com.ykxj.zfine.dao") //该注解的作用：扫描改包的持久层接口，创建实现类并交给spring管理。
public class MyBatisConfig {
}
