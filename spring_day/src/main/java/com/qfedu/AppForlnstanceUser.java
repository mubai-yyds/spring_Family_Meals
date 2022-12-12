package com.qfedu;

import com.qfedu.dao.UserDao;
import com.qfedu.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.12 10:10
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class AppForlnstanceUser {

    public static void main(String[] args) {
//        //创建实例工厂对象
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        //通过实例工厂对象创建对象
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");

        System.out.println(userDao1);
        System.out.println(userDao2);
//        userDao.save();
    }


}
