package com;

import com.qfedu.Config.SpringConfig;
import com.qfedu.controller.UserController;
import com.qfedu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 15:16
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        System.out.println(ctx.getBean(UserController.class));
    }
}
