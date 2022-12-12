package com.example.domain;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.30 14:46
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */
//业务层 实体类
//@Setter  //set方法
//@Getter  //get方法
//@ToString //toString 方法
//@NoArgsConstructor //无参构造方法
//@AllArgsConstructor //
//@EqualsAndHashCode  //Equal HashCode 构造方法弄好了

@Data   //包含以上全部
//@TableName("tb1_user")
public class User {

//    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    private String name;
//    @TableField(value = "pwd" , select = false )
    @TableField(value = "pwd")
    private String password;
    private Integer age;
    private String tel;

    //逻辑删除字段  标记当前记录是否被删除
//    @TableLogic(value = "0" , delval = "1")
    private Integer deleted;


    @Version
    private Integer version;

//
//    @TableField(exist = false)
//    private Integer online;
}
