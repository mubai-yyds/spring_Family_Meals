package com.mubai;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mubai.dao.UserDao;
import com.mubai.domain.User;
import com.mubai.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.List;

//条件查询
@SpringBootTest
class Springmybatisplus_02ApplicationTests {

    @Autowired
    private UserDao userDao;



    @Test
    void testGetAll() {

        //DQL编程控制
        //方式一：按条件查询
//       QueryWrapper wrapper = new QueryWrapper();
//       wrapper.lt("age",99);
//        List<User> userList = userDao.selectList(wrapper);
//        System.out.println((userList));



        //方式二 ：lambda 格式 按条件查询
//        QueryWrapper<User> wrapper = new QueryWrapper();
//        wrapper.lambda().lt(User::getAge ,3);
//        List<User> userList = userDao.selectList(wrapper);
//        System.out.println((userList));


        //方式三： lambda 格式按条件查询
        //这种方式在后面的开发中推荐
//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
//        lambdaQueryWrapper.lt(User::getAge ,3);
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));

       //多条数据查询 小于 lt || 大于 gt
//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
        //1 到 10 岁
//        lambdaQueryWrapper.lt(User::getAge ,10);
//        lambdaQueryWrapper.gt(User::getAge ,1);
//        lambdaQueryWrapper.lt(User::getAge ,10).gt(User::getAge ,1);

        //小于1 岁 或者 大于10岁
//        lambdaQueryWrapper.lt(User::getAge ,1).or().gt(User::getAge ,10);
//
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));



//      模拟页面传递过来的查询数据
//        UserQuery userQuery = new UserQuery();
        //1岁
//        userQuery.setAge(1);
        //上限10岁
//        userQuery.setAge2(10);

//        null判定
//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
////        先判定第一个参数是否为true 如果为true连接当前条件
//        lambdaQueryWrapper.lt(null != userQuery.getAge2(), User::getAge, userQuery.getAge2());
//        lambdaQueryWrapper.gt(null != userQuery.getAge(), User::getAge, userQuery.getAge());
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));




        //查询投影
        //第一种
//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
//        lambdaQueryWrapper.select(User::getId,User::getName,User::getAge);
        //第二种
//        QueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>();
//        lambdaQueryWrapper.select("id","name","tel");
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));

//
//        QueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>();
//        lambdaQueryWrapper.select("count(*) as count , tel");
//        //分组查
//        lambdaQueryWrapper.groupBy("tel");
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));





        //条件查询
//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
//        //等同于=
//        //登入login
//        lambdaQueryWrapper.eq(User::getName,"qfedu").eq(User::getPassword,"1");
//        User loginUser= userDao.selectOne(lambdaQueryWrapper);
//        System.out.println(loginUser);


//        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
//        //范围查询 lt le gt ge eq between
//        lambdaQueryWrapper.between(User::getAge,5,10);
//        List<User> userList = userDao.selectList(lambdaQueryWrapper);
//        System.out.println((userList));



        //字段映射与表名映射
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<User>();
        List<User> userList = userDao.selectList(lambdaQueryWrapper);
        System.out.println((userList));

    }
}
