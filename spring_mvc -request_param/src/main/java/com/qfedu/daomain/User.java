package com.qfedu.daomain;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.22 17:47
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class User {

    private String name;
    private int  age;
    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
