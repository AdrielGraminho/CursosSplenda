package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * LogmnrDid. generated by hbm2java
 */
public class LogmnrDid.  implements java.io.Serializable {


     private BigDecimal session#;
     private BigDecimal logmnrDid;
     private BigDecimal flags;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;
     private Serializable spare4;

    public LogmnrDid.() {
    }

	
    public LogmnrDid.(BigDecimal session#) {
        this.session# = session#;
    }
    public LogmnrDid.(BigDecimal session#, BigDecimal logmnrDid, BigDecimal flags, BigDecimal spare1, BigDecimal spare2, String spare3, Serializable spare4) {
       this.session# = session#;
       this.logmnrDid = logmnrDid;
       this.flags = flags;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.spare4 = spare4;
    }
   
    public BigDecimal getSession#() {
        return this.session#;
    }
    
    public void setSession#(BigDecimal session#) {
        this.session# = session#;
    }
    public BigDecimal getLogmnrDid() {
        return this.logmnrDid;
    }
    
    public void setLogmnrDid(BigDecimal logmnrDid) {
        this.logmnrDid = logmnrDid;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(BigDecimal spare1) {
        this.spare1 = spare1;
    }
    public BigDecimal getSpare2() {
        return this.spare2;
    }
    
    public void setSpare2(BigDecimal spare2) {
        this.spare2 = spare2;
    }
    public String getSpare3() {
        return this.spare3;
    }
    
    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }
    public Serializable getSpare4() {
        return this.spare4;
    }
    
    public void setSpare4(Serializable spare4) {
        this.spare4 = spare4;
    }




}

