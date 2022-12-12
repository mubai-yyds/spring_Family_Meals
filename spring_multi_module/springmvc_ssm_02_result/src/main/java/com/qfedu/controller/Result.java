package com.qfedu.controller;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 14:21
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//数据层封装
public class Result {

    private Object data;
    private Integer code;
    private String msg;


    public Result() {
    }
    //先数据后把值  Object data与Integer code调换位置
    public Result( Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    //构造函数
    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }


    //get 与 set 方法
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
