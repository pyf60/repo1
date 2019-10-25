/*
package com.itheima.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

*/
/**
 * 此类用于抽取dao中重复代码
 *//*

public class JdbcDaoSupport {
    private JdbcTemplate jdbcTemplate;
//    在调用时间可以使用get方法调用

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }



    public void setDataSource(DataSource dataSource) {

        if (jdbcTemplate==null){
       jdbcTemplate = createJDBCTemplate(dataSource);
        }
    }

    private JdbcTemplate createJDBCTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
*/
