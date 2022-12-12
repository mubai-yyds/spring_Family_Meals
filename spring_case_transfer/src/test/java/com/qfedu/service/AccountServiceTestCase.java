package com.qfedu.service;

import com.qfedu.config.SpringConfig;
import com.qfedu.daomain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 19:59
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//Spring事务简介
//实现银行账户转账
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {

    @Autowired
    private AccountService accountService;

    @Test
    public void testTransfer() throws IOException {

        accountService.transfer("pan","huan", 100.0);
    }




}
