package com.qfedu.controller;

import com.qfedu.domain.Book;
import com.qfedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 09:58
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
/**
 * 表现层接口才是（PostMan）
 */
@RestController//控制器类
@RequestMapping("/books")//公共映类
public class BookController {

    /**
     * 提供所有的方法
     * */

    @Autowired
    private BookService bookService;//调业务层接口

    @PostMapping
    public boolean save(@RequestBody Book book) {

        return bookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }




}
