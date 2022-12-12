package com.qfedu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.14 21:05
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//spring管理第三方资源
//DruidDataSource
//ComboPooleDataSource
public class App {
    public static void main(String[] args) {

        //1.加载类路径下的配置文件
        //ApplicationContext  bean立即加载
        //ApplicationContext常用接初始化类口
        //FileSystemXmlApplicationContext ClassPathXmlApplicationContext
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件 建议用第一种 第二种知道就行了
        //FileSystemXmlApplicationContext  绝对路径下找到该文件
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\springbibi\\spring_10_datasource\\src\\main\\resources\\applicationContext.xml.bak");
//         第一  使用bean名称获取
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//           第二  使用bean名称获取知道并指定类型   "bookDao", BookDao.class
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao", BookDao.class);
//         第三  使用bean类型获取  BookDao.class
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.sava();
//        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
//        System.out.println(dataSource);

    }
}
