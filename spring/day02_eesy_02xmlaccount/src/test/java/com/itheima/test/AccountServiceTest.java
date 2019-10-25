package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
* 使用junit单元测试。测试配置
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {
    @Autowired
    private IAccountService as=null;

    @Test
    public void testFindAll(){

//        执行方法
        List<Account> allAccount = as.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }

    }

    @Test
    public void testFindOne(){

//        执行方法
        Account accountById = as.findAccountById(1);
        System.out.println(accountById);
    }

    @Test
    public void testSave(){

//        执行方法
        Account account=new Account();
        account.setName("zhangsan");
        account.setMoney(200.0f);
        as.saveAccount(account);

//        遍历
        List<Account> allAccount = as.findAllAccount();
        for (Account account1 : allAccount) {
            System.out.println(account1);
        }
    }

    @Test
    public void testUpdate(){

//        执行方法
        Account account =  as.findAccountById(4);
       account.setMoney(2334f);
       as.updateAccount(account);
    }

    @Test
    public void testDelete(){

//        执行方法
        as.deleteAccount(4);
    }
}
