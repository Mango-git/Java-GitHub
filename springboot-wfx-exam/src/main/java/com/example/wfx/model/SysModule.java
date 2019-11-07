package com.example.wfx.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class SysModule {

    @Id
    private String moduleId;
    private String moduleCode;
    private String moduleName;
    private String linkUrl;
    private Long moduleOrder;
    private String parentModule;
    private String moduleDesc;
    private String expanded;
    private String leaf;


    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }


    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }


    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }


    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }


    public Long getModuleOrder() {
        return moduleOrder;
    }

    public void setModuleOrder(Long moduleOrder) {
        this.moduleOrder = moduleOrder;
    }


    public String getParentModule() {
        return parentModule;
    }

    public void setParentModule(String parentModule) {
        this.parentModule = parentModule;
    }


    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }


    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }


    public String getLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    @Override
    public String toString() {
        return "SysModule{" +
                "moduleId='" + moduleId + '\'' +
                ", moduleCode='" + moduleCode + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", moduleOrder=" + moduleOrder +
                ", parentModule='" + parentModule + '\'' +
                ", moduleDesc='" + moduleDesc + '\'' +
                ", expanded='" + expanded + '\'' +
                ", leaf='" + leaf + '\'' +
                '}';
    }
}