package com.xforce.frame.is.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.xforce.frame.is.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user")
    public List<User> getAllUser();

    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}




