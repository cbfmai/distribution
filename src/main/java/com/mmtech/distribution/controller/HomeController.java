package com.mmtech.distribution.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Adam DENG
 * @Date 2018/7/3 9:17
 */
@Controller
public class HomeController {


    @RequestMapping(value = {"/", "/home", "/index"})
    public String home() {
        return "home";
    }

    @RequestMapping("/myinfo")
    public String myinfo() {
        return "myinfo";
    }
}
