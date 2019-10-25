package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类，该类可能存在于jar包，我们无法提供修改源码的方式提供默认构造函数
 */
public class staticFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }

}
