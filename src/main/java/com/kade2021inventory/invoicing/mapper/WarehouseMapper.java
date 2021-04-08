package com.kade2021inventory.invoicing.mapper;
import com.kade2021inventory.invoicing.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/
@Mapper
@Repository
public interface WarehouseMapper {
    //添加 and 判断是否重复
    int insertWarehouse(Map<String,Object> map);
    int EXCEPTIONById(int id);
    int repetitionName(String warehouseName);
    //查询仓库列表
    List<Warehouse> ListWarehouse(Map<String, Object> map);
    //  添加基于id执行日志删除的方法
    int deleteObjects(@Param("id")Integer...id);
}
