package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 账户的业务层实现类
 * 曾经的xml配置
 *   <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 *   scope=" " init-method="" destory-method="">
 *   <property name=""  value="" |ref=""></property>
 *   ></bean>
 *   用于创建对象的
 *          他们的作用就是和xml配置文件中编写一个<bean>标签实现的功能是一致的
 *          @component：
 *          作用：用于把当前类对象存入spring容器中
 *          value:用于指定bean的id，当我们不写时，默认值是当前类名，且首字母改小写
 *         controller:一般用于变现层
 *         Service：一般用于业务层
 *         Repository:一般用于持久层
 *         以上三个注解 的作用和属性和 component一致
 *         他们三个是spring框架为我们提供明确的三层使用的注解，使我们对三层更加清晰
 *   用于注入数据的
 *          他们的作用就是和xml配置文件中的bean标签中<property>标签的作用是一致的
 *          Autowired:
 *          作用：自动按照类型注入，只要容器中有唯一的bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          如果ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 *          如果ioc有多个类型匹配时，
 *       出现位置：
 *          可以是变量上，也可以是方法上
 *       细节：
 *          在使用注解注入是，set方法就不是必须的了
 *           Qualifier:
 *  *          作用：在按照类中注入的基础之上再按照名称注入。它在给类成员注入时不能单独使用。但是在给方法参数注入时可以（稍后我们讲）
 *  *          属性：
 *  *              value：用于指定注入bean的id。
 *   Resource
 *  *          作用：直接按照bean的id注入。它可以独立使用
 *  *          属性：
 *  *              name：用于指定bean的id。
 *  *      以上三个注入都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解实现。
 *  *      另外，集合类型的注入只能通过XML来实现。
 *  *
 *  *      Value
 *  *          作用：用于注入基本类型和String类型的数据
 *  *          属性：
 *  *              value：用于指定数据的值。它可以使用spring中SpEL(也就是spring的el表达式）
 *  *                      SpEL的写法：${表达式}
 *   用于改变作用范围的
 *          他们的作用就是和bean标签中 scope属性实现功能是一致的
 *   和生命周期一致
 *          他的作用就是和bean标签中init-method和destory-method方法作用是一样 的
 *
 *
 */
/**
 * 只有一个value可以省略不写，但是有两个参数时必须写
* */
//@Component
//@Component(value="accountService")
@Component("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    //    @Qualifier("accountDao1")
     @Resource(name = "accountDao2")
    private IAccountDao accountDao ;

    public void  saveAccount(){

        accountDao.saveAccount();

    }
}
