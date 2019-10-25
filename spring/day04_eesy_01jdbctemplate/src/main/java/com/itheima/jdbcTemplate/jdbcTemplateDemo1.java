package com.itheima.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * jdbcTemplate最基本用法
 * */
public class jdbcTemplateDemo1 {
    public static void main(String[] args) {
//准备数据源，spring内置数据源
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/eesy");
        ds.setUsername("root");
        ds.setPassword("root");
//        创建jdbcTemplate对象
        JdbcTemplate jt=new JdbcTemplate();
        jt.setDataSource(ds);
        jt.execute("insert into account(name,money) values('ccc',1000)");

    }
}
