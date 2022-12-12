package com.qfedu.dao;

import com.qfedu.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 09:56
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
/**
 * 数据层标准开发
 *
 * 2.（接口 + 自动代理）
 * */
public interface BookDao {

    //增
//    @Insert("insert into tb_book values(null,#{type},#{name},#{description})")//第一种方法
    @Insert("insert into tb_book (type,name,description) values(#{type},#(name),#(description))")//第二种方法
    public void save(Book book);

    //改
    @Update("update tb_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public void update(Book book);

    //删
    @Delete("delete from tb_book where id = #{id}")
    public void delete(Integer book);

    //查
    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
    //查
    @Select("select * from tb_book")
    public List<Book> getAll();


}
