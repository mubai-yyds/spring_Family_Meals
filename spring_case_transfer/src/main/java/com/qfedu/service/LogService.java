package com.qfedu.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 15:43
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public interface LogService {
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    void log(String out, String in, Double money);
}
