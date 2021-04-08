package com.kade2021inventory.system.mapper;

import com.kade2021inventory.system.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 15:14
 * @Description:
 * @version：1.0
 **/
@Mapper
@Repository
public interface MenuMapper {
    List<Menu> selectAll();
    int addMenu(Menu m);
    int update(Menu m);
    int delete(int id);

}
