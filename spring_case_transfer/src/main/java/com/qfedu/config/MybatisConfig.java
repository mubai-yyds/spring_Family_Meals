package com.qfedu.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 10:02
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//Spring整合MyBatis
    //SqlSessionFactoryBean
    //MapperScannerConfigurer
public class MybatisConfig  {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){

        SqlSessionFactoryBean sb = new SqlSessionFactoryBean();
        sb.setTypeAliasesPackage("com.qfedu.daomain");
        sb.setDataSource(dataSource);
        return sb;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer ma = new MapperScannerConfigurer();
        ma.setBasePackage("com.qfedu.dao");
        return ma;
    }



}
