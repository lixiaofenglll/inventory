package com.kade2021inventory.system.mapper;

import com.kade2021inventory.system.pojo.Menu;

import java.util.List;
import java.util.Map;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 15:14
 * @Description:
 * @version：1.0
 **/
public interface MenuMapper {
    List<Menu> select(Map<String,Object>m);

}
