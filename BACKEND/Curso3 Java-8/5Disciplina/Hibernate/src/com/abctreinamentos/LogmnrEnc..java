package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrEnc.Id;
import java.math.BigDecimal;

/**
 * LogmnrEnc. generated by hbm2java
 */
public class LogmnrEnc.  implements java.io.Serializable {


     private LogmnrEnc.Id id;
     private BigDecimal encalg;
     private BigDecimal intalg;
     private byte[] colklc;
     private BigDecimal klclen;
     private BigDecimal flag;
     private String mkeyid;
     private BigDecimal logmnrFlags;

    public LogmnrEnc.() {
    }

	
    public LogmnrEnc.(LogmnrEnc.Id id, String mkeyid) {
        this.id = id;
        this.mkeyid = mkeyid;
    }
    public LogmnrEnc.(LogmnrEnc.Id id, BigDecimal encalg, BigDecimal intalg, byte[] colklc, BigDecimal klclen, BigDecimal flag, String mkeyid, BigDecimal logmnrFlags) {
       this.id = id;
       this.encalg = encalg;
       this.intalg = intalg;
       this.colklc = colklc;
       this.klclen = klclen;
       this.flag = flag;
       this.mkeyid = mkeyid;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrEnc.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrEnc.Id id) {
        this.id = id;
    }
    public BigDecimal getEncalg() {
        return this.encalg;
    }
    
    public void setEncalg(BigDecimal encalg) {
        this.encalg = encalg;
    }
    public BigDecimal getIntalg() {
        return this.intalg;
    }
    
    public void setIntalg(BigDecimal intalg) {
        this.intalg = intalg;
    }
    public byte[] getColklc() {
        return this.colklc;
    }
    
    public void setColklc(byte[] colklc) {
        this.colklc = colklc;
    }
    public BigDecimal getKlclen() {
        return this.klclen;
    }
    
    public void setKlclen(BigDecimal klclen) {
        this.klclen = klclen;
    }
    public BigDecimal getFlag() {
        return this.flag;
    }
    
    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }
    public String getMkeyid() {
        return this.mkeyid;
    }
    
    public void setMkeyid(String mkeyid) {
        this.mkeyid = mkeyid;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


