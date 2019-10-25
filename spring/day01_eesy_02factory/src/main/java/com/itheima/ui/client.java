package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAcountService;
import com.itheima.service.impl.IAcountServiceImpl;

/**
 * 模拟表现层调用业务层
 * 模拟层——>业务层——>持久层
 */
public class client {
    public static void main(String[] args) {
//        IAcountService as=new IAcountServiceImpl();

        for (int i = 0; i < 5; i++) {
            IAcountService as = (IAcountService) BeanFactory.getBean("accountService");
            System.out.println(as);
        }


//        as.saveAccount();
    }
}
