package com.qfedu.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 20:30
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//拦截器案例
@Component
public class ProjectInterceptor2 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        String contentType = request.getHeader("Content-Type");
//        System.out.println(handler.getClass());
//        HandlerMethod hm  = (HandlerMethod) handler;

        System.out.println("preHandle===== 888-2" );
        return false;
    }

    @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle=====2222222");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion=====222222");
    }
}
