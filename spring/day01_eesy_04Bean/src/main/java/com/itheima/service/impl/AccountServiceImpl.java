package com.itheima.service.impl;



import com.itheima.service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {


//有构造函数，但是不是默认构造函数,第一种创建bean方法失败
public AccountServiceImpl(){
    System.out.println("对象创建了");

}

    public void  saveAccount(){

        System.out.println("service中的saveaccount执行了" );

    }

    public void  Init(){

        System.out.println("对象初始化了" );

    }

    public void  destroy(){

        System.out.println("对象销毁了" );

    }
}
