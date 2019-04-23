package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    private String password;

    /**
     * 随机盐
     */
    private String salt;

    /**
     * 简介
     */
    private String phone;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 部门ID
     */
    @Column(name = "dept_id")
    private Integer deptId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 0-正常，9-锁定
     */
    @Column(name = "lock_flag")
    private String lockFlag;

    /**
     * 0-正常，1-删除
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 微信openid
     */
    @Column(name = "wx_openid")
    private String wxOpenid;

    /**
     * QQ openid
     */
    @Column(name = "qq_openid")
    private String qqOpenid;

    /**
     * 所属租户
     */
    @Column(name = "tenant_id")
    private Integer tenantId;

    /**
     * 获取主键ID
     *
     * @return user_id - 主键ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置主键ID
     *
     * @param userId 主键ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取随机盐
     *
     * @return salt - 随机盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置随机盐
     *
     * @param salt 随机盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取简介
     *
     * @return phone - 简介
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置简介
     *
     * @param phone 简介
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取部门ID
     *
     * @return dept_id - 部门ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门ID
     *
     * @param deptId 部门ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取0-正常，9-锁定
     *
     * @return lock_flag - 0-正常，9-锁定
     */
    public String getLockFlag() {
        return lockFlag;
    }

    /**
     * 设置0-正常，9-锁定
     *
     * @param lockFlag 0-正常，9-锁定
     */
    public void setLockFlag(String lockFlag) {
        this.lockFlag = lockFlag;
    }

    /**
     * 获取0-正常，1-删除
     *
     * @return del_flag - 0-正常，1-删除
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置0-正常，1-删除
     *
     * @param delFlag 0-正常，1-删除
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取微信openid
     *
     * @return wx_openid - 微信openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信openid
     *
     * @param wxOpenid 微信openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    /**
     * 获取QQ openid
     *
     * @return qq_openid - QQ openid
     */
    public String getQqOpenid() {
        return qqOpenid;
    }

    /**
     * 设置QQ openid
     *
     * @param qqOpenid QQ openid
     */
    public void setQqOpenid(String qqOpenid) {
        this.qqOpenid = qqOpenid;
    }

    /**
     * 获取所属租户
     *
     * @return tenant_id - 所属租户
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * 设置所属租户
     *
     * @param tenantId 所属租户
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }
}