package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.18 17:56
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//实现类
@Repository
public class BookDaoImpl implements BookDao {


    public String findName(int id , String password) {//拿参数的方式
        System.out.println("id : " +id);
        if (true)throw  new NullPointerException();//报错 骗系统用if(true)
        return "qfedu";
    }
}
