package com.example.mybaitsplus.dao.domain;

import javax.persistence.*;

@Table(name = "sys_dept_relation")
public class SysDeptRelation {
    /**
     * 祖先节点
     */
    @Id
    private Integer ancestor;

    /**
     * 后代节点
     */
    @Id
    private Integer descendant;

    /**
     * 获取祖先节点
     *
     * @return ancestor - 祖先节点
     */
    public Integer getAncestor() {
        return ancestor;
    }

    /**
     * 设置祖先节点
     *
     * @param ancestor 祖先节点
     */
    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    /**
     * 获取后代节点
     *
     * @return descendant - 后代节点
     */
    public Integer getDescendant() {
        return descendant;
    }

    /**
     * 设置后代节点
     *
     * @param descendant 后代节点
     */
    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }
}