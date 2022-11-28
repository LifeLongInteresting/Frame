package com.xforce.frame.is.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xforce.frame.is.entity.User;

import com.baomidou.mybatisplus.core.conditions.Wrapper;

/**
 *
 */
public interface UserService extends IService<User> {
    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);

}
