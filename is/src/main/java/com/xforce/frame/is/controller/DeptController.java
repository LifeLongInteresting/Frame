package com.xforce.frame.is.controller;


import com.xforce.frame.is.entity.Dept;
import com.xforce.frame.is.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 科室 前端控制器
 * </p>
 *
 * @author Alex
 * @since 2022-11-25
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

}
