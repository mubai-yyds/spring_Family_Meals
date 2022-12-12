package com.qfedu;

import com.qfedu.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 21:15
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class Appbt {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        DataSource dataSource = ctx.getBean(DataSource.class);

        System.out.println(dataSource);

    }
}
