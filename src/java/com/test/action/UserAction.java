package com.test.action;

import com.opensymphony.xwork2.ActionSupport;
import com.test.entity.User;
import com.test.service.UserService;
import com.test.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private User user;

   @Resource
    private UserService userService;

    public User getUser(){
        return user;
    }
    public String m1(){
        System.out.println("提交调用开始。");
        user=userService.getUser(1);
        String name=user.getUname();
        System.out.println(user.getUname());
        return SUCCESS;
    }
    public String saveUser(){
        User user=new User();
        user.setUname("事务已提交");
        userService.saveUser(user);
        return SUCCESS;
    }


}
