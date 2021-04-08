package com.kade2021inventory.system.pojo;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 11:47
 * @Description:
 * @version：1.0
 **/
public class Role {
    private Integer id;
    private String roleName;
    private Integer status;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Role() {
    }

    public Role(Integer id, String roleName, Integer status) {
        this.id = id;
        this.roleName = roleName;
        this.status = status;
    }
}