package com.microbridge.workspace.dao;

import com.microbridge.workspace.bean.project;
import com.microbridge.workspace.bean.projectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface projectMapper {
    long countByExample(projectExample example);

    int deleteByExample(projectExample example);

    int deleteByPrimaryKey(String projectid);

    int insert(project record);

    int insertSelective(project record);

    List<project> selectByExample(projectExample example);

    project selectByPrimaryKey(String projectid);

    int updateByExampleSelective(@Param("record") project record, @Param("example") projectExample example);

    int updateByExample(@Param("record") project record, @Param("example") projectExample example);

    int updateByPrimaryKeySelective(project record);

    int updateByPrimaryKey(project record);
}