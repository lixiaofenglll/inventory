package com.kade2021inventory.system.service;

import com.kade2021inventory.system.pojo.User;

import java.util.List;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 19:10
 * @Description:
 * @version：1.0
 **/
public interface UserService {
    List<User> selectAll();
}
