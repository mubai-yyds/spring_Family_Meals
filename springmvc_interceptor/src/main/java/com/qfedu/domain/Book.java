package com.qfedu.domain;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.24 20:29
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

    @Override//toString没什么用 只是用来调试程序
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}