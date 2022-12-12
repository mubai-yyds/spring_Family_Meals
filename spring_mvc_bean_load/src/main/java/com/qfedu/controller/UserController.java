package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/save")
    //2.3设置当前操作返回值
    @ResponseBody
    public  String  save(){
        System.out.println("user save ...");

        return "{'module' : 'springmvc'}";
    }

    @RequestMapping("du")
    @ResponseBody
    public  String  du(){
        System.out.println("user du ...");

        return "{'module' : 'du'}";
    }


}
