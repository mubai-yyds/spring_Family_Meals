package com.qfedu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 20:32
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//纯注解开发
//配置类 注解用于设定当前类
@Configuration
//注解用于设定扫描路径  此注解只能添加一次 多个数据请用数组格式
@ComponentScan({"com.qfedu.service" , "com.qfedu.dao"})
public class SpringConfig {


}
