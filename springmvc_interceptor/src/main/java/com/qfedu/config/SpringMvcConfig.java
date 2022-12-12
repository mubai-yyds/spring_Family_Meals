package com.qfedu.config;

import com.qfedu.controller.interceptor.ProjectInterceptor;
import com.qfedu.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 20:31
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Configuration
@ComponentScan({"com.qfedu.controller","com.qfedu.config"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
     private ProjectInterceptor projectInterceptor;

    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books","/books/*");

    }
}
