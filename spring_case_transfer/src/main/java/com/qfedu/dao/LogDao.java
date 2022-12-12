package com.qfedu.dao;

import org.apache.ibatis.annotations.Insert;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.21 15:43
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public interface LogDao {


    @Insert("insert into tb_log (info ,createDate) value (#{info},now())")

    void log(String info );

}
