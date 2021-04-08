package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.pojo.InvoicingBtype;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wangzongxuan
 * @Date:2021/4/6 11:18
 * @Description:
 **/
public interface BtypeServcie {
    int count();
    List<InvoicingBtype> queryList(Map<String,Object> m
    );

    int updateBtypeId(InvoicingBtype invoicingBtype);

    int deleteBtypeId(String id);

    int addBtype(InvoicingBtype invoicingBtype);

}
