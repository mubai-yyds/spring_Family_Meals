package com.qfedu;


import com.qfedu.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.14 21:05
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//容器
public class AppForBeanFactory {
    public static void main(String[] args) {
        //BeanFactory  IoC容器的顶层接口  初始化BeanFactory对象时  加载的bean延迟加载
        Resource resources = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resources);
        BookDao bookDao = bf.getBean(BookDao.class);
        bookDao.sava();

    }
}
