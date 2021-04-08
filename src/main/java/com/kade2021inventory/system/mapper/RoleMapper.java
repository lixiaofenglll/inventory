package com.kade2021inventory.system.mapper;

import com.kade2021inventory.system.pojo.Role;

import java.util.List;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 15:28
 * @Description:
 * @version：1.0
 **/
public interface RoleMapper {
    List<Role> selectAll();
}
