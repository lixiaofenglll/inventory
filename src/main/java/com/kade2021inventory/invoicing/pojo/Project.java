package com.kade2021inventory.invoicing.pojo;

public class Project {
    //项目id
    private int projectId;
   //项目名称
    private String projectName;
    //项目类型
    private String projectType;
    //项目状态 0表示成功 1表示失败
    private  int status;

    public Project() {
    }

    public Project(int projectId, String projectName, String projectType, int status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectType = projectType;
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectType='" + projectType + '\'' +
                ", status=" + status +
                '}';
    }
}
