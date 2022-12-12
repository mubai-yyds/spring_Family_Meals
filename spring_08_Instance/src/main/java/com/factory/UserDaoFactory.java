package com.factory;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.10 21:00
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//实例工厂
public class UserDaoFactory {
    public UserDao getUserDao(){

        return new UserDaoImpl();
    }
}
