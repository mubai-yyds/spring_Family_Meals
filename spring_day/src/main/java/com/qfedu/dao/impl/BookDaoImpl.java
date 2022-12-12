package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;

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

    //提供set入口
    public void setConnecttionNum(int connecttionNum) {
        this.connecttionNum = connecttionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }


    public void save(){

        System.out.println("book dao save ..." + databaseName + "，和，" + connecttionNum);
    }

//    public BookDaoImpl(){
//        System.out.println("book dao running ...");
//    }


    //表示bean初始化对应的操作
    public void init(){

        System.out.println("init......");
    }
    //表示bean销毁前的对应操作

    public void destory(){

        System.out.println("destory......");
    }

}
