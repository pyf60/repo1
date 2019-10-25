package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import config.JdbcConfig;
import config.SpringConfigration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
* 使用junit单元测试。测试配置
 * Spring整合Junit的jar包
 * 1.导入spring的jar包坐标
 * 2.使用Junit提供的一个注解把原有的main方法替换掉，替换成spring提供的@Runwith
 * 3.告知spr的运行器，spring和ioc创建时基于xml注解 的，并且说明位置ContextConfiguration
 *      ContextConfiguration
 *          locations:指定xml的位置加上classpath关键字，表示在类路径下，
 *          classes：指定注解所在位置
 *
 *    细节：当使用spring版本时，spring要求Junit的jar包必须是4,。1.2及以上
* */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfigration.class)
public class AccountServiceTest {
//    private ApplicationContext ac;
    @Autowired
    private IAccountService as=null;
  /*  @Before
    public void init(){
        //获取容器
        ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        *//*获取业务层对象*//*
        as = ac.getBean("accountService", IAccountService.class);
    }*/


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
/*//获取容器
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        *//*获取业务层对象*//*
        IAccountService as = ac.getBean("accountService", IAccountService.class);*/
//        执行方法
        Account accountById = as.findAccountById(1);
        System.out.println(accountById);
    }

    @Test
    public void testSave(){
 /*       //获取容器
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        *//*获取业务层对象*//*
        IAccountService as = ac.getBean("accountService", IAccountService.class);*/
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
   /*     //获取容器
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        *//*获取业务层对象*//*
        IAccountService as = ac.getBean("accountService", IAccountService.class);*/
//        执行方法
        Account account =  as.findAccountById(6);
       account.setMoney(2334f);
       as.updateAccount(account);
    }

    @Test
    public void testDelete(){
     /*   //获取容器
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfigration.class);
        *//*获取业务层对象*//*
        IAccountService as = ac.getBean("accountService", IAccountService.class);*/
//        执行方法
        as.deleteAccount(5);
    }
}
