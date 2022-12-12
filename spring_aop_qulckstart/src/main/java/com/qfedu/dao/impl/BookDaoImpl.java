package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.18 17:56
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Repository
public class BookDaoImpl implements BookDao {

    public void save(){
        System.out.println((System.currentTimeMillis()));
        System.out.println("book dao save ....");

    }

    public void update(){

        System.out.println(("update dao save ..."));
    }

    public int select() {
        System.out.println("select dao select");
//        int i =1/0;
        return 1000;
    }


}
