package com.itheima.factory;


import com.itheima.service.IAccountService;
import com.itheima.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 用于创建service的代理对象工厂
 * */
public class BeanFactory {
    private IAccountService accountService;
    private TransactionManager txManage;

    public void setTxManage(TransactionManager txManage) {
        this.txManage = txManage;
    }

    public final void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
    /**
     * 获取service的代理对象
     * @param
     */
    public IAccountService getAccountService() {
        return (IAccountService)Proxy.newProxyInstance(accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces()
                , new InvocationHandler() {
                    /**
                     * 添加事务支持
                     * @param proxy
                     * @param method
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("test".equals(method.getName())){
                            return method.invoke(accountService,args);
                        }
                        Object rtValue = null;
                        try {
                            //            开启事务
                            txManage.beginTransaction();
                            //            执行操作
                            rtValue =  method.invoke(accountService,args);
                            //            提交事务
                            txManage.commit();
                            //            返回结果
                            return rtValue;
                        } catch (Exception e) {
                            txManage.rollback();
                            throw new RuntimeException(e);
                        } finally {
                            txManage.release();
                        }
                    }
                });
    }
}
