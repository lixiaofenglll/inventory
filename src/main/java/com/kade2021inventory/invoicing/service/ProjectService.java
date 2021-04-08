package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.pojo.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProjectService {
    List<Project> queryListProject(Map<String,Object> map);
    Project getProjectId(@Param("ProjectId") Integer ProjectId);
    int addProject(Project project);
    int delete(@Param("ProjectId") Integer ProjectId);
    int updateProject(Project project);
}
