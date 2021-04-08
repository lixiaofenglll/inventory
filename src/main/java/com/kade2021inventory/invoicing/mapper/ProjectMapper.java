package com.kade2021inventory.invoicing.mapper;

import com.kade2021inventory.invoicing.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ProjectMapper{
List<Project> queryListProject(Map<String,Object>map);
Project getProjectId(@Param("ProjectId") Integer ProjectId);
int addProject(Project project);
int delete(@Param("ProjectId") Integer ProjectId);
int updateProject(Project project);

}
