package com.qfedu.Config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 11:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//4.定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletControllerInit extends AbstractDispatcherServletInitializer {

    //加载springMVC容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringmvcConfig.class);
        return ctx;
    }

    //设置哪些请求归属springmvc处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//所有归springmvc处理{"/"}
    }

    //加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
