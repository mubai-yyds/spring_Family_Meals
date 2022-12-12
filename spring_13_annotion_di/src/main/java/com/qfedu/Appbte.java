package com.qfedu;

import com.qfedu.config.SpringConfig;
import com.qfedu.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 21:15
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class Appbte {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
    }
}
