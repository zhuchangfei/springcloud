package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "download_record")
public class DownloadRecord {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 文件名
     */
    @Column(name = "file_name")
    private String fileName;

    /**
     * 数据生成人
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 文件存放地址
     */
    @Column(name = "data_url")
    private String dataUrl;

    /**
     * 文件过期天数（默认7天）
     */
    @Column(name = "file_timeout")
    private Integer fileTimeout;

    /**
     * 下载次数
     */
    @Column(name = "download_num")
    private Integer downloadNum;

    /**
     * 获取自增id
     *
     * @return id - 自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取文件名
     *
     * @return file_name - 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置文件名
     *
     * @param fileName 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取数据生成人
     *
     * @return user_name - 数据生成人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置数据生成人
     *
     * @param userName 数据生成人
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取文件存放地址
     *
     * @return data_url - 文件存放地址
     */
    public String getDataUrl() {
        return dataUrl;
    }

    /**
     * 设置文件存放地址
     *
     * @param dataUrl 文件存放地址
     */
    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    /**
     * 获取文件过期天数（默认7天）
     *
     * @return file_timeout - 文件过期天数（默认7天）
     */
    public Integer getFileTimeout() {
        return fileTimeout;
    }

    /**
     * 设置文件过期天数（默认7天）
     *
     * @param fileTimeout 文件过期天数（默认7天）
     */
    public void setFileTimeout(Integer fileTimeout) {
        this.fileTimeout = fileTimeout;
    }

    /**
     * 获取下载次数
     *
     * @return download_num - 下载次数
     */
    public Integer getDownloadNum() {
        return downloadNum;
    }

    /**
     * 设置下载次数
     *
     * @param downloadNum 下载次数
     */
    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }
}