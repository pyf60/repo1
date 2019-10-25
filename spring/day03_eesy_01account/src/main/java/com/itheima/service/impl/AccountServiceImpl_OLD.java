package com.itheima.service.impl;

import com.itheima.Dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;

import java.util.List;

/**
 * 账户业务层实现类
 */
public class AccountServiceImpl_OLD implements IAccountService {
//    业务层调用持久层
   private IAccountDao accountDao;
   private TransactionManager txManage;

    public void setTxManage(TransactionManager txManage) {
        this.txManage = txManage;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setAccuntDAo(IAccountDao accountDAo) {
        this.accountDao = accountDAo;
    }

    public List<Account> findAllAccount() {
        try {
//            开启事务
            txManage.beginTransaction();
//            执行操作
            List<Account> account = accountDao.findAllAccount();
//            提交事务
            txManage.commit();
//            返回结果
            return account;
        } catch (Exception e) {
            txManage.rollback();
            throw new RuntimeException(e);
        } finally {
            txManage.release();
        }
    }

    public Account findAccountById(Integer accountId) {
        try {
//            开启事务
            txManage.beginTransaction();
//            执行操作
            Account accountById = accountDao.findAccountById(accountId);
//            提交事务
            txManage.commit();
//            返回结果
            return accountById;
        } catch (Exception e) {
            txManage.rollback();
            throw new RuntimeException(e);
        } finally {
            txManage.release();
        }

    }

    public void saveAccount(Account account) {
        try {
//            开启事务
            txManage.beginTransaction();
//            执行操作
            accountDao.saveAccount(account);
//            提交事务
            txManage.commit();
//            返回结果

        } catch (Exception e) {
            txManage.rollback();
        } finally {
            txManage.release();
        }

    }

    public void updateAccount(Account account) {
        try {
//            开启事务
            txManage.beginTransaction();
//            执行操作
            accountDao.updateAccount(account);
//            提交事务
            txManage.commit();
//            返回结果

        } catch (Exception e) {
            txManage.rollback();
        } finally {
            txManage.release();
        }

    }

    public void deleteAccount(Integer accountId) {
        try {
//            开启事务
            txManage.beginTransaction();
//            执行操作
            accountDao.deleteAccount(accountId);
//            提交事务
            txManage.commit();


        } catch (Exception e) {
            txManage.rollback();
        } finally {
            txManage.release();
        }
        accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, float money) {
        try {
//           1. 开启事务
            txManage.beginTransaction();
//           2. 执行操作
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
//        3.提交事务
            txManage.commit();

        } catch (Exception e) {
            txManage.rollback();
            e.printStackTrace();
        } finally {
            txManage.release();
        }






    }

}
