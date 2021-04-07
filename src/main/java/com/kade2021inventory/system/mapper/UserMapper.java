package com.kade2021inventory.system.mapper;

import com.kade2021inventory.system.pojo.User;

import java.util.List;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 16:38
 * @Description:
 * @version：1.0
 **/
public interface UserMapper {
    List<User> selectAll();
}
