package com.qfedu;

import com.qfedu.config.SpringConfig;
import com.qfedu.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.12 16:47
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//注解形式开发spring程序

public class App {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = (BookDao) ctx.getBean(BookDao.class);
        BookDao bookDao2 = (BookDao) ctx.getBean(BookDao.class);

        System.out.println(bookDao1);
        System.out.println(bookDao2);
        ctx.close();


    }
}
