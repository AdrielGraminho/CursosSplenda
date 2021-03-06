package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrDictstate. generated by hbm2java
 */
public class LogmnrDictstate.  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal startScnbas;
     private BigDecimal startScnwrp;
     private BigDecimal endScnbas;
     private BigDecimal endScnwrp;
     private BigDecimal redoThread;
     private BigDecimal rbasqn;
     private BigDecimal rbablk;
     private BigDecimal rbabyte;
     private BigDecimal logmnrFlags;

    public LogmnrDictstate.() {
    }

	
    public LogmnrDictstate.(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public LogmnrDictstate.(BigDecimal logmnrUid, BigDecimal startScnbas, BigDecimal startScnwrp, BigDecimal endScnbas, BigDecimal endScnwrp, BigDecimal redoThread, BigDecimal rbasqn, BigDecimal rbablk, BigDecimal rbabyte, BigDecimal logmnrFlags) {
       this.logmnrUid = logmnrUid;
       this.startScnbas = startScnbas;
       this.startScnwrp = startScnwrp;
       this.endScnbas = endScnbas;
       this.endScnwrp = endScnwrp;
       this.redoThread = redoThread;
       this.rbasqn = rbasqn;
       this.rbablk = rbablk;
       this.rbabyte = rbabyte;
       this.logmnrFlags = logmnrFlags;
    }
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public BigDecimal getStartScnbas() {
        return this.startScnbas;
    }
    
    public void setStartScnbas(BigDecimal startScnbas) {
        this.startScnbas = startScnbas;
    }
    public BigDecimal getStartScnwrp() {
        return this.startScnwrp;
    }
    
    public void setStartScnwrp(BigDecimal startScnwrp) {
        this.startScnwrp = startScnwrp;
    }
    public BigDecimal getEndScnbas() {
        return this.endScnbas;
    }
    
    public void setEndScnbas(BigDecimal endScnbas) {
        this.endScnbas = endScnbas;
    }
    public BigDecimal getEndScnwrp() {
        return this.endScnwrp;
    }
    
    public void setEndScnwrp(BigDecimal endScnwrp) {
        this.endScnwrp = endScnwrp;
    }
    public BigDecimal getRedoThread() {
        return this.redoThread;
    }
    
    public void setRedoThread(BigDecimal redoThread) {
        this.redoThread = redoThread;
    }
    public BigDecimal getRbasqn() {
        return this.rbasqn;
    }
    
    public void setRbasqn(BigDecimal rbasqn) {
        this.rbasqn = rbasqn;
    }
    public BigDecimal getRbablk() {
        return this.rbablk;
    }
    
    public void setRbablk(BigDecimal rbablk) {
        this.rbablk = rbablk;
    }
    public BigDecimal getRbabyte() {
        return this.rbabyte;
    }
    
    public void setRbabyte(BigDecimal rbabyte) {
        this.rbabyte = rbabyte;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


