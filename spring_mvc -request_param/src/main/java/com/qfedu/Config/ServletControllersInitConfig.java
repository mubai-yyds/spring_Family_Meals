package com.qfedu.Config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;
import javax.servlet.Filter;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 11:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//4.定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletControllersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //Post请求乱码处理问题
    @Override
    protected Filter[] getServletFilters(){
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
