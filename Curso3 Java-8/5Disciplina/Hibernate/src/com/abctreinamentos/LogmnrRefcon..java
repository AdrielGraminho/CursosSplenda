package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrRefcon.Id;
import java.math.BigDecimal;

/**
 * LogmnrRefcon. generated by hbm2java
 */
public class LogmnrRefcon.  implements java.io.Serializable {


     private LogmnrRefcon.Id id;
     private BigDecimal col#;
     private BigDecimal reftyp;
     private byte[] stabid;
     private byte[] expctoid;
     private BigDecimal logmnrFlags;

    public LogmnrRefcon.() {
    }

	
    public LogmnrRefcon.(LogmnrRefcon.Id id) {
        this.id = id;
    }
    public LogmnrRefcon.(LogmnrRefcon.Id id, BigDecimal col#, BigDecimal reftyp, byte[] stabid, byte[] expctoid, BigDecimal logmnrFlags) {
       this.id = id;
       this.col# = col#;
       this.reftyp = reftyp;
       this.stabid = stabid;
       this.expctoid = expctoid;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrRefcon.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrRefcon.Id id) {
        this.id = id;
    }
    public BigDecimal getCol#() {
        return this.col#;
    }
    
    public void setCol#(BigDecimal col#) {
        this.col# = col#;
    }
    public BigDecimal getReftyp() {
        return this.reftyp;
    }
    
    public void setReftyp(BigDecimal reftyp) {
        this.reftyp = reftyp;
    }
    public byte[] getStabid() {
        return this.stabid;
    }
    
    public void setStabid(byte[] stabid) {
        this.stabid = stabid;
    }
    public byte[] getExpctoid() {
        return this.expctoid;
    }
    
    public void setExpctoid(byte[] expctoid) {
        this.expctoid = expctoid;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}

