package com.qfedu.service.impl;

import com.qfedu.dao.AccountDao;
import com.qfedu.daomain.Account;
import com.qfedu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 21:06
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//业务层
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;



    public void save(Account account){
        accountDao.save(account);
    }


    public void update(Account account){
        accountDao.update(account);
    }


    public void delete(Integer id){
        accountDao.delete(id);
    }

    public Account findById(Integer id){
        return accountDao.findById(id);
    }



    public List<Account> finAll(){
        return accountDao.findAll();
    }





    public Account findById(int i) {

        return accountDao.findById(i);
    }


    public List<Account> findAll() {
        return accountDao.findAll();
    }


}
