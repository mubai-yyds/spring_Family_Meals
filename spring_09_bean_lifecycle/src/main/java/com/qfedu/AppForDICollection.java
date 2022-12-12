package com.qfedu;



import com.qfedu.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.14 20:06
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//集合注入
public class AppForDICollection {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.sava();




    }
}
