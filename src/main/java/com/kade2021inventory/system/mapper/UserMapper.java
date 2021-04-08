package com.kade2021inventory.system.mapper;

import com.kade2021inventory.system.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 16:38
 * @Description:
 * @version：1.0
 **/
@Mapper
@Repository
public interface UserMapper {
    List<User> selectAll();
    int addUser(User u);
    int update(User u);
    int delete(User u);
}
