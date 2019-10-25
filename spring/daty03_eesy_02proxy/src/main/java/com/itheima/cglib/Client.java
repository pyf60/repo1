package com.itheima.cglib;

import com.itheima.Proxy.IProduct;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟消费*/
public class Client {
    public static void main(String[] args) {
       final Producer producer=new Producer();
        /**
         * 动态代理：
         *  特点：字节码随用随创建，随用随加载
         *  作用：不修改源码情况下对方法进行增强
         *  分类：基于接口的动态代理
         *       基于子类的动态代理
         *  基于子类的动态代理
         *      涉及的类：EnHancer
         *      提供者：第三方
         *    如何创建代理对象
         *    使用EnHance类中的create方法
         *    创建代理对象的要求：被代理不能是最终类
         *newProxyInstance参数：
         *   ClassLoader：类加载器
         *  它是用于加载代理对象字节码的。和被代理对象使用相同的类加载器。固定写法。
         *      Class[]：字节码数组
         *   它是用于让代理对象和被代理对象有相同方法。固定写法。
         *    InvocationHandler：用于提供增强的代码
         *   它是让我们写如何代理。我们一般都是些一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的。
         *       此接口的实现类都是谁用谁写。
         *
        * */




    }
}
