package com.qfedu.controller;

import com.qfedu.domain.Book;
import com.qfedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag? Code.SAVE_OK : Code.SAVE_ERR,flag);//先数据后把值
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag? Code.DELETE_OK : Code.DELETE_OK,flag) ;
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "八嘎，查询失败，请重新拉取!!!";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book>  bookList=  bookService.getAll();
        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "八嘎，查询失败，请重新拉取!!!";
        return new Result(code,bookList,msg);
    }




}
