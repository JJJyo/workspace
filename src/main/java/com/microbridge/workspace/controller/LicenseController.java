package com.microbridge.workspace.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.microbridge.workspace.bean.Msg;
import com.microbridge.workspace.bean.license;
import com.microbridge.workspace.bean.record;
import com.microbridge.workspace.service.LicenseService;
import com.microbridge.workspace.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: workspace
 * @description:
 *  处理license CRUD请求
 *  使用ResponseBody返回json，需要jackson包支持
 * @author: Jyo
 * @create: 2019-06-11 13:44
 **/
@Controller
public class LicenseController {

    @Autowired
    private LicenseService licenseService;
    @Autowired
    private RecordService recordService;

    /*
    查询license数据，分页查询
     */


    public String getLicenses(
            @RequestParam(value = "pagenumber",defaultValue = "1")Integer pagenumber,
            Model model){

        //这不是一个分页查询,引入pageHelper分页插件
        //页码，和每页的数据量。这样下一条查询就是一个分页查询。
        PageHelper.startPage(pagenumber, 5);
        List<license> licenses = licenseService.getAll();
        //使用pageinfo来包装查询结果，只需要将pageinfo交给页面就有详细的分页信息
        //第二个参数是连续显示的页数
        PageInfo page = new PageInfo(licenses,10);
        model.addAttribute("pageInfo", page);


        return "list";
    }
    @RequestMapping("/licenses")
    @ResponseBody
    public Msg getLicensesWithJson(
            @RequestParam(value = "pagenumber",defaultValue = "1")Integer pagenumber,
                                        Model model){

        //这不是一个分页查询,引入pageHelper分页插件
        //页码，和每页的数据量。这样下一条查询就是一个分页查询。
        PageHelper.startPage(pagenumber, 10);
//        List<license> licenses_all = licenseService.getAll();
//        for (license l : licenses_all){
//            System.out.println(l.getLicenseid());
//        }
        List<license> licenses = licenseService.getAll();
        for(license l : licenses){
            if (l.getProjectid().equals("0000")){

            }
        }

        //使用pageinfo来包装查询结果，只需要将pageinfo交给页面就有详细的分页信息
        //第二个参数是连续显示的页数
        PageInfo page = new PageInfo(licenses,5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * license保存
     * @return
     */

    @RequestMapping(value = "/license" ,method = RequestMethod.POST)
    @ResponseBody
    public Msg saveLicense(license license){
        licenseService.saveLicense(license);
        return Msg.success();
    }

    @RequestMapping(value = "/license/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getLicenses(@PathVariable("id")String id){

        license license = licenseService.getLicenses(id);
        return Msg.success().add("license", license);
    }

    @RequestMapping(value = "/updatelicense/{licenseid}",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveLicenses(license license){

        System.out.println(license);
        licenseService.updateLicenses(license);
        return Msg.success();
    }

    @RequestMapping(value = "/license/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteLicenseById(@PathVariable("id")String id){
        licenseService.deleteLicense(id);
        return Msg.success();
    }

}
