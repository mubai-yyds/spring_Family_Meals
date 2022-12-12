package com.qfedu.service.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.domain.Book;
import com.qfedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 09:57
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
/**
 * 业务层标准开发
 *
 * 接口  + 实现类
 */

@Service//定义bean
public class BookServiceImpl implements BookService {

    /**
     * 想用BookService的接口 要先注入
     * */

    @Autowired//自动装配
    private BookDao bookDao;//把bean的检测关闭或者改成警告就行了


    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }


    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }


    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }


    public Book getById(Integer id) {

        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }




}
