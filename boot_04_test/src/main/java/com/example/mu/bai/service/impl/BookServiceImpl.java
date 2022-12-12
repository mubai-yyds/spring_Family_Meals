package com.example.mu.bai.service.impl;

import com.example.mu.bai.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.29 20:22
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */
@Service
public class BookServiceImpl  implements BookService {
    @Override
    public void save() {

        System.out.println("book service is running ...");
    }
}
