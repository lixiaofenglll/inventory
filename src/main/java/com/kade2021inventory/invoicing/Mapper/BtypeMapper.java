package com.kade2021inventory.invoicing.Mapper;

import com.kade2021inventory.invoicing.pojo.InvoicingBtype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wangzongxuan
 * @Date:2021/4/6 10:44
 * @Description:
 **/
@Mapper
@Repository
public interface BtypeMapper {
    /**
     * 显示共有多少数据
     * @return
     */
    int count();

    /**
     * 查询所有数据 根据id或公司名字 模糊查询
     * @param m
     * @return
     */
    List<InvoicingBtype> queryList(Map<String,Object> m);


    /**
     * 根据id修改数据
     * @param invoicingBtype
     * @return
     */
     int updateBtypeId(InvoicingBtype invoicingBtype);

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    int deleteBtypeId(String id);

    /**
     * 新增数据
     * @param invoicingBtype
     * @return
     */
     int addBtype(InvoicingBtype invoicingBtype);


}
