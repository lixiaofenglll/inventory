package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.dao.WarehouseMapper;
import com.kade2021inventory.invoicing.pojo.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/
@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseMapper warehouseMapper;
    //增加仓库列表
    public int insertWarehouse(Map<String, Object> map) {
        return warehouseMapper.insertWarehouse(map);
    }
   //判断id是否重复
    public int EXCEPTIONById(int id) {
        return warehouseMapper.EXCEPTIONById(id);
    }
    //判断仓库名是否重复
    public int repetitionName(String warehouseName) {
        return warehouseMapper.repetitionName(warehouseName);
    }

   //查询仓库列表
    public List<Warehouse> ListWarehouse(Map<String, Object> map) {
        return warehouseMapper.ListWarehouse(map);
    }

    //多选删除
    public int deleteObjects(Integer... id) {
        return warehouseMapper.deleteObjects(id);
    }
}
