package com.example;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.dao.UserDao;
import com.example.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Springmybatisplus03ApplicationTests {

    @Autowired
    private UserDao userDao;

    //    增
    @Test
    void testSave(){
        User user = new User();
//        user.setId(5);
        user.setName("啊啊");
        user.setPassword("888");
        user.setAge(18);
        user.setTel("15854585798");
        userDao.insert(user);
    }
    //    删
    @Test
    void testDelete(){

//        删多条
//        List<Integer> list = new ArrayList<>();
//        list.add(-1283452927);
//        list.add(1405218817);
//        list.add(2013265921);
//        userDao.deleteBatchIds(list);
        //deleteBatchIds  按照主键删除多条记录
        //selectBatchIds  按照主键查询多条数据
//        删单条
        userDao.deleteById(5);
//        System.out.println((userDao.selectList(null)));
    }

    //    改
    @Test
    void testUpdate(){
//        User user = new User();
//        user.setId(1);
//        user.setName("qfedu");
//        user.setVersion(1);
//        userDao.updateById(user);

//        //1.先通过要修改的数据id将当前数据查询出来
//        User user = userDao.selectById(3);
//        //2.将要修改的属性卓一设置进去
//        user.setName("Tom");
//        userDao.updateById(user);


        //模拟用户进入

        //1.先通过要修改的数据id将当前数据查询出来
        User user = userDao.selectById(3);   //version =3
        User user2 = userDao.selectById(3);   //version =3


        user2.setName("Tom a");
        userDao.updateById(user2);           //version =4

        user.setName("Tom b");
        userDao.updateById(user);            //version =3? 条件不成立

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
//    @Test
//    void testGetByPage(){
//        IPage page = new Page(1,2);
//        userDao.selectPage(page ,null);
//        System.out.println(("当前页码值：" + page.getCurrent()));
//        System.out.println(("每页显示数：" + page.getSize()));
//        System.out.println(("一共多少页：" + page.getPages()));
//        System.out.println(("一共多少条数据：" + page.getTotal()));
//        System.out.println(("数据：" + page.getRecords()));
//    }
}
