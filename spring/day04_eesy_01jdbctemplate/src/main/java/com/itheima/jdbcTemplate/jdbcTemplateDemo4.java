package com.itheima.jdbcTemplate;

import com.itheima.dao.IAccountDao;
import com.itheima.domai.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * jdbcTemplate最基本用法
 * */
public class jdbcTemplateDemo4 {
    public static void main(String[] args) {
//获取容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        获取对象
        IAccountDao account = ac.getBean("accountDao", IAccountDao.class);
        Account accountById = account.findAccountById(1);
        System.out.println(accountById);

        accountById.setMoney(1090f);
        System.out.println(accountById);


    }
}
