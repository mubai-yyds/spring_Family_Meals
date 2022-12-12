package com.qfedu.service;



/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 11:00
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

import com.qfedu.domain.Book;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * 测试接口
 * */
//@RunWith(SpringRunner.class)
@SpringBootTest
//@WebAppConfiguration
//@MapperScan
public class BookServiceTest {


    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){

        Book book = bookService.getById(2);
        System.out.println((book));

    }


    @Test
    public void testGetAll(){

        List<Book> all = bookService.getAll();
        System.out.println(all);

    }

}
