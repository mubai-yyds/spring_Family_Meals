package com.qfedu.service;

import com.qfedu.config.SpringConfig;
import com.qfedu.dao.AccountDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 19:59
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//整合Junit
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    //id定位查询
    @Test
    public void testFindService(){

        System.out.println(accountService.findById(2));//想要第几条数据
    }

    //全部内容
    @Test
    public void testFindAll(){

        System.out.println(accountService.findAll());
    }




}
