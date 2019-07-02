package com.microbridge.workspace.service;

import com.microbridge.workspace.bean.license;
import com.microbridge.workspace.dao.licenseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: workspace
 * @description:
 * @author: Jyo
 * @create: 2019-06-11 13:51
 **/

@Service
public class LicenseService {

    @Autowired
    licenseMapper licenseMapper;

    /*
    查询所有license
     */
     public List<license> getAll() {

        return licenseMapper.selectByExample(null);
    }

    /*
    员工保存
     */
    public void saveLicense(license license) {

         licenseMapper.insertSelective(license);
    }

    /*
    根据id查询
     */
    public license getLicenses(String id) {

        license license = licenseMapper.selectByPrimaryKey(id);
        return license;
    }


    public void updateLicenses(license license) {

        licenseMapper.updateByPrimaryKeySelective(license);

    }

    public void deleteLicense(String id) {

        licenseMapper.deleteByPrimaryKey(id);
    }
}
