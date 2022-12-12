package com.qfedu.service;

import com.qfedu.daomain.Account;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 21:07
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//业务层接口  降低耦合
public interface AccountService {


     /**
      * 转账操作
      *
      * out  传出方
      * in   转入方
      * money 金额
      * */

     //开启了spring的事务  transfer
     //事务管理员
//     @Transactional(rollbackFor = {IOException.class})//有些异常是不参与回滚的
     @Transactional//有些异常是不参与回滚的
     public void transfer(String out,String in ,Double money) throws IOException;

}
