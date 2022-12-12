package com.qfedu.service.impl;

import com.qfedu.dao.AccountDao;
import com.qfedu.daomain.Account;
import com.qfedu.service.AccountService;
import com.qfedu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 21:06
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//业务层实现类
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out, String in, Double money){

        try {
            //会出问题的代码放上面
            accountDao.outMoney(out,money);

//        if (true){throw new IOException();}
            accountDao.inMoney(in,money);
        }finally {
            //保证这代码100%运行
            logService.log(out,in,money);
        }


    }
}
