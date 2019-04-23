package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_execution_log")
public class JobExecutionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "task_id")
    private String taskId;

    private String hostname;

    private String ip;

    @Column(name = "sharding_item")
    private Integer shardingItem;

    @Column(name = "execution_source")
    private String executionSource;

    @Column(name = "failure_cause")
    private String failureCause;

    @Column(name = "is_success")
    private Integer isSuccess;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "complete_time")
    private Date completeTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return job_name
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return task_id
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * @param hostname
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return sharding_item
     */
    public Integer getShardingItem() {
        return shardingItem;
    }

    /**
     * @param shardingItem
     */
    public void setShardingItem(Integer shardingItem) {
        this.shardingItem = shardingItem;
    }

    /**
     * @return execution_source
     */
    public String getExecutionSource() {
        return executionSource;
    }

    /**
     * @param executionSource
     */
    public void setExecutionSource(String executionSource) {
        this.executionSource = executionSource;
    }

    /**
     * @return failure_cause
     */
    public String getFailureCause() {
        return failureCause;
    }

    /**
     * @param failureCause
     */
    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * @return is_success
     */
    public Integer getIsSuccess() {
        return isSuccess;
    }

    /**
     * @param isSuccess
     */
    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
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
     * @return complete_time
     */
    public Date getCompleteTime() {
        return completeTime;
    }

    /**
     * @param completeTime
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }
}