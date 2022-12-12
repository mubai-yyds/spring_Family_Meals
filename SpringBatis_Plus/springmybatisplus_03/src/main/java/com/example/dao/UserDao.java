package com.example.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.30 14:49
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */
//数据层
@Mapper
public interface UserDao extends BaseMapper<User> {


}
