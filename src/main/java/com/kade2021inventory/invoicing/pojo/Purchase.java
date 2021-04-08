package com.kade2021inventory.invoicing.pojo;

import java.util.Date;

public class Purchase {
    private Date date;
    private String companyName;
    private String employee;
    private String goods;
    private int account;
    private int print;

    public Purchase() {
    }

    public Purchase(Date date, String companyName, String employee, String goods, int account, int print) {
        this.date = date;
        this.companyName = companyName;
        this.employee = employee;
        this.goods = goods;
        this.account = account;
        this.print = print;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getPrint() {
        return print;
    }

    public void setPrint(int print) {
        this.print = print;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "date=" + date +
                ", companyName='" + companyName + '\'' +
                ", employee='" + employee + '\'' +
                ", goods='" + goods + '\'' +
                ", account=" + account +
                ", print=" + print +
                '}';
    }
}
