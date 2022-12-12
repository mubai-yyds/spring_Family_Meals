package com.qfedu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 17:10
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//数据源
public class JdbcConfig {
    //定义一个方法获得要管理的对象
    //添加@Bean 表示当前方法的返回值是一个bean
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;


    @Bean//使用@Bean配置第三方bean

    public DataSource dataSource(){//自动装配
        DruidDataSource d = new DruidDataSource();
        d.setDriverClassName(driver);
        d.setUrl(url);
        d.setUsername(userName);
        d.setPassword(password);

        return d;
    }


    //必须是同一个DataSource  不然完成不了该操作
    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;

    }


}
