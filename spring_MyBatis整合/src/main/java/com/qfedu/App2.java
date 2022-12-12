package com.qfedu;

import com.qfedu.config.SpringConfig;
import com.qfedu.daomain.Account;
import com.qfedu.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.17 10:02
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */

public class App2 {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(4);

        System.out.println(ac);
    }



}
