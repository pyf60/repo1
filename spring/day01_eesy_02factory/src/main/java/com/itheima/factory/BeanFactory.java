package com.itheima.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Bean:在计算机英语中，有可重用组件的含义
 * javaBean：用java语言编写的可重用组件，
 *          javaBean>实体类（范围大小）
 *他就是创建Service与dao对象的
 * 1.需要一个配置文件配置service与dao
 *          配置的内容
 *          ··  唯一标识=全限定类名（key-value)
 * 2.通过读取配置文件中配置的内容，反射创建对象
 *
 * 选用两方式xml，properties
 */
public class BeanFactory {
//    定义一个properties对象
    private static Properties props;
//    使用静态代码块weiProperties赋值
    static {

    try {
 //        初始化，实例化
        props=new Properties();
//        获取properties流对象
        /**
         * 获取文件一般不要使用绝对路径，不能确保文件一直在同一位置
         */
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        props.load(in);
    } catch (IOException e) {
        throw new ExceptionInInitializerError("初始化properties失败！");
    }
}

    /**
     * 根据bean名称获取bean对象
     * @param beanName
     * @return
     */
public static Object getBean(String beanName)  {
    Object bean = null;
    try {
        String beanPath = props.getProperty(beanName);
//            System.out.println(beanPath);
        bean = Class.forName(beanPath).newInstance();//每次都会调用默认构造函数创建对象
    }catch (Exception e){
        e.printStackTrace();
    }
    return bean;
}
}

