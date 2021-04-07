package com.kade2021inventory.invoicing.controller;

import com.kade2021inventory.utils.WaerhouseType;
import com.kade2021inventory.invoicing.pojo.Warehouse;
import com.kade2021inventory.invoicing.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/

@RestController
public class WarehouseController {
    @Autowired
    private  WarehouseService warehouseService;


    /**
     * 添加
     * @param map
     * @return
     */
    @PostMapping("/addWarehouse")
    public int Test01(@RequestParam Map<String,Object> map) {
        int id = Integer.valueOf((String) map.get("id"));//获取id
        String warehouseName = (String) map.get("warehouseName");//获取仓库名称
        int num = 0;
        if (warehouseService.EXCEPTIONById(id) >= 1) {//判断id是否重复
            num = WaerhouseType.BYID_REPETITION_EXCEPTION.getCode();//id重复异常
        } else if (warehouseService.repetitionName(warehouseName) >= 1) {//判断仓库名称是否重复
            num = WaerhouseType.NAME_REPETITION_EXCEPTION.getCode();//仓库名称重复异常
        }
        if(num==0)
            num = warehouseService.insertWarehouse(map);//调用添加
        return  num;
    }

    /**
     * 仓库列表
     * @param map
     * @return
     */
    @GetMapping("/indexWarehouse")
    public List<Warehouse> Test02(@RequestParam Map<String,Object> map){
        List<Warehouse> warehouses = warehouseService.ListWarehouse(map);
        return warehouses;
    }

    /**
     * 多选删除
     * @param id
     * @return
     */
    @RequestMapping("/doDeleteObjects")
    public int doDeleteObjects(Integer...id) {
        int num=0;
        try {
            num = warehouseService.deleteObjects(id);//执行删除语句
        }catch (Exception e){
            num=WaerhouseType.UNKNOW_EXCEPTION.getCode();//错误状态码
        }
        if (num==0){
           num= WaerhouseType.NULL_EXCEPTION.getCode();//删除失败状态码
            return num;
        }
        return num;
    }


}
