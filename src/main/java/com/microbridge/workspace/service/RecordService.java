package com.microbridge.workspace.service;

import com.microbridge.workspace.bean.record;
import com.microbridge.workspace.dao.recordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: workspace
 * @description:
 * @author: Jyo
 * @create: 2019-07-02 11:33
 **/
@Service
public class RecordService {

    @Autowired
    recordMapper recordMapper;

    public List<record> getAll() {

        return recordMapper.selectByExample(null);
    }
}
