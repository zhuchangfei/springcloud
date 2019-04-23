package com.example.mybaitsplus.dao.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_status_trace_log")
public class JobStatusTraceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String id;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "original_task_id")
    private String originalTaskId;

    @Column(name = "task_id")
    private String taskId;

    @Column(name = "slave_id")
    private String slaveId;

    private String source;

    @Column(name = "execution_type")
    private String executionType;

    @Column(name = "sharding_item")
    private String shardingItem;

    private String state;

    private String message;

    @Column(name = "creation_time")
    private Date creationTime;

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
     * @return original_task_id
     */
    public String getOriginalTaskId() {
        return originalTaskId;
    }

    /**
     * @param originalTaskId
     */
    public void setOriginalTaskId(String originalTaskId) {
        this.originalTaskId = originalTaskId;
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
     * @return slave_id
     */
    public String getSlaveId() {
        return slaveId;
    }

    /**
     * @param slaveId
     */
    public void setSlaveId(String slaveId) {
        this.slaveId = slaveId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return execution_type
     */
    public String getExecutionType() {
        return executionType;
    }

    /**
     * @param executionType
     */
    public void setExecutionType(String executionType) {
        this.executionType = executionType;
    }

    /**
     * @return sharding_item
     */
    public String getShardingItem() {
        return shardingItem;
    }

    /**
     * @param shardingItem
     */
    public void setShardingItem(String shardingItem) {
        this.shardingItem = shardingItem;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return creation_time
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
}