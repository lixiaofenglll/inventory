package com.kade2021inventory.invoicing.service.impl;

import com.kade2021inventory.invoicing.mapper.ItemListMapper;
import com.kade2021inventory.invoicing.pojo.ItemList;
import com.kade2021inventory.invoicing.service.ItemListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/6 11:54
 * @Description:
 * @version：1.0
 **/
@Service
public class ItemListServiceImpl implements ItemListService {
    @Autowired
    ItemListMapper itemListMapper;
    @Override
    public List<ItemList> selectAll(Map<String,Object> m) {
        return itemListMapper.selectAll(m);
    }

    @Override
    public int pageCountBy(Map<String, Object> m) {
        return itemListMapper.pageCountBy(m);
    }

    @Override
    public List<ItemList> selectBy(Map<String, Object> m) {
        return itemListMapper.selectBy(m);
    }

    @Override
    public int addItem(ItemList itemList) {
        return itemListMapper.addItem(itemList);
    }

    @Override
    public int update(ItemList itemList) {
        return itemListMapper.update(itemList);
    }

    @Override
    public int delete(Integer id) {
        return itemListMapper.delete(id);
    }

    @Override
    public int pageCount() {
        return itemListMapper.pageCount();
    }
}