package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 20:58
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

@Configuration
//扫描
@ComponentScan("com.qfedu")
//使用Import注解手动加入配置类到核心配置 此注解只能添加一次 多个请用数组格式
@Import(JdbcConfig.class)//{ ， }
public class SpringConfig {



}
