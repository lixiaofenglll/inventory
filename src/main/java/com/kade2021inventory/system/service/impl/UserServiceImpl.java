package com.kade2021inventory.system.service.impl;

import com.kade2021inventory.system.pojo.User;
import com.kade2021inventory.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 19:11
 * @Description:
 * @version：1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired

    @Override
    public List<User> selectAll() {
        return null;
    }
}