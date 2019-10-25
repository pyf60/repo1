package com.itheima.service.impl;

import com.itheima.dao.IAcountDao;
import com.itheima.dao.impl.IAcountDaoImpl;
import com.itheima.factory.BeanFactory;
import com.itheima.service.IAcountService;
/**
 * 账户业务层实现类
 * */
public class IAcountServiceImpl implements IAcountService {
//    private IAcountDao accountDao=new IAcountDaoImpl();

    private IAcountDao accountDao = (IAcountDao)BeanFactory.getBean("accountDao");
    public void saveAccount() {

        accountDao.saveAccount();
    }
}
