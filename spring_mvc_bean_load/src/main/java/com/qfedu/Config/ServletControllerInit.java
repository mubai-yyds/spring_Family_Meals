package com.qfedu.Config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 11:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//4.定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletControllerInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //简洁开发 AbstractAnnotationConfigDispatcherServletInitializer
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


    //加载springMVC容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//        return ctx;
//    }
//
//
//    //设置哪些请求归属springmvc处理
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};//所有归springmvc处理{"/"}
//    }
}
