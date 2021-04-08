package com.kade2021inventory.system.pojo;

import java.sql.Time;

/**
 * @Auther: lixiaofeng
 * @Date:2021/4/7 11:47
 * @Description:
 * @version：1.0
 **/
public class User {
    private Integer id;
    //用户名
    private String userName;
    //密码
    private String password;
    //职员连接
    private Integer staffConnection;
//    业务职员连接
    private Integer businessStaffConnection;
//    姓名
    private String name;
//    公司电话
    private String companyPhone;
//    手机号
    private String mobilePhone;
//    电子邮箱
    private String email;
//    摘要
    private String summary;
//    部门
    private String dept;
//    上班开始时间
    private Time startWorkTime;
//    上班结束时间
    private Time endWorkTime;
//    语言
    private Integer language;
//    多重登录
    private Integer multipleLogin;
//    状态
    private Integer status;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", staffConnection=" + staffConnection +
                ", businessStaffConnection=" + businessStaffConnection +
                ", name='" + name + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", summary='" + summary + '\'' +
                ", dept='" + dept + '\'' +
                ", startWorkTime=" + startWorkTime +
                ", endWorkTime=" + endWorkTime +
                ", language=" + language +
                ", multipleLogin=" + multipleLogin +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStaffConnection() {
        return staffConnection;
    }

    public void setStaffConnection(Integer staffConnection) {
        this.staffConnection = staffConnection;
    }

    public Integer getBusinessStaffConnection() {
        return businessStaffConnection;
    }

    public void setBusinessStaffConnection(Integer businessStaffConnection) {
        this.businessStaffConnection = businessStaffConnection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Time getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(Time startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public Time getEndWorkTime() {
        return endWorkTime;
    }

    public void setEndWorkTime(Time endWorkTime) {
        this.endWorkTime = endWorkTime;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public Integer getMultipleLogin() {
        return multipleLogin;
    }

    public void setMultipleLogin(Integer multipleLogin) {
        this.multipleLogin = multipleLogin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User() {
    }

    public User(Integer id, String userName, String password, Integer staffConnection, Integer businessStaffConnection, String name, String companyPhone, String mobilePhone, String email, String summary, String dept, Time startWorkTime, Time endWorkTime, Integer language, Integer multipleLogin, Integer status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.staffConnection = staffConnection;
        this.businessStaffConnection = businessStaffConnection;
        this.name = name;
        this.companyPhone = companyPhone;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.summary = summary;
        this.dept = dept;
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
        this.language = language;
        this.multipleLogin = multipleLogin;
        this.status = status;
    }
}