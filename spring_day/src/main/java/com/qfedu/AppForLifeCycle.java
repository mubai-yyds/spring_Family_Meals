package com.qfedu;

import com.qfedu.dao.BookDao;
import com.qfedu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.12 14:36
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        //获取ioc容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
       //注册关闭钩子，在虚拟机退出前先关闭容器在退出虚拟机
//        ctx.registerShutdownHook();
        //获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //想要启动关闭容器close 要用ClassPathXmlApplicationContext中的close方法
        //手动暴力关闭容器
        ctx.close();


    }
}
