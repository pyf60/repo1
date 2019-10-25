package com.itheima.service.impl;

import com.itheima.Dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;


import java.util.List;

/**
 * 账户业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
//    业务层调用持久层
   private IAccountDao accountDao;


    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setAccuntDAo(IAccountDao accountDAo) {
        this.accountDao = accountDAo;
    }

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

    public void transfer(String sourceName, String targetName, float money) {
        System.out.println("transfer开始执行");
//        2.1根据名称查询转入账户
            Account source=accountDao.findAccountByName(sourceName);
//        2.2根据名称查询转入账户
            Account target=accountDao.findAccountByName(targetName);
//       2.3 转出账户减钱
            source.setMoney(source.getMoney()-money);
//        2.4转入账户加钱
            target.setMoney(target.getMoney()+money);
//        2.5更新转出账户
            accountDao.updateAccount(source);
//        2.6更新转入账户
            accountDao.updateAccount(target);







    }

}
