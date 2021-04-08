package com.kade2021inventory.invoicing.mapper;

import com.kade2021inventory.invoicing.pojo.Repertory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author: Mr Li
 * @Date:2021/4/8
 * @packer:com.kade2021inventory.invoicing.mapper
 */
@Mapper
@Repository
public interface RepertoryMapper {
    //查询全部
    List<Repertory> selectAll(Map<String,Object> m);
    //分页查询
    int pageCount();
    int pageCountBy(Map<String,Object> m);
    //根据ID查询
    List<Repertory> selectById(Map<String,Object> m);
    //增加
    int addrepertory(Repertory repertory);
    //删除
    int delrepertory(int id);
    //修改
    int updaterepertory(Repertory repertory);
}
