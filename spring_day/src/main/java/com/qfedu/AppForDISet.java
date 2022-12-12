package com.qfedu;

import com.qfedu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.12 15:56
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForDISet {
    public static void main(String[] args) {

        //获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();



    }
}
