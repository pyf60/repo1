package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * 账户业务层接口
 */
public interface IAccountService {
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
}
