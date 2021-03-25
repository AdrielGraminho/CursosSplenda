package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrProcessedLog.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * LogmnrProcessedLog. generated by hbm2java
 */
public class LogmnrProcessedLog.  implements java.io.Serializable {


     private LogmnrProcessedLog.Id id;
     private Date timestamp;
     private BigDecimal sequence#;
     private BigDecimal firstChange#;
     private BigDecimal nextChange#;
     private Date firstTime;
     private Date nextTime;
     private String fileName;
     private BigDecimal status;
     private String info;

    public LogmnrProcessedLog.() {
    }

	
    public LogmnrProcessedLog.(LogmnrProcessedLog.Id id) {
        this.id = id;
    }
    public LogmnrProcessedLog.(LogmnrProcessedLog.Id id, BigDecimal sequence#, BigDecimal firstChange#, BigDecimal nextChange#, Date firstTime, Date nextTime, String fileName, BigDecimal status, String info) {
       this.id = id;
       this.sequence# = sequence#;
       this.firstChange# = firstChange#;
       this.nextChange# = nextChange#;
       this.firstTime = firstTime;
       this.nextTime = nextTime;
       this.fileName = fileName;
       this.status = status;
       this.info = info;
    }
   
    public LogmnrProcessedLog.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrProcessedLog.Id id) {
        this.id = id;
    }
    public Date getTimestamp() {
        return this.timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public BigDecimal getSequence#() {
        return this.sequence#;
    }
    
    public void setSequence#(BigDecimal sequence#) {
        this.sequence# = sequence#;
    }
    public BigDecimal getFirstChange#() {
        return this.firstChange#;
    }
    
    public void setFirstChange#(BigDecimal firstChange#) {
        this.firstChange# = firstChange#;
    }
    public BigDecimal getNextChange#() {
        return this.nextChange#;
    }
    
    public void setNextChange#(BigDecimal nextChange#) {
        this.nextChange# = nextChange#;
    }
    public Date getFirstTime() {
        return this.firstTime;
    }
    
    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }
    public Date getNextTime() {
        return this.nextTime;
    }
    
    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }
    public String getFileName() {
        return this.fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }




}

