package com.qfedu.dao.impl;

import com.qfedu.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.18 17:56
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//实现类
@Repository
public class ResourcesDaoImpl implements ResourcesDao {


    public boolean readResources(String url, String password) {

        System.out.println(password.length());
        //模拟校验

        return password.equals("1234");
    }
}
