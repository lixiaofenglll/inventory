package com.kade2021inventory.system.pojo;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 11:46
 * @Description:
 * @version：1.0
 **/
public class Menu {
    private Integer id;
    private String menuName;
    private String menuUrl;
    private Integer status;

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuName='" + menuName + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Menu() {
    }

    public Menu(Integer id, String menuName, String menuUrl, Integer status) {
        this.id = id;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.status = status;
    }
}