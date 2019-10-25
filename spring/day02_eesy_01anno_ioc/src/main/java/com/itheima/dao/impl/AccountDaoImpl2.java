package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao {

    public  void saveAccount(){

        System.out.println("保存了账户111111111111111");
    }
}
