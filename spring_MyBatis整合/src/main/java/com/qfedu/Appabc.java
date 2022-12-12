package com.qfedu;


import com.qfedu.dao.AccountDao;
import com.qfedu.daomain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.15 21:15
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class Appabc {
    public static void main(String[] args) throws IOException {

        //一层：初始化创建SqlSessionFactory
        //1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //2.加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml.ak");
        //3.创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

         //第二层：获取连接  获取实现
        //4.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5.执行SqlSession 对象执行查询 获取结果User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        //三层：获取数据层接口
        Account ac = accountDao.findById(3);
        System.out.println(ac);

         //四层：关闭连接
        //6.释放资源
        sqlSession.close();

    }
}
