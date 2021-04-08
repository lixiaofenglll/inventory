package com.kade2021inventory.invoicing.controller;

import com.kade2021inventory.invoicing.dto.ResultDto;
import com.kade2021inventory.invoicing.pojo.Project;
import com.kade2021inventory.invoicing.service.ProjectService;
import com.kade2021inventory.utils.RedisUtils;
import com.kade2021inventory.utils.ResultUtil;
import com.kade2021inventory.utils.SysCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectController {
@Autowired
    private ProjectService projectService;
@Autowired
    private RedisUtils redisUtils;
    @RequestMapping("/toIndex")
    public String toIndex() {

        return "project_list";
    }
    @RequestMapping("/toAdd")
    public String toAdd() {

        return "project_add";
    }
    @RequestMapping("/getProjectList")
    @ResponseBody
    public ResultDto getProjectList(@RequestParam Map<String, Object> map){
        List<Project> projectList=projectService.queryListProject(map);
        return ResultUtil.returnSuccess(projectList,projectList.size());
    }
@RequestMapping("/toupdate/{id}")
    public String getProjectById(@PathVariable Integer projectId, Model model){
Project project=projectService.getProjectId(projectId);
model.addAttribute("project",project);
return "product_edit";
}
    @PostMapping("/deleteById/{id}")
    @ResponseBody
    public ResultDto deleteById(@PathVariable Integer id) {
        if (projectService.delete(id) <= 0) {
            return ResultUtil.returnFail(11100,"213123");
        }
        return ResultUtil.returnSuccess();
    }
@RequestMapping("/addProject")
    public ResultDto addProject(Project project){
        projectService.addProject(project);
return ResultUtil.returnSuccess(null,0);
}
@RequestMapping("/updateProject")
    public ResultDto updateProject(Project project){
   projectService.updateProject(project);
return ResultUtil.returnSuccess(null,0);
}

}
