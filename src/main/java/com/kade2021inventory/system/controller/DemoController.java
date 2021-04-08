package com.kade2021inventory.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("/goDemo")
    public String goDemo(){
        return "demo";
    }
}
