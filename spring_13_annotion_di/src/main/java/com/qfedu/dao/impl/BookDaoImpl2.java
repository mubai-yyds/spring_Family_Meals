package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:20
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//Spring 的异常从最下面开始查看
//数据层

//使用注解  @Component 后面定义名称
//@Service  用于业务层bean定义
//@Repository  用于数据层bean定义
//@Component("bookDao")

@Repository("bookDao")
public class BookDaoImpl2 implements BookDao {

    @Value("${name}")//实现简单类型注入值类型
    private String name;


    public void save(){

        System.out.println("book dao save ...  2" + name );
    }

}
