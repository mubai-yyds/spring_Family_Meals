package com.dao.impl;

import com.dao.BookDao;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:20
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//Spring 的异常从最下面开始查看
//数据层
public class BookDaoImpl implements BookDao {
    private int connecttionNum;
    private String databaseName;

    public BookDaoImpl(int connecttionNum, String databaseName) {
        this.connecttionNum = connecttionNum;
        this.databaseName = databaseName;
    }

    public BookDaoImpl() {

    }


    public void save(){

        System.out.println("book dao save ..." + databaseName + "，和，" + connecttionNum);
    }


}
