package com.kade2021inventory.invoicing.pojo;


/**
 * @Auther: zhangsan
 * @Date:凌端辉
 * @Description:
 * @version：1.0
 **/

public class Warehouse {
    private int id;
    private String warehouseName;
    private String warehouseType;
    private String flowName;
    private String OutsourcingunitName;
    private int state;

    public Warehouse(int id, String warehouseName, String warehouseType, String flowName, String outsourcingunitName, int state) {
        this.id = id;
        this.warehouseName = warehouseName;
        this.warehouseType = warehouseType;
        this.flowName = flowName;
        OutsourcingunitName = outsourcingunitName;
        this.state = state;
    }

    public Warehouse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public String getOutsourcingunitName() {
        return OutsourcingunitName;
    }

    public void setOutsourcingunitName(String outsourcingunitName) {
        OutsourcingunitName = outsourcingunitName;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", warehouseName='" + warehouseName + '\'' +
                ", warehouseType='" + warehouseType + '\'' +
                ", flowName='" + flowName + '\'' +
                ", OutsourcingunitName='" + OutsourcingunitName + '\'' +
                ", state=" + state +
                '}';
    }
}
