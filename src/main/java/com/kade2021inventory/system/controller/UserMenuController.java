package com.kade2021inventory.system.controller;

import com.kade2021inventory.system.pojo.User;
import com.kade2021inventory.system.service.UserRoleService;
import com.kade2021inventory.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    RedisUtils redisUtils;
    @Autowired
    UserRoleService userRoleService;
     @PostMapping("/getMenu")
    public String getMenu(){
         User user = (User)redisUtils.getByKey("user");

         return "";
     }
}