package com.itheima.service;

import com.itheima.domain.Account;

public interface IAccountService {
    /**
     * 根据id查询账户
     * @param accountid
     * @return
     */
    Account findAccountById(Integer accountid);

    /**
     * 转账
     * @param sourceName 转出账户名称
     * @param targetName 转入账户名称
     * @param money 转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
