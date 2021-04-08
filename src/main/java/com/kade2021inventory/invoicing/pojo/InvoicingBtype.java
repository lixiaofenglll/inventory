package com.kade2021inventory.invoicing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: wangzongxuan
 * @Date:2021/4/6 10:36
 * @Description: 往来公司表
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class InvoicingBtype {
    private String id;
    private String btypeName ;
    private String btypeEmail ;
    private String btypeAddress ;
    private String btypeLinkman ;
    private Long btypeCell ;
    private String btypePhone ;
    private String btypeClassification ;
    private String  btypeClerk;




}
