package com.kade2021inventory.invoicing.mapper;

import com.kade2021inventory.invoicing.pojo.ItemList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/6 10:46
 * @Description:
 * @version：1.0
 **/
@Mapper
@Repository
public interface ItemListMapper {
    List<ItemList> selectAll(Map<String,Object> m);
    int pageCount();
    int pageCountBy(Map<String,Object> m);
    List<ItemList> selectBy(Map<String,Object> m);
    int addItem(ItemList itemList);
    int update(ItemList itemList);
    int delete(Integer id);
}
