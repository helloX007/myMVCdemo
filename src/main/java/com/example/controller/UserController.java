package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/4/24 0024
 * Time : 下午 1:39
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/getAllUser")
    public ModelAndView getUsers(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.selectAll();
        modelAndView.addObject("userList",users);
        modelAndView.setViewName("/show");
        return modelAndView;
    }

    @RequestMapping("/insert")
    public void insert(){
        User user = new User(2,"Alex","123456",24);
        int insert = userService.insert(user);
        System.out.println("新增结果："+insert);
    }

    @RequestMapping("/deleteByPrimaryKey")
    public void deleteByPrimaryKey(){
        System.out.println("删除结果："+userService.deleteByPrimaryKey(2));
    }

    @RequestMapping("/updateByPrimaryKey")
    public void updateByPrimaryKey(){
        System.out.println("修改结果："+userService.updateByPrimaryKey(new User(2,"Alex","654321",24)));
    }
}
