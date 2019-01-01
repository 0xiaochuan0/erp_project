package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("temp")
public class TempController {

    @RequestMapping("main")
    public String mainHtml(){
        return "main";
    }

    @RequestMapping("home")
    public String homeHtml(){
        return "user/homepage";
    }
}
