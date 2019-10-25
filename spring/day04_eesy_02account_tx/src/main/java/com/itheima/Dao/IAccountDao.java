package com.itheima.Dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 账户持久层接口
 */
public interface IAccountDao {
    /**
     * 查询所有
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查找一个
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     *报存
     * @param account
     */

    void saveAccount(Account account);

    /**
     * 修改
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据id删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 根据名称查询账户
     * @param accountName
     * @return 如果有唯一的一个结果，就返回，如果出现多个结果就抛异常
     *          如果没有结果就返回null
     */
    Account findAccountByName(String accountName);
}
