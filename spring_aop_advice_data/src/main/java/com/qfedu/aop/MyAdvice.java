package com.qfedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

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


    @Pointcut("execution(* com.qfedu.dao.BookDao.findName(..))")
    private void p1(){};

    //前置通知
//    @Before("p1()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before ...");
    }

    //后置通知
//    @After("p1()")
    public void after(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after ...");
    }

    //环绕通知
//    @Around("p1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) {//原始状态try
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));

        //如果传回来的参数有问题可以先处理
        args[0] = 666;

        Object ret = null;
        try {
            ret = proceedingJoinPoint.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return ret;
//        System.out.println("around after ...");
    }

//不抛异常
    @AfterReturning(value = "p1()",returning = "ret")
    public void afterReturning(JoinPoint joinPoint, Object ret){//JoinPoint joinPoint必须是他在前面

        System.out.println("afterReturning ..." + ret);
    }

    //抛异常才会出现
    @AfterThrowing(value = "p1()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing ...");
    }

}
