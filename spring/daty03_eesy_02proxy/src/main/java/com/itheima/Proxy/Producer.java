package com.itheima.Proxy;

/**
 * 一个生产者
 */
public class Producer implements IProduct{
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
