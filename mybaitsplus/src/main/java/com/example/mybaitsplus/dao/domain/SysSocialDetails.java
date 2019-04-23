package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_social_details")
public class SysSocialDetails {
    /**
     * 主鍵
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 类型
     */
    private String type;

    /**
     * 描述
     */
    private String remark;

    /**
     * appid
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * app_secret
     */
    @Column(name = "app_secret")
    private String appSecret;

    /**
     * 回调地址
     */
    @Column(name = "redirect_url")
    private String redirectUrl;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 删除标记
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 获取主鍵
     *
     * @return id - 主鍵
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主鍵
     *
     * @param id 主鍵
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取描述
     *
     * @return remark - 描述
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置描述
     *
     * @param remark 描述
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取appid
     *
     * @return app_id - appid
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置appid
     *
     * @param appId appid
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 获取app_secret
     *
     * @return app_secret - app_secret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * 设置app_secret
     *
     * @param appSecret app_secret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    /**
     * 获取回调地址
     *
     * @return redirect_url - 回调地址
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 设置回调地址
     *
     * @param redirectUrl 回调地址
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取删除标记
     *
     * @return del_flag - 删除标记
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记
     *
     * @param delFlag 删除标记
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}