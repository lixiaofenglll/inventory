package com.kade2021inventory.system.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface OmniMapper {

    List<Map<String ,Object>> selectAll(Map<String ,Object> map);

    int modifyByPrimaryKey(Map<String ,Object> map);

    int deleteByPrimaryKey(Map<String ,Object> map);

    int insert(Map<String ,Object> map);

    int countAll(Map<String ,Object> map);
}
