package com.itheima.service.impl;



import com.itheima.service.IAccountService;

import java.util.*;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl3 implements IAccountService {
public String[] myStrs;
public List<String> myList;
public Set<String> mySet;
public Map<String,String> myMap;
public Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void  saveAccount(){

        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(myMap);
        System.out.println(mySet);
        System.out.println(myProps);

    }


}
