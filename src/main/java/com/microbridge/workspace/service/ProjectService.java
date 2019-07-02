package com.microbridge.workspace.service;

import com.microbridge.workspace.bean.project;
import com.microbridge.workspace.dao.projectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: workspace
 * @description:
 * @author: Jyo
 * @create: 2019-06-14 16:56
 **/
@Service
public class ProjectService {

    @Autowired
    private projectMapper projectMapper;

    public List<project> getProjects() {
        List<project> list = projectMapper.selectByExample(null);
        return list;
    }
}
