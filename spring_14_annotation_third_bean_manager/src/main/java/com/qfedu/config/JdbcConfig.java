package com.qfedu.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.qfedu.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 17:10
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//@Configuration
//第三方bean依赖注入
public class JdbcConfig {
    //定义一个方法获得要管理的对象
    //添加@Bean 表示当前方法的返回值是一个bean
    @Value("com.mysql.jdbc.Driver")
     private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
     private String url;
    @Value("root")
     private String userName;
    @Value("root")
     private String userPassword;


    @Bean//使用@Bean配置第三方bean
    public DataSource dataSource(BookDao bookDao){//自动装配
        //打印形参
        System.out.println(bookDao);
        DruidDataSource d = new DruidDataSource();
        d.setDriverClassName(driver);
        d.setUrl(url);
        d.setUsername(userName);
        d.setPassword(userPassword);
        return d;
    }

}
