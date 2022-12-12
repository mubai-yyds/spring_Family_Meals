package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.29 20:47
 * @VX lhh082211
 * @Post 3268483030@qq.com
 */
@Mapper
//数据层
public interface BookDao {

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
}
