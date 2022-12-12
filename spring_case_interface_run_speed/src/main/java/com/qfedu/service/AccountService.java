package com.qfedu.service;

import com.qfedu.daomain.Account;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 21:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//业务层接口
public interface AccountService {

     void save(Account account);

     void delete(Integer id);

     void update(Account account);

     Account findById(int i);

     List<Account> findAll();
}
