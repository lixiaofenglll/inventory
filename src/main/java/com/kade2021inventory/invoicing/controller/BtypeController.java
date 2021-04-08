package com.kade2021inventory.invoicing.controller;
import com.kade2021inventory.invoicing.dto.ResultDto;
import com.kade2021inventory.utils.PageCheck;

import com.kade2021inventory.invoicing.pojo.InvoicingBtype;
import com.kade2021inventory.invoicing.service.BtypeServcie;
import com.kade2021inventory.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wangzongxuan
 * @Date:2021/4/6 11:21
 * @Description: 往来公司接口
 **/
@RestController
public class BtypeController {

    @Autowired
    private BtypeServcie btypeServcie;

    /**
     * 查询所有数据分页
     *
     * @param m
     * @return
     */
    @RequestMapping("/index")
    public ResultDto btypeQuery(@RequestParam Map<String, Object> m) {
        PageCheck.checkPage(m);
        int count = btypeServcie.count();
        List<InvoicingBtype> list = btypeServcie.queryList(m);
        for (InvoicingBtype invoicingBtype : list) {
            System.out.println(invoicingBtype.toString());

        }
        ResultDto resultDto = ResultUtil.returnSuccess(list, count);

        return resultDto;
    }

    /**
     * 根据id删除数据
     * @param id
     * @return
     */
    @PostMapping("/deleteBtype")
    public ResultDto deleteBtype(String id) {
        int delete = btypeServcie.deleteBtypeId(id);
        if (delete > 0) {
            return ResultUtil.returnSuccess();
        } else {
            return ResultUtil.returnFail(10003, "删除失败");
        }

    }

    /**
     * 根据id或公司名字来修改数据
     * @param invoicingBtype
     * @return
     */
    @PostMapping("/updateBtype")
    public ResultDto updateBtype(InvoicingBtype invoicingBtype){
        int update = btypeServcie.updateBtypeId(invoicingBtype);
        if (update>0){
            return  ResultUtil.returnSuccess();
        }
        else {
            return  ResultUtil.returnFail(10002,"修改失败");
        }

    }

    /**
     * 添加数据  id不可为空
     * @param invoicingBtype
     * @return
     */
    @PostMapping("/addBtype")
    public  ResultDto addBtype(InvoicingBtype invoicingBtype){
        int add = btypeServcie.addBtype(invoicingBtype);
        if (add>0){
            return  ResultUtil.returnSuccess();
        }
        else {
            return  ResultUtil.returnFail(10001,"增加失败");
        }

    }



}








