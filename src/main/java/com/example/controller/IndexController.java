package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IDEA
 * author : chengbaiming
 * Date : 2019/2/27 0027
 * Time : 下午 2:53
 */
@Controller
@RequestMapping("/home")
public class IndexController {
/**
http://localhost/myMVCdemo/home/index
 */
    @RequestMapping("/index")
    public String index(){
        System.out.println("index is a jsp.");
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("This is hello request comming.");
        return "index";
    }
}
