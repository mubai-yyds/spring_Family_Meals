package com.qfedu.dao;

import com.qfedu.daomain.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:21
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */


//数据层接口
public interface AccountDao {

    @Update("update tb_account set money = money + #{money} where name =#{name}")
    void inMoney(@Param("name")String name,@Param("money")Double money);

    @Update("update tb_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name")String name,@Param("money")Double money);




}
