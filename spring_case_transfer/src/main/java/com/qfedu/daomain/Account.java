package com.qfedu.daomain;

import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.16 19:48
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//封装数据
public class Account implements Serializable {

    private Integer id;
    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AccountDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }



}
