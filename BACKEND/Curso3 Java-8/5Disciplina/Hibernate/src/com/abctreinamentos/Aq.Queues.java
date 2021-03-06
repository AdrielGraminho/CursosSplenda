package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Aq.Queues generated by hbm2java
 */
public class Aq.Queues  implements java.io.Serializable {


     private byte[] oid;
     private BigDecimal eventid;
     private String name;
     private BigDecimal tableObjno;
     private BigDecimal usage;
     private BigDecimal enableFlag;
     private BigDecimal maxRetries;
     private BigDecimal retryDelay;
     private BigDecimal properties;
     private BigDecimal retTime;
     private String queueComment;
     private Serializable subscribers;
     private BigDecimal memoryThreshold;
     private String serviceName;
     private String networkName;
     private byte[] subOid;
     private BigDecimal sharded;
     private BigDecimal baseQueue;

    public Aq.Queues() {
    }

	
    public Aq.Queues(byte[] oid, BigDecimal eventid, String name, BigDecimal tableObjno, BigDecimal usage, BigDecimal enableFlag) {
        this.oid = oid;
        this.eventid = eventid;
        this.name = name;
        this.tableObjno = tableObjno;
        this.usage = usage;
        this.enableFlag = enableFlag;
    }
    public Aq.Queues(byte[] oid, BigDecimal eventid, String name, BigDecimal tableObjno, BigDecimal usage, BigDecimal enableFlag, BigDecimal maxRetries, BigDecimal retryDelay, BigDecimal properties, BigDecimal retTime, String queueComment, Serializable subscribers, BigDecimal memoryThreshold, String serviceName, String networkName, byte[] subOid, BigDecimal sharded, BigDecimal baseQueue) {
       this.oid = oid;
       this.eventid = eventid;
       this.name = name;
       this.tableObjno = tableObjno;
       this.usage = usage;
       this.enableFlag = enableFlag;
       this.maxRetries = maxRetries;
       this.retryDelay = retryDelay;
       this.properties = properties;
       this.retTime = retTime;
       this.queueComment = queueComment;
       this.subscribers = subscribers;
       this.memoryThreshold = memoryThreshold;
       this.serviceName = serviceName;
       this.networkName = networkName;
       this.subOid = subOid;
       this.sharded = sharded;
       this.baseQueue = baseQueue;
    }
   
    public byte[] getOid() {
        return this.oid;
    }
    
    public void setOid(byte[] oid) {
        this.oid = oid;
    }
    public BigDecimal getEventid() {
        return this.eventid;
    }
    
    public void setEventid(BigDecimal eventid) {
        this.eventid = eventid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getTableObjno() {
        return this.tableObjno;
    }
    
    public void setTableObjno(BigDecimal tableObjno) {
        this.tableObjno = tableObjno;
    }
    public BigDecimal getUsage() {
        return this.usage;
    }
    
    public void setUsage(BigDecimal usage) {
        this.usage = usage;
    }
    public BigDecimal getEnableFlag() {
        return this.enableFlag;
    }
    
    public void setEnableFlag(BigDecimal enableFlag) {
        this.enableFlag = enableFlag;
    }
    public BigDecimal getMaxRetries() {
        return this.maxRetries;
    }
    
    public void setMaxRetries(BigDecimal maxRetries) {
        this.maxRetries = maxRetries;
    }
    public BigDecimal getRetryDelay() {
        return this.retryDelay;
    }
    
    public void setRetryDelay(BigDecimal retryDelay) {
        this.retryDelay = retryDelay;
    }
    public BigDecimal getProperties() {
        return this.properties;
    }
    
    public void setProperties(BigDecimal properties) {
        this.properties = properties;
    }
    public BigDecimal getRetTime() {
        return this.retTime;
    }
    
    public void setRetTime(BigDecimal retTime) {
        this.retTime = retTime;
    }
    public String getQueueComment() {
        return this.queueComment;
    }
    
    public void setQueueComment(String queueComment) {
        this.queueComment = queueComment;
    }
    public Serializable getSubscribers() {
        return this.subscribers;
    }
    
    public void setSubscribers(Serializable subscribers) {
        this.subscribers = subscribers;
    }
    public BigDecimal getMemoryThreshold() {
        return this.memoryThreshold;
    }
    
    public void setMemoryThreshold(BigDecimal memoryThreshold) {
        this.memoryThreshold = memoryThreshold;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getNetworkName() {
        return this.networkName;
    }
    
    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    public byte[] getSubOid() {
        return this.subOid;
    }
    
    public void setSubOid(byte[] subOid) {
        this.subOid = subOid;
    }
    public BigDecimal getSharded() {
        return this.sharded;
    }
    
    public void setSharded(BigDecimal sharded) {
        this.sharded = sharded;
    }
    public BigDecimal getBaseQueue() {
        return this.baseQueue;
    }
    
    public void setBaseQueue(BigDecimal baseQueue) {
        this.baseQueue = baseQueue;
    }




}


