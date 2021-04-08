package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.mapper.BtypeMapper;
import com.kade2021inventory.invoicing.pojo.InvoicingBtype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wangzongxuan
 * @Date:2021/4/6 11:18
 * @Description:
 **/
@Service
public class BtypeServiceImpl implements BtypeServcie {

    @Autowired
    private BtypeMapper btypeMapper;


    @Override
    public int count() {
        return btypeMapper.count();
    }

    @Override
    public List<InvoicingBtype> queryList(Map<String,Object> m) {
        return btypeMapper.queryList(m);
    }

    @Override
    public int updateBtypeId(InvoicingBtype invoicingBtype) {
        return btypeMapper.updateBtypeId(invoicingBtype);
    }

    @Override
    public int deleteBtypeId(String id) {
        return btypeMapper.deleteBtypeId(id);
    }

    @Override
    public int addBtype(InvoicingBtype invoicingBtype) {
        return btypeMapper.addBtype(invoicingBtype);
    }


}
