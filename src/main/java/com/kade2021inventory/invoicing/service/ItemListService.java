package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.pojo.ItemList;

import java.util.List;
import java.util.Map;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/6 11:53
 * @Description:
 * @version：1.0
 **/
public interface ItemListService {
    List<ItemList> selectAll(Map<String,Object> m);
    int pageCount();
    int pageCountBy(Map<String,Object> m);
    List<ItemList> selectBy(Map<String,Object> m);
    int addItem(ItemList itemList);
    int update(ItemList itemList);
    int delete(Integer id);
}
