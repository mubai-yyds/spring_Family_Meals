package com.qfedu.controller;

import com.qfedu.Exception.BusinessException;
import com.qfedu.Exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 16:16
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@RestControllerAdvice//这是处理rest风格
public class ProjectExceptionAdvice {

    //处理系统异常
    // new Result 规范返回结果
    @ExceptionHandler(SystemException.class) //处理异常的标志 定义哪一种异常
    public Result doSystemException(SystemException ex){
       //记录日志 //发送消息给运维  //发送邮件给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    //处理业务异常
    // new Result 规范返回结果
    @ExceptionHandler(BusinessException.class) //处理异常的标志 定义哪一种异常
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());

    }

    //写一个方法处理异常
    // new Result 规范返回结果
    @ExceptionHandler(Exception.class) //处理异常的标志 定义哪一种异常
    public Result doException(Exception exception){
        //记录日志 //发送消息给运维  //发送邮件给开发人员
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"报异常了，傻瓜！");//这里的msg不能乱写了安抚用户 ：系统繁忙，请稍后再试！
    }
}
