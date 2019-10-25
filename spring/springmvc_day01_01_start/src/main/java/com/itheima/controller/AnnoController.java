package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})
public class AnnoController {
    @RequestMapping("/RequestParam")
//    RequestParam必须传输username属性
    public String testRequestParam(@RequestParam(name="username") String username){
        System.out.println("执行了");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
//    RequestParam必须传输username属性
//    RequestBody获取整个请求体
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println("执行了");
        System.out.println(id);
        return "success";
    }
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "accept") String header){
        System.out.println("执行了");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String Cookievalue){
        System.out.println("执行了");
        System.out.println(Cookievalue);
        return "success";
    }


    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("ModelAttribute执行了");
        System.out.println(user);

        return "success";
    }
/*    @ModelAttribute
    public User showUser(String uname){
        System.out.println("showUser执行了");
        User user=new User();
        user.setUname(uname);
        user.setAge(13);
        user.setDate(new Date());
        return user;
    }*/
@ModelAttribute
public void showUser(String uname, Map<String,User> map){
    System.out.println("showUser执行了");
    User user=new User();
    user.setUname(uname);
    user.setAge(13);
    user.setDate(new Date());
    map.put("abc",user);
}
@RequestMapping(value = "/testSessionAttribute")
    public String testSessionAttribute(Model model){
        System.out.println("testSessionAttribute");
        model.addAttribute("msg","美美");
        return "success";
    }
    @RequestMapping(value = "/getSessionAttribute")
    public String getSessionAttribute(ModelMap model){
        System.out.println("testSessionAttribute");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }
    @RequestMapping(value = "/delSessionAttribute")
    public String delSessionAttribute(SessionStatus sessionStatus){
        System.out.println("testSessionAttribute");
       sessionStatus.setComplete();
        return "success";
    }

}
