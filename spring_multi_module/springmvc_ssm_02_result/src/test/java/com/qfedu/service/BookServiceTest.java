package com.qfedu.service;

import com.qfedu.config.SpringConfig;
import com.qfedu.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 11:00
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
/**
 * 测试接口
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {


    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){

        Book book = bookService.getById(5 );
        System.out.println((book));

    }


    @Test
    public void testGetAll(){

        List<Book> all = bookService.getAll();
        System.out.println(all);

    }

}
