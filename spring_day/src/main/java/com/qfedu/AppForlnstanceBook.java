package com.qfedu;

import com.qfedu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:36
 * @Phone 15270705865
 * Teacher:  heima
 * @Post 3268483030@qq.com
 */
                /**
                 * //适合交给Bean管理
                 * 1.表现层：servlet
                 * 2.业务层：service
                 * 3.数据层：dao
                 * 4.工具层：
                 * 5.工厂：factory
                 *
                 * //不适合交给容器管理
                 * 封装实体的域对象
                 * */

//ioc入门
public class AppForlnstanceBook {
    public static void main(String[] args) {
        //3.获取ioc容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
//        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        //获取俩
        BookService bookService = (BookService) ctx.getBean("service2");
        bookService.save();
    }
}
