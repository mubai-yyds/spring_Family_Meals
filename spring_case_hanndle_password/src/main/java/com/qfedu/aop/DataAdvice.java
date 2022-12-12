package com.qfedu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 11:46
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean com.qfedu.service.*Service.*(*,*))")

    private void servicePt(){}

    @Around("DataAdvice.servicePt()")
    public Object trimStr(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        //得到一个对象数组
        Object[] args = proceedingJoinPoint.getArgs();
        //对原始每一个参数进行操作
        for (int i = 0; i < args.length; i++) {
            //判断参数是不是字符串
            if (args[i].getClass().equals(String.class)){
                //取出数据 trim() 操作后 更新数据
               args[i] = args[i].toString().trim();
            }
        }

//        Object ret = proceedingJoinPoint.proceed(args);

        return proceedingJoinPoint.proceed(args);
    }
}
