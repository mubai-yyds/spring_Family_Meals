package com.qfedu.service;

import com.qfedu.config.SpringConfig;
import com.qfedu.daomain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 19:59
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//整合Junit
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {

    @Autowired
    private AccountService accountService;

    //指定
    @Test
    public void testFindService(){

        Account ac = accountService.findById(2);

    }

    //全部
    @Test
    public void testFindAll(){
        List<Account> all = accountService.findAll();


    }


}
