package com.qfedu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.19 16:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

@Component
@Aspect
public class MyAdvice {

//    @Pointcut("execution(void com.qfedu.dao.BookDao.update())")
//    @Pointcut("execution(* com.qfedu.*.*Service.save(..))")
//    public void p(){}
//
//    @Before("p()")
//    public void fadder(){
//        System.out.println(System.currentTimeMillis());
//    }


    @Pointcut("execution(void com.qfedu.dao.BookDao.update())")
    private void p1(){};
    @Pointcut("execution(int com.qfedu.dao.BookDao.update())")
    private void p2(){};

    //前置通知
//    @Before("p1()")
    public void before(){
        System.out.println("before ...");
    }

    //后置通知
//    @After("p1()")
    public void after(){
        System.out.println("after ...");
    }

    //环绕通知
//    @Around("p1()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before ...");
        //表示对原始操作的调用
        proceedingJoinPoint.proceed();
        System.out.println("around after ...");
    }
//    @Around("p2()")
    public Object aroundSelect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundSelect ...");
        //表示对原始操作的调用
        Integer proceed = (Integer) proceedingJoinPoint.proceed();
        System.out.println("aroundSelect ...");
        return proceed + 5555;
    }

//不抛异常
//    @AfterReturning("p2()")
    public void afterReturning(){
        System.out.println("afterReturning ...");
    }

    //抛异常才会出现
    @AfterThrowing("p2()")
    public void afterThrowing(){
        System.out.println("afterThrowing ...");
    }

}
