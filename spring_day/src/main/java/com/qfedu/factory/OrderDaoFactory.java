package com.qfedu.factory;

import com.qfedu.dao.impl.OrderDaoImpl;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.10 20:58
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//静态OrderDaoFactroy工厂

public class OrderDaoFactory {
    public static OrderDaoImpl getOrderDao(){

        System.out.println("factory setup...");

        return new OrderDaoImpl();
    }
}
