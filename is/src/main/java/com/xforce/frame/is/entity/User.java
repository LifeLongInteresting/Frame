package com.xforce.frame.is.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表信息
 * @TableName user
 */
@TableName(value ="user")
public class User{
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 地址
     */
    private String address;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 角色
     */
    private String role;

    /**
     * 年龄
     */
    private String age;

    /**
     * 状态
     */
    private String status;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    private Byte isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 角色
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 年龄
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 是否删除(0-未删, 1-已删)
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除(0-未删, 1-已删)
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

}