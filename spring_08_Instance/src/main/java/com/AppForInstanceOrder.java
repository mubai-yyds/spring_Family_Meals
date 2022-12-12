package com;

import com.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.14 19:08
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {

//        OrderDao orderDao = (OrderDao) OrderDaoFactory.getOrderDao();
//        orderDao.sava();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.sava();

    }
}
