package com.itheima.test;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试aop
 */
public class AOPTest {

    public static void main(String[] args) {
//        1.测试容器
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
//        2.获取对象
        IAccountService as =(IAccountService) ac.getBean("accountService");
//        3.执行方法
        as.saveAccount();

    }





}
