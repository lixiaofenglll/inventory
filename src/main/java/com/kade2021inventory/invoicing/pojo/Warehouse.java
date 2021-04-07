package com.kade2021inventory.invoicing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
    private int id;
    private String warehouseName;
    private String warehouseType;
    private String flowName;
    private String OutsourcingunitName;
    private int state;

}
