package com.example.mu.bai;

import com.example.mu.bai.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//SpringBoot 整合  junit
@SpringBootTest
class Boot04TestApplicationTests {

    @Autowired
    private BookService bookService;



    @Test
    void contextLoads() {
        bookService.save();
    }

}
