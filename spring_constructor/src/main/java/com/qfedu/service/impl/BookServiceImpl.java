package com.qfedu.service.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.dao.UserDao;
import com.qfedu.service.BookService;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:22
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//业务层
public class BookServiceImpl implements BookService {


    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }


    public void save(){

        System.out.println("book service save ......");
        bookDao.save();
        userDao.save();
    }
}
