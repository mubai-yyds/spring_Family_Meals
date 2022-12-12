package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.23 20:46
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
/**
 * 配置类
 * */
@Configuration
@ComponentScan({"com.qfedu.service"})
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement //1.开启注解式事务
public class SpringConfig {
}
