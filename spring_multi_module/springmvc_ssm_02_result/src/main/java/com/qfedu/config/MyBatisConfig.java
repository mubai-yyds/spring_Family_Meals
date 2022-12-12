package com.qfedu.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.23 20:55
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

public class MyBatisConfig {

          @Bean
          public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
              SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
              factoryBean.setDataSource(dataSource);
              factoryBean.setTypeAliasesPackage("com.qfedu.domian");
              return factoryBean;
          }


          @Bean
          public MapperScannerConfigurer mapperScannerConfigurer(){

              MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
              mapperScannerConfigurer.setBasePackage("com.qfedu.dao");
              return mapperScannerConfigurer;
          }





}
