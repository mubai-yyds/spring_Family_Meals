package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 09:43
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Configuration
@ComponentScan("com.qfedu")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class , MybatisConfig.class})
public class SpringConfig {

}
