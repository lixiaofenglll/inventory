package com.kade2021inventory.invoicing.pojo;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/6 10:36
 * @Description:
 * @version：1.0
 **/
public class ItemList {
    //'编号',
    private Integer id;
    // '材质',
    private String material;
    //'品目编码',
    private String itemId;
    //'商品名称',
    private String product;
    //'规格信息',
    private String specificationInfo;
    //'单位',
    private String unit;
    //'查询关键词',
    private String queryKeywords;
    // '供应商编码',
    private String supplierCode;
    //'供应商名称',
    private String supplierName;
    //'生产流程名',
    private String productionProcessName;
    //'图片',
    private String productImage;
    //'品目类型',
    private String itemType;
    // '分级组合名',
    private String hierarchicalCombinationName;
    //'文件管理',
    private String fileManagement;
    //'备注'
    private String remarks;

    @Override
    public String toString() {
        return "ItemList{" +
                "id=" + id +
                ", material='" + material + '\'' +
                ", itemId='" + itemId + '\'' +
                ", product='" + product + '\'' +
                ", specificationInfo='" + specificationInfo + '\'' +
                ", unit='" + unit + '\'' +
                ", queryKeywords='" + queryKeywords + '\'' +
                ", supplierCode='" + supplierCode + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", productionProcessName='" + productionProcessName + '\'' +
                ", productImage='" + productImage + '\'' +
                ", itemType='" + itemType + '\'' +
                ", hierarchicalCombinationName='" + hierarchicalCombinationName + '\'' +
                ", fileManagement='" + fileManagement + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getSpecificationInfo() {
        return specificationInfo;
    }

    public void setSpecificationInfo(String specificationInfo) {
        this.specificationInfo = specificationInfo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getQueryKeywords() {
        return queryKeywords;
    }

    public void setQueryKeywords(String queryKeywords) {
        this.queryKeywords = queryKeywords;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductionProcessName() {
        return productionProcessName;
    }

    public void setProductionProcessName(String productionProcessName) {
        this.productionProcessName = productionProcessName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getHierarchicalCombinationName() {
        return hierarchicalCombinationName;
    }

    public void setHierarchicalCombinationName(String hierarchicalCombinationName) {
        this.hierarchicalCombinationName = hierarchicalCombinationName;
    }

    public String getFileManagement() {
        return fileManagement;
    }

    public void setFileManagement(String fileManagement) {
        this.fileManagement = fileManagement;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ItemList() {
    }

    public ItemList(Integer id, String material, String itemId, String product, String specificationInfo, String unit, String queryKeywords, String supplierCode, String supplierName, String productionProcessName, String productImage, String itemType, String hierarchicalCombinationName, String fileManagement, String remarks) {
        this.id = id;
        this.material = material;
        this.itemId = itemId;
        this.product = product;
        this.specificationInfo = specificationInfo;
        this.unit = unit;
        this.queryKeywords = queryKeywords;
        this.supplierCode = supplierCode;
        this.supplierName = supplierName;
        this.productionProcessName = productionProcessName;
        this.productImage = productImage;
        this.itemType = itemType;
        this.hierarchicalCombinationName = hierarchicalCombinationName;
        this.fileManagement = fileManagement;
        this.remarks = remarks;
    }
}