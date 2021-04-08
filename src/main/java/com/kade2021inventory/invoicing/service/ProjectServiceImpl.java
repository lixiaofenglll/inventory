package com.kade2021inventory.invoicing.service;

import com.kade2021inventory.invoicing.mapper.ProjectMapper;
import com.kade2021inventory.invoicing.pojo.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public List<Project> queryListProject(Map<String, Object> map) {
        return projectMapper.queryListProject(map);
    }

    @Override
    public Project getProjectId(Integer ProjectId) {
        return projectMapper.getProjectId(ProjectId);
    }

    @Override
    public int addProject(Project project) {
        return projectMapper.addProject(project);
    }

    @Override
    public int delete(Integer ProjectId) {
        return projectMapper.delete(ProjectId);
    }

    @Override
    public int updateProject(Project project) {
        return projectMapper.updateProject(project);
    }
}
