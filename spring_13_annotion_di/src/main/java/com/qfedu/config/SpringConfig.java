package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 20:58
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

@Configuration
@ComponentScan("com.qfedu")
//注解加载properties文件   不允许使用通配符
@PropertySource("jdbc.properties")//写多个用"{ , }"
public class SpringConfig {



}
