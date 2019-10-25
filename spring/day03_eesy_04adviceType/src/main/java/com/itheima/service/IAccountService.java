package com.itheima.service;

/**
 * 账户业务层接口
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     * 无返回值无参
     */
        void saveAccount();

    /**
     * 模拟更新账户
     * 无返回值有参
     * @param i
     */
        void updateAccount(int i);

    /**
     * 模拟删除账户
     * 有返回值有参
     * @return
     */
        int deleteAccount();

 }
