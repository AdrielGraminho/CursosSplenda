package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrRestartCkptTxinfo.Id;
import java.math.BigDecimal;
import java.sql.Blob;

/**
 * LogmnrRestartCkptTxinfo. generated by hbm2java
 */
public class LogmnrRestartCkptTxinfo.  implements java.io.Serializable {


     private LogmnrRestartCkptTxinfo.Id id;
     private BigDecimal flag;
     private BigDecimal startScn;
     private BigDecimal offset;
     private Blob txData;

    public LogmnrRestartCkptTxinfo.() {
    }

	
    public LogmnrRestartCkptTxinfo.(LogmnrRestartCkptTxinfo.Id id) {
        this.id = id;
    }
    public LogmnrRestartCkptTxinfo.(LogmnrRestartCkptTxinfo.Id id, BigDecimal flag, BigDecimal startScn, BigDecimal offset, Blob txData) {
       this.id = id;
       this.flag = flag;
       this.startScn = startScn;
       this.offset = offset;
       this.txData = txData;
    }
   
    public LogmnrRestartCkptTxinfo.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrRestartCkptTxinfo.Id id) {
        this.id = id;
    }
    public BigDecimal getFlag() {
        return this.flag;
    }
    
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }
    public BigDecimal getStartScn() {
        return this.startScn;
    }
    
    public void setStartScn(BigDecimal startScn) {
        this.startScn = startScn;
    }
    public BigDecimal getOffset() {
        return this.offset;
    }
    
    public void setOffset(BigDecimal offset) {
        this.offset = offset;
    }
    public Blob getTxData() {
        return this.txData;
    }
    
    public void setTxData(Blob txData) {
        this.txData = txData;
    }




}


