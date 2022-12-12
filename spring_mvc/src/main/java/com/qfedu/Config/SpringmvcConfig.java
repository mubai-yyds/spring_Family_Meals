package com.qfedu.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 11:02
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//3. 创建springmvc 的配置文件 ， 加载controoler对应的bean
@Configuration
@ComponentScan("com.qfedu.controller")
public class SpringmvcConfig {
}
