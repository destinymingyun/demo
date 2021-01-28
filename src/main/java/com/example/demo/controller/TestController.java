package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试用途的Controller
 */
@Controller //  标注为Controller
@RequestMapping("/test")    //  标注任何请求
public class TestController {
    /**
     * 一个简单的测试Spring-Mvc是否可用，具体路径会拼接为
     *  localhost:8080/test/hello
     * @return 返回hello字符串显示在页面
     */
    @GetMapping("/hello")   //  只接受Get请求
    @ResponseBody   //  标注返回的是Json而不是html页面
    public String hello() {
        return "hello 前后端未分离";
    }
}
