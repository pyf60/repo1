package com.itheima.cglib;

import com.itheima.Proxy.IProduct;

/**
 * 一个生产者
 */
public class Producer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money){
        System.out.println("销售产品并拿到"+money);
    }

    /**
     * 售后
     * @param money
     */
    public void afterService(float money){
        System.out.println("提供销售服务，并拿到"+money);
    }




}
