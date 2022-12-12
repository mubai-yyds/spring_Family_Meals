package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.23 20:55
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Configuration
@ComponentScan("com.qfedu.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
