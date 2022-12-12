package com.qfedu.service.impl;

import com.qfedu.dao.LogDao;
import com.qfedu.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 15:43
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Service
public class LogServiceImpl implements LogService {


    @Autowired
    private LogDao logDao;

    @Transactional
    public void  log(String out ,String in, Double money){

        logDao.log("转账操作由"+ out + "到" + in + ",金额 ：" + money);
    }

}
