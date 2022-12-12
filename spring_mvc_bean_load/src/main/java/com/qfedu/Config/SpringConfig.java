package com.qfedu.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 11:02
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//3. 创建springmvc 的配置文件 ， 加载controoler对应的bean
@Configuration
//@ComponentScan({"com.qfedu.service","com.qfedu.dao"})
@ComponentScan(value = "com.qfedu",
        excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,classes = Controller.class//过滤
 )
)
public class SpringConfig {
}
