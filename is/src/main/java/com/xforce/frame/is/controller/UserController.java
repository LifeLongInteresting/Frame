package com.xforce.frame.is.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xforce.frame.is.entity.User;
import com.xforce.frame.is.handler.QueryPageParam;
import com.xforce.frame.is.handler.Result;
import com.xforce.frame.is.mapper.UserMapper;
import com.xforce.frame.is.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        List list = userService.lambdaQuery()
                .eq(User::getUsername,user.getUsername())
                .eq(User::getPassword,user.getPassword()).list();


        if(list.size()>0){
            /*
            User user1 = (User)list.get(0);
            List menuList = menuService.lambdaQuery().like(Menu::getMenuright,user1.getRoleId()).list();
            HashMap res = new HashMap();
            res.put("user",user1);
            res.put("menu",menuList);
             */
            User user1 = (User)list.get(0);
            HashMap res = new HashMap();
            res.put("user",user1);
            return Result.suc(res);
        }
        return Result.fail();
    }
    @GetMapping("/query")
    public List<User> queryAllUsers(){
        List<User> list = userMapper.getAllUser();
        System.out.println(list);
        return list;
    }
    @GetMapping("/user")
    public List<User> getUser(){
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
        return list;
    }
    @PostMapping("/listP")
    public Result listP(@RequestBody User user){
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(user.getName())){
            lambdaQueryWrapper.like(User::getName,user.getName());
        }
        return Result.suc(userService.list(lambdaQueryWrapper));
    }

    @PostMapping("/listPageC1")
    public Result listPageC1(@RequestBody QueryPageParam query){
        HashMap param = query.getParam();
        String name = (String)param.get("name");
        String gender = (String)param.get("gender");
        String age = (String)param.get("age");

        Page<User> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper();
        if(StringUtils.isNotBlank(name) && !"null".equals(name)){
            lambdaQueryWrapper.like(User::getName,name);
        }
        if(StringUtils.isNotBlank(gender)){
            lambdaQueryWrapper.eq(User::getGender,gender);
        }
        if(StringUtils.isNotBlank(age)){
            lambdaQueryWrapper.eq(User::getAge,age);
        }

        //IPage result = userService.pageC(page);
        IPage result = userService.pageCC(page,lambdaQueryWrapper);

        System.out.println("total=="+result.getTotal());

        return Result.suc(result.getRecords(),result.getTotal());
    }
}
