package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.pojo.Warehouse;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/
public interface WarehouseService {
    int insertWarehouse(Map<String,Object> map);
    int EXCEPTIONById(int id);
    int repetitionName(String warehouseName);
    List<Warehouse> ListWarehouse(Map<String,Object> map);
    int deleteObjects(@Param("id")Integer...id);
}
