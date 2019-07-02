package com.microbridge.workspace.controller;

import com.microbridge.workspace.bean.Msg;
import com.microbridge.workspace.bean.project;
import com.microbridge.workspace.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: workspace
 * @description:
 * @author: Jyo
 * @create: 2019-06-14 16:08
 **/
@Controller
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /*
    返回project信息
     */
    @RequestMapping("/projects")
    @ResponseBody
    public Msg getProject(){
        List<project> list = projectService.getProjects();
        return Msg.success().add("projects", list);
    }
}
