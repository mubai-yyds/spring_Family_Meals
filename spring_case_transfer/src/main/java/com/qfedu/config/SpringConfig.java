package com.qfedu.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 09:43
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Configuration
@ComponentScan("com.qfedu")
@PropertySource("classpath:jdbc.properties")//加载jdbc
@Import({JdbcConfig.class , MybatisConfig.class})//用这俩
@EnableTransactionManagement
public class SpringConfig {

}
