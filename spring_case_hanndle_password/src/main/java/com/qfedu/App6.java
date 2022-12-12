package com.qfedu;

import com.qfedu.config.SpringConfig;
import com.qfedu.dao.ResourcesDao;
import com.qfedu.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.18 17:55
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//百度网盘密码数据兼容处理
public class App6 {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService =  ctx.getBean(ResourcesService.class);

        boolean flag = resourcesService.openURL("http://pan.baidu.com/haha","1234 ");
        System.out.println(flag);

    }
}
