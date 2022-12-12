package com.qfedu.dao.impl;

import com.qfedu.dao.BookDao;

/**
 * @Author liuhuanhuan
 * @Data 2022 11.07 20:20
 * @Phone 15270705865
 * @Post 3268483030@qq.com
 */
//Spring 的异常从最下面开始查看
//数据层
public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("constructor...");
    }

    public void sava() {

        System.out.println("book void  save ...");

    }

    //    //加载properties文件
//    private String name;
//
//    public void setName(String name) {
//        this.name = name;
//    }


////spring管理第三方资源的数据
//    private int[] array;
//    private List<String> list;
//    private Set<String> set;
//    private Map<String , String> map;
//    private Properties properties;
//
//    public void setArray(int[] array){this.array =array;}
//    public void setList(List<String> list){this.list = list;}
//    public void setSet(Set<String> set){this.set = set;}
//    public void setMap(Map<String , String> map){this.map = map;}
//    public void setProperties(Properties properties){this.properties = properties;}
//
//
//
//    public void sava() {
//
//        System.out.println("book void save...");
//
//        System.out.println("遍历数组："+ Arrays.toString(array));
//        System.out.println("遍历List" + list);
//        System.out.println("遍历Set" + set);
//        System.out.println("遍历Map" + map);
//        System.out.println("遍历Properties" + properties);
//    }
}