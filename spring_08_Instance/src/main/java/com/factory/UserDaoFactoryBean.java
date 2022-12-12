package com.factory;

import com.dao.impl.UserDaoImpl;
import com.dao.UserDao;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.10 21:00
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    //代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //什么类别
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    //设置单例ture非单例false
    //一般来说是不写的
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }
}
