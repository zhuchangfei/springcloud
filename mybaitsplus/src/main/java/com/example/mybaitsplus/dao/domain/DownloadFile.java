package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "download_file")
public class DownloadFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "download_num")
    private Integer downloadNum;

    @Column(name = "file_download_path")
    private String fileDownloadPath;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return download_num
     */
    public Integer getDownloadNum() {
        return downloadNum;
    }

    /**
     * @param downloadNum
     */
    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
    }

    /**
     * @return file_download_path
     */
    public String getFileDownloadPath() {
        return fileDownloadPath;
    }

    /**
     * @param fileDownloadPath
     */
    public void setFileDownloadPath(String fileDownloadPath) {
        this.fileDownloadPath = fileDownloadPath;
    }
}