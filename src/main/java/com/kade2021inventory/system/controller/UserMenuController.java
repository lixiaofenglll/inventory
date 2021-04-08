package com.kade2021inventory.system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/8 15:23
 * @Description:
 * @version：1.0
 **/
@RestController
@RequestMapping("/UserMenu")
public class UserMenuController {
     @PostMapping("/getMenu")
    public String getMenu(){
        return "";
     }
}