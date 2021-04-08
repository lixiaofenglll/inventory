package com.kade2021inventory.invoicing.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    /**
     * 跳转登录页面
     * @return
     */
    @GetMapping("/")
    public String index(){
    return "login";
}
}
