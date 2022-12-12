package com.qfedu.factory;

import com.qfedu.dao.UserDao;
import com.qfedu.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.10 21:00
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    /**
     * 这种方式务必掌握
     * */
    //代替原始实例工厂中创建对象的方法
    //替代UserDaoFactory
    //这个是来得到Bean实例的
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }


    //这个是来得到Bean类型的
    @Override
    public Class<?> getObjectType() {
        //什么类型 UserDao类型
        return UserDao.class;
    }

    //这个是用来设定是否单例的
    @Override
    public boolean isSingleton() {
        //true  单例
        /**
         *com.qfedu.dao.impl.UserDaoImpl@5702b3b1
         * com.qfedu.dao.impl.UserDaoImpl@5702b3b1
         * */
        //false 非单例
        /**
         * com.qfedu.dao.impl.UserDaoImpl@5702b3b1
         * com.qfedu.dao.impl.UserDaoImpl@69ea3742
         * */
        return false;
    }
}
