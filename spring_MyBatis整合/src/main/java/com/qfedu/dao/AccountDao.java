package com.qfedu.dao;

import com.qfedu.daomain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:21
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */


//数据层接口
public interface AccountDao {

    //增
    @Insert("insert into tb_account(name,money)value(#{name},#{money})")
    void  save(Account account);

    //删
    @Delete("delete from tb_account where id = #{id}")
    void delete(Integer id);
    //改
    @Update("update tb_account set name = #{name}, money = #{money}")
    void update(Account account);

    //查
    @Select("select * from tb_account")
    List<Account> findAll();
    //查
    @Select("select * from tb_account where id = #{id}")
    Account findById(Integer id);


}
