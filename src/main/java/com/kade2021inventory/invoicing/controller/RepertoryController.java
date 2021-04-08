package com.kade2021inventory.invoicing.controller;

import com.kade2021inventory.invoicing.dto.ResultDto;
import com.kade2021inventory.invoicing.pojo.Repertory;
import com.kade2021inventory.invoicing.service.RepertoryService;
import com.kade2021inventory.utils.PageCheck;
import com.kade2021inventory.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author: Mr Li
 * @Date:2021/4/8
 * @packer:com.kade2021inventory.invoicing.controller
 */
@RestController
@RequestMapping("/repertory")
public class RepertoryController {
    @Autowired
    RepertoryService repertoryService;

    @PostMapping("/selectAll")
    public ResultDto selectAll(@RequestParam Map<String,Object> m){
        PageCheck.checkPage(m);
        List<Repertory> list = repertoryService.selectAll(m);
        for (Repertory repertory : list) {
            System.out.println(list.toString());
        }
        int pageCount  = repertoryService.pageCount();
        ResultDto resultDto = ResultUtil.returnSuccess(list,pageCount);
        return resultDto;
    }

    @PostMapping("/selectBy")
    public ResultDto selectBy(@RequestParam Map<String,Object> m){
        PageCheck.checkPage(m);
        List<Repertory> list = repertoryService.selectById(m);
        int pageCount = repertoryService.pageCountBy(m);
        return ResultUtil.returnSuccess(list,pageCount);
    }

    @PostMapping("/addRepertory")
    public ResultDto addRepertory(Repertory repertory){
        int i = repertoryService.addrepertory(repertory);
        if (i>0){
            return ResultUtil.returnSuccess();
        }else {
            return ResultUtil.returnFail(10001,"添加失败");
        }
    }

    @PostMapping("/updateRepertory")
    public ResultDto updateRepertory(Repertory repertory){
        int update = repertoryService.updaterepertory(repertory);
        if (update>0){
            return ResultUtil.returnSuccess();
        }else {
            return ResultUtil.returnFail(10002,"修改失败");
        }
    }

    @PostMapping("/delRepertory")
    public ResultDto delRepertory(int id){
        int delete = repertoryService.delrepertory(id);
        if (delete==0){
            return ResultUtil.returnSuccess();
        }else {
            return ResultUtil.returnFail(10003,"删除失败");
        }
    }
}
