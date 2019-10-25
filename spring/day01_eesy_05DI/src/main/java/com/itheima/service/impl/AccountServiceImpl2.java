package com.itheima.service.impl;



import com.itheima.service.IAccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl2 implements IAccountService {


//有构造函数，但是不是默认构造函数,第一种创建bean方法失败
/*public AccountServiceImpl(){
    System.out.println("对象创建了");

}*/
//如果是经常变化的数据，不应使用注入的方式
        private String name;
        private  Integer age;
        private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void  saveAccount(){

        System.out.println("service中的saveaccount执行了"+name+age+birthday);

    }


}
