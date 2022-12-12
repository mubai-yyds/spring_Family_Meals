package com.qfedu.Exception;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 16:42
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//extends  继承

public class SystemException extends RuntimeException{

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException( Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
