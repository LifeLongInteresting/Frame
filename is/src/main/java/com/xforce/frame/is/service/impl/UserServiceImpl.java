package com.xforce.frame.is.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xforce.frame.is.entity.User;
import com.xforce.frame.is.service.UserService;
import com.xforce.frame.is.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public IPage pageC(IPage<User> page) {
        return userMapper.pageC(page);
    }

    @Override
    public IPage pageCC(IPage<User> page, Wrapper wrapper) {
        return userMapper.pageCC(page,wrapper);
    }

}




