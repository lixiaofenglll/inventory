package com.kade2021inventory.invoicing.service.impl;

import com.kade2021inventory.invoicing.mapper.RepertoryMapper;
import com.kade2021inventory.invoicing.pojo.Repertory;
import com.kade2021inventory.invoicing.service.RepertoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: Mr Li
 * @Date:2021/4/8
 * @packer:com.kade2021inventory.invoicing.service.impl
 */
@Service
public class RepertoryServiceImpl implements RepertoryService {
    @Autowired
    RepertoryMapper repertoryMapper;
    @Override
    public List<Repertory> selectAll(Map<String, Object> m) {
        return repertoryMapper.selectAll(m);
    }

    @Override
    public int pageCount() {
        return repertoryMapper.pageCount();
    }

    @Override
    public int pageCountBy(Map<String, Object> m) {
        return repertoryMapper.pageCountBy(m);
    }

    @Override
    public List<Repertory> selectById(Map<String, Object> m) {
        return repertoryMapper.selectById(m);
    }

    @Override
    public int addrepertory(Repertory repertory) {
        return repertoryMapper.addrepertory(repertory);
    }

    @Override
    public int delrepertory(int id) {
        return repertoryMapper.delrepertory(id);
    }

    @Override
    public int updaterepertory(Repertory repertory) {
        return repertoryMapper.updaterepertory(repertory);
    }
}
