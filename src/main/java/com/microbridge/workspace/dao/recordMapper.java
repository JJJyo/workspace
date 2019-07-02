package com.microbridge.workspace.dao;

import com.microbridge.workspace.bean.record;
import com.microbridge.workspace.bean.recordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface recordMapper {
    long countByExample(recordExample example);

    int deleteByExample(recordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(record record);

    int insertSelective(record record);

    List<record> selectByExample(recordExample example);

    record selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") record record, @Param("example") recordExample example);

    int updateByExample(@Param("record") record record, @Param("example") recordExample example);

    int updateByPrimaryKeySelective(record record);

    int updateByPrimaryKey(record record);
}