/**
 * 
 * 项目名称：tikie-eureka-ribbon
 * 创建日期：2018年6月27日
 * 修改历史：
 * 		1、[2018年6月27日]创建文件 by zhaocs
 */
package com.tikie.eureka.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tikie.eureka.ribbon.service.RibbonService;

/**
 * @author zhaocs
 *
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false,defaultValue = "cralor") String name){
        return ribbonService.hi(name);
    }   
}
