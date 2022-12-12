package com.qfedu.service.impl;

import com.qfedu.domain.User;
import com.qfedu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 14:45
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
@Service
public class UserServiceImpl implements UserService {

    public void save(User user){
        System.out.println("user service ...");
    }
}
