package com.wx.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: WX
 * @create: 2019-11-04 10:34
 **/
@RestController
@RequestMapping("/main")
public class TestController {

    @Value("${test}")
    private String test;

    @RequestMapping("/test")
    public String test(){
        return test;
    }

    @RequestMapping("/add")
    public String add(){
        return "add323";
    }


    public static void main(String[] args) {
        String ss = "ssss";
        System.out.println(ss.hashCode());
    }

}
