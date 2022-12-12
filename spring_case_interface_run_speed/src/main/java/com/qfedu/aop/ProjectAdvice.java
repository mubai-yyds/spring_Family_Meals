package com.qfedu.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 09:33
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//当前测试的接口执行效率仅仅只是一个理论值 不是一个完整的执行过程
@Component
@Aspect
public class ProjectAdvice {

    //对业务层做监控的
    //匹配业务层的所有方法
    @Pointcut("execution(* com.qfedu..service.*Service.*(..))")
    private void servicePt() {

    }

    //环绕通知
    @Around("ProjectAdvice.servicePt()")
    public void  runSpeed(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Signature signature = proceedingJoinPoint.getSignature();
        String className =signature.getDeclaringTypeName();
        String methodName = signature.getName();


        long start = System.currentTimeMillis();
        for (int i = 0; i <10000;i++){
            proceedingJoinPoint.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println("业务层接口 万次执行时间："+className + "." +methodName +"------>"+(end -start) + "ms");
    }


}
