package com.example.domain;

import lombok.*;
import org.springframework.stereotype.Service;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.30 14:46
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */
//业务层
//@Setter  //set方法
//@Getter  //get方法
//@ToString //toString 方法
//@NoArgsConstructor //无参构造方法
//@AllArgsConstructor //
//@EqualsAndHashCode  //Equal HashCode 构造方法弄好了

@Data   //包含以上全部
public class User {

    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", password='" + password + '\'' +
//                ", age=" + age +
//                ", tel='" + tel + '\'' +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getTel() {
//        return tel;
//    }
//
//    public void setTel(String tel) {
//        this.tel = tel;
//    }
}
