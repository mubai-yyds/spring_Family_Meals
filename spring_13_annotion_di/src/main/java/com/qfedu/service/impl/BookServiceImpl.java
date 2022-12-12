package com.qfedu.service.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:22
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//业务层
//@Component
@Service
public class BookServiceImpl implements BookService {

    @Autowired// 解决引用注入  注解自动装配模式
    @Qualifier("bookDao2")//指定id  name 名称装配bean
    private  BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//        bookDao.save();
//    }

    public void save(){

        System.out.println("book service save ......");
        bookDao.save();
    }
}
