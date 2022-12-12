package com.qfedu.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.logging.Filter;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 08:51
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Configuration
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //乱码处理
//    @Override
//    protected Filter[] getServletFilter(){
//
//        CharacterEncodingFilter filter = new CharacterEncodingFilter();
//            filter.setEncoding("UTF-8");
//
//            return new Filter[]{(Filter) filter};
//    }
}
