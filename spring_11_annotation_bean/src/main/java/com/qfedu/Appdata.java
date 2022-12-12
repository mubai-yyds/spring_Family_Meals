package com.qfedu;

import com.qfedu.dao.BookDao;
import com.qfedu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.12 16:47
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//注解形式开发spring程序
public class Appdata {
    public static void main(String[] args) {

        //获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        //获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);

    }
}
