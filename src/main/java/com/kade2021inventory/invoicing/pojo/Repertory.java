package com.kade2021inventory.invoicing.pojo;

/**
 * @author: Mr Li
 * @Date:2021/4/8
 * @packer:com.kade2021inventory.invoicing.pojo
 */
public class Repertory {
    private int id;//主键id
    private String depotId;//仓库编码
    private String articleId;//商品编码
    private int amount;//数量
    private String day;//日期

    public Repertory(int id, String depotId, String articleId, int amount, String day) {
        this.id = id;
        this.depotId = depotId;
        this.articleId = articleId;
        this.amount = amount;
        this.day = day;
    }

    public Repertory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepotId() {
        return depotId;
    }

    public void setDepotId(String depotId) {
        this.depotId = depotId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "repertory{" +
                "id=" + id +
                ", depotId='" + depotId + '\'' +
                ", articleId='" + articleId + '\'' +
                ", amount=" + amount +
                ", day='" + day + '\'' +
                '}';
    }
}
