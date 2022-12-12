package com;

import com.dao.OrderDao;
import com.dao.UserDao;
import com.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.14 19:08
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForInstanceUser {
    public static void main(String[] args) {
        //创建实例工厂对象
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
        //通过实例化工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();

//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");

        System.out.println(userDao1);
        System.out.println(userDao2);
//        userDao.sava();


    }
}
