package com.kade2021inventory.system.controller;

import com.kade2021inventory.system.mapper.OmniMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OmniController {
    @Autowired
    OmniMapper omniMapper;
    @PostMapping("/selectAll")
    public List<Map<String ,Object>> seleclAll(@RequestParam Map<String ,Object>map){
        if(map.get("page")!=null) {
            Integer page = Integer.valueOf((String) map.get("page"));
            page = (page - 1) * Integer.valueOf((String) map.get("limit"));
            map.put("page", page);
        }
        return omniMapper.selectAll(map);
    }
}
