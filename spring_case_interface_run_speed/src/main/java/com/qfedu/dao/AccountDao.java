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

    @Insert("insert into tb_account(name,money)value(#{name},#{money})")
    void  save(Account account);

    @Delete("delete from tb_account where id = #{id}")
    void delete(Integer id);

    @Update("update tb_account set name = #{name}, money = #{money}")
    void update(Account account);

    @Select("select * from tb_account")
    List<Account> findAll();

    @Select("select * from tb_account where id = #{id}")
    Account findById(Integer id);


}
