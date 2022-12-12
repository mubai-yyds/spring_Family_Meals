package com.qfedu.daomain;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 17:47
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class Address {

    private String province;
    private String city;

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
