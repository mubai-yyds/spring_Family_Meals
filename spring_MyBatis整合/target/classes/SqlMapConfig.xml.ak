<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE configuration PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">

<!--初始化属性数据-->
<configuration>
    <properties resource="jdbc.properties"/>

<!--    初始化类型别名-->
    <typeAliases>
        <package name="com.qfenu.daomain"/>
    </typeAliases>

<!--    初始化dataSource-->
    <environments default="mysql">
        <environment id="mysql">
<!--            事务管理 JDBC-->
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
                <property name="driver" value="${jdbc.driver}"/>
                <property name="url" value="${jdbc.url}"/>
                <property name="username" value="${jdbc.username}"/>
                <property name="password" value="${jdbc.password}"/>
            </dataSource>
        </environment>
    </environments>

<!--    初始化映射配置-->
<!--    跟随着业务变化-->
    <mappers>
        <package name="com.qfedu.dao"/>
    </mappers>
    
    
</configuration>

