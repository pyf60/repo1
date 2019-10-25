package com.itheima.service.impl;

import com.itheima.Dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
//    业务层调用持久层
//    Autowired自动注入，可省略set方法
    @Autowired
   private IAccountDao accountDao;



    public List<Account> findAllAccount() {
      return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }
}
