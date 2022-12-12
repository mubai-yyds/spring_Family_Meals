package com;

import com.qfedu.config.SpringConfig;
import com.qfedu.dao.BookDao;
import com.qfedu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 20:34
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForAnnotation {

    public static void main(String[] args) {
        //加载配置文件初始化容器
//        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        // 加载配置类初始化容器   AnnotationConfigApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);//配置类名称
        //获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);

    }
}
