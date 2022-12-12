package com.qfedu;

import com.qfedu.config.SpringConfig;
import com.qfedu.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.18 17:55
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class App5 {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);

        String name = bookDao.findName(100, "qfedu" );
        System.out.println(name);
    }
}
