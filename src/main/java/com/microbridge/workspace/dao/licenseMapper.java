package com.microbridge.workspace.dao;

import com.microbridge.workspace.bean.license;
import com.microbridge.workspace.bean.licenseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface licenseMapper {
    long countByExample(licenseExample example);

    int deleteByExample(licenseExample example);

    int deleteByPrimaryKey(String licenseid);

    int insert(license record);

    int insertSelective(license record);

    List<license> selectByExample(licenseExample example);

    license selectByPrimaryKey(String licenseid);

    int updateByExampleSelective(@Param("record") license record, @Param("example") licenseExample example);

    int updateByExample(@Param("record") license record, @Param("example") licenseExample example);

    int updateByPrimaryKeySelective(license record);

    int updateByPrimaryKey(license record);
}