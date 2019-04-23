package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_route_conf")
public class SysRouteConf {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 路由名称
     */
    @Column(name = "route_name")
    private String routeName;

    /**
     * 路由ID
     */
    @Column(name = "route_id")
    private String routeId;

    private String uri;

    /**
     * 排序
     */
    private Integer order;

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
     * 删除标记
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 断言
     */
    private String predicates;

    /**
     * 过滤器
     */
    private String filters;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取路由名称
     *
     * @return route_name - 路由名称
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * 设置路由名称
     *
     * @param routeName 路由名称
     */
    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * 获取路由ID
     *
     * @return route_id - 路由ID
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * 设置路由ID
     *
     * @param routeId 路由ID
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取排序
     *
     * @return order - 排序
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置排序
     *
     * @param order 排序
     */
    public void setOrder(Integer order) {
        this.order = order;
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

    /**
     * 获取断言
     *
     * @return predicates - 断言
     */
    public String getPredicates() {
        return predicates;
    }

    /**
     * 设置断言
     *
     * @param predicates 断言
     */
    public void setPredicates(String predicates) {
        this.predicates = predicates;
    }

    /**
     * 获取过滤器
     *
     * @return filters - 过滤器
     */
    public String getFilters() {
        return filters;
    }

    /**
     * 设置过滤器
     *
     * @param filters 过滤器
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }
}