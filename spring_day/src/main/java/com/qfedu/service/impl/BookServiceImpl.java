package com.qfedu.service.impl;

import com.qfedu.dao.BookDao;
import com.qfedu.dao.UserDao;
import com.qfedu.dao.impl.UserDaoImpl;
import com.qfedu.service.BookService;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:22
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

//业务层
public class BookServiceImpl implements BookService {
//5.删除业务层中使用new的方式创建dao对象

    private BookDao bookDao;
    private UserDao userDao;


    //6.提供对应的set方法
    public void setBookDao(BookDao bookDao){

        this.bookDao = bookDao;
    }
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }


    public void save(){

        System.out.println("book service save ...");
        //业务行执行
        bookDao.save();
        userDao.save();
    }

//

    //InitializingBean, DisposableBean
//    @Override
//    public void destroy() throws Exception {
//
//        System.out.println("service destroy...");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("service init...");
//
//    }
}
