package com.qfedu;

import com.qfedu.dao.OrderDao;
import com.qfedu.factory.OrderDaoFactory;
import com.qfedu.factory.UserDaoFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:22
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForInstanceOrder {
    public static void main(String[] args) {
        //通过静态工厂创建对象
        //早期的造对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");

        orderDao.save();


        //加载配置文件得到上下文对象 也就是容器对象
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        BookDao bookDao1 =(BookDao)ctx.getBean("bookDao");
//        BookDao bookDao2 =(BookDao)ctx.getBean("bookDao");
//
//        System.out.println(bookDao1);
//        System.out.println(bookDao2);

    }
}
