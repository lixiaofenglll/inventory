package com.kade2021inventory.invoicing.controller;

import com.kade2021inventory.invoicing.dto.ResultDto;
import com.kade2021inventory.invoicing.pojo.ItemList;
import com.kade2021inventory.invoicing.service.ItemListService;
import com.kade2021inventory.utils.PageCheck;
import com.kade2021inventory.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @Auther: lixiaofeng
 * @Date:2021/4/6 11:56
 * @Description:
 * @version：1.0
 **/
@RestController
@RequestMapping("/ItemList")
public class ItemListController {
    @Autowired
    ItemListService itemListService;
    @PostMapping("/selectAll")
    public ResultDto selectAll(@RequestParam Map<String,Object> m){
        PageCheck.checkPage(m);
        List<ItemList> itemLists = itemListService.selectAll(m);
        for (ItemList itemList : itemLists) {
            System.out.println(itemList.toString());
        }
        int pageCount = itemListService.pageCount();
        ResultDto resultDto = ResultUtil.returnSuccess(itemLists, pageCount);
        return resultDto;
    }
    @PostMapping("/selectBy")
    public ResultDto selectBy(@RequestParam  Map<String,Object> m){
        PageCheck.checkPage(m);
        List<ItemList> itemLists = itemListService.selectBy(m);
        int pageCount = itemListService.pageCountBy(m);
        return ResultUtil.returnSuccess(itemLists,pageCount);
    }
    @PostMapping("/addItem")
    public ResultDto addItem(ItemList itemList){
        int i = itemListService.addItem(itemList);
        if(i>0){
            return  ResultUtil.returnSuccess();
        }else {
            return ResultUtil.returnFail(10001, "添加失败");
        }
    }
    @PostMapping("/update")
    public ResultDto update(ItemList itemList){
        int update = itemListService.update(itemList);
        if(update>0){
            return  ResultUtil.returnSuccess();
        }else{
            return ResultUtil.returnFail(10002,"修改失败");
        }
    }
    @PostMapping("/delete")
    public ResultDto delete(int id){
        int delete = itemListService.delete(id);
        if(delete==0){
            return ResultUtil.returnSuccess();
        }else{
            return ResultUtil.returnFail(10003,"删除失败");
        }
    }
}