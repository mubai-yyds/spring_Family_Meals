package com.example.domain;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.UserDao;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springmybatisplus01ApplicationTests {

    @Autowired
    private UserDao userDao;

//    增
    @Test
    void testSave(){
        User user = new User();
        user.setName("巅峰塞");
        user.setPassword("123");
        user.setAge(9);
        user.setTel("754254325");
        userDao.insert(user);
    }
//    删
    @Test
    void testDelete(){
        userDao.deleteById(1887547394 );
    }

//    改
    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setName("qfedu");
        userDao.updateById(user);
    }

//    id查
    @Test
    void testGetById(){
        User user = userDao.selectById(797044737);
        System.out.println(user);
    }


//    查
    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println((userList));
    }


    //分页查询
    @Test
    void testGetByPage(){
        IPage page = new Page(1,2);
        userDao.selectPage(page ,null);
        System.out.println(("当前页码值：" + page.getCurrent()));
        System.out.println(("每页显示数：" + page.getSize()));
        System.out.println(("一共多少页：" + page.getPages()));
        System.out.println(("一共多少条数据：" + page.getTotal()));
        System.out.println(("数据：" + page.getRecords()));
    }

}
