package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.ws.ResponseWrapper;

/**
 * 控制器类
 * */
@Controller
@RequestMapping(path = "/user")
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("hello");
        return  "success";
    }

    /**
     *
     * @return
     */
    //@RequestMapping(path = "/testRequsetMaping",method = {RequestMethod.GET})
    @RequestMapping(path = "/testRequsetMaping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequsetMaping(){
        System.out.println("测试RequestMapping注解");
        return  "success";

    }

}
