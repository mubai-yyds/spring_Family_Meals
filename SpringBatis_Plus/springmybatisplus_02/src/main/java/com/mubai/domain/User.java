package com.mubai.domain;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

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
@TableName("tb1_user")
public class User {

    private Integer id;
    private String name;
    @TableField(value = "pwd" , select = false )
    private String password;
    private Integer age;
    private String tel;


    @TableField(exist = false)
    private Integer online;
}
