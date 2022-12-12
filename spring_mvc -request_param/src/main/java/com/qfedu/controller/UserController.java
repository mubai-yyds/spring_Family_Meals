package com.qfedu.controller;

import com.qfedu.daomain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
*@Author liuhuanhuan
*@Data 2022 11.22 10:56
*@Phone 15270705865
*@Post 3268483030@qq.com
*/
//2.定义Controller
//2.1使用@Controller定义bean
@Controller
public class UserController {
     //2.2 设置当前操作访问路径

    @RequestMapping("/pojoParam")
    //2.3设置当前操作返回值
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递  User：--》" + user);

        return "{'module' : 'pojoParam'}";
    }
    @RequestMapping("/pojoContainPojoParam")
    //2.3设置当前操作返回值
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo嵌套pojo参数传递  User：--》" + user);

        return "{'module' : 'pojoContainPojoParam'}";
    }
    @RequestMapping("/arrayParam")
    //2.3设置当前操作返回值
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递  likes：--》" + Arrays.toString(likes));

        return "{'module' : 'arrayParam'}";
    }



    @RequestMapping("/listParamForJson")
    //2.3设置当前操作返回值
    @ResponseBody
    public String listParamForJson( List<String> likes){
        System.out.println("数组参数传递  likes：--》" +likes);

        return "{'module' : 'arrayParam'}";
    }

    @RequestMapping("/pojoParamForJson")
    //2.3设置当前操作返回值
    @ResponseBody
    public String pojoParamForJson( User user){
        System.out.println("pojo嵌套pojo参数传递  User：--》" + user);

        return "{'module' : 'pojoContainPojoParam'}";
    }




}
