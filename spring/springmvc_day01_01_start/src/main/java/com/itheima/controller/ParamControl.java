package com.itheima.controller;


import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 请求参数绑定
 * */
@Controller
@RequestMapping(path = "/param")
public class ParamControl {

    @RequestMapping(path = "/testParam")
    public String testParam(String username,String password){
        System.out.println("param执行了。。");
        System.out.println("username="+username);
        System.out.println("password="+password);
        return  "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String saveAccount(Account account){
        System.out.println("param执行了。。");
        System.out.println(account);
        return  "success";
    }
//    自动义类型转换器
    @RequestMapping(path = "/saveUser")
    public String saveAccount(User user){
        System.out.println("param执行了。。");
        System.out.println(user);
        return  "success";
    }
    @RequestMapping(path = "/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("param执行了。。");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        System.out.println(response);
        return  "success";
    }


}
