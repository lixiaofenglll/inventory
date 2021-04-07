package com.kade2021inventory.system.pojo;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 11:47
 * @Description:
 * @version：1.0
 **/
public class RoleMenu {
    private Integer id;
    //角色ID
    private Integer roleId;
        //菜单ID
    private Integer menuId;

    @Override
    public String toString() {
        return "RoleMenu{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public RoleMenu() {
    }

    public RoleMenu(Integer id, Integer roleId, Integer menuId) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
    }
}