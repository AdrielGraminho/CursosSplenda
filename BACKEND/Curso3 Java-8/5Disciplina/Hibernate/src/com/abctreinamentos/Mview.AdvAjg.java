package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.Mview.AdvLog;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Mview.AdvAjg generated by hbm2java
 */
public class Mview.AdvAjg  implements java.io.Serializable {


     private BigDecimal ajgid#;
     private Mview.AdvLog mview$AdvLog;
     private BigDecimal ajgdeslen;
     private byte[] ajgdes;
     private BigDecimal hashvalue;
     private BigDecimal frequency;
     private Set mview$AdvFjgs = new HashSet(0);

    public Mview.AdvAjg() {
    }

	
    public Mview.AdvAjg(BigDecimal ajgid#, Mview.AdvLog mview$AdvLog, BigDecimal ajgdeslen, byte[] ajgdes, BigDecimal hashvalue) {
        this.ajgid# = ajgid#;
        this.mview$AdvLog = mview$AdvLog;
        this.ajgdeslen = ajgdeslen;
        this.ajgdes = ajgdes;
        this.hashvalue = hashvalue;
    }
    public Mview.AdvAjg(BigDecimal ajgid#, Mview.AdvLog mview$AdvLog, BigDecimal ajgdeslen, byte[] ajgdes, BigDecimal hashvalue, BigDecimal frequency, Set mview$AdvFjgs) {
       this.ajgid# = ajgid#;
       this.mview$AdvLog = mview$AdvLog;
       this.ajgdeslen = ajgdeslen;
       this.ajgdes = ajgdes;
       this.hashvalue = hashvalue;
       this.frequency = frequency;
       this.mview$AdvFjgs = mview$AdvFjgs;
    }
   
    public BigDecimal getAjgid#() {
        return this.ajgid#;
    }
    
    public void setAjgid#(BigDecimal ajgid#) {
        this.ajgid# = ajgid#;
    }
    public Mview.AdvLog getMview$AdvLog() {
        return this.mview$AdvLog;
    }
    
    public void setMview$AdvLog(Mview.AdvLog mview$AdvLog) {
        this.mview$AdvLog = mview$AdvLog;
    }
    public BigDecimal getAjgdeslen() {
        return this.ajgdeslen;
    }
    
    public void setAjgdeslen(BigDecimal ajgdeslen) {
        this.ajgdeslen = ajgdeslen;
    }
    public byte[] getAjgdes() {
        return this.ajgdes;
    }
    
    public void setAjgdes(byte[] ajgdes) {
        this.ajgdes = ajgdes;
    }
    public BigDecimal getHashvalue() {
        return this.hashvalue;
    }
    
    public void setHashvalue(BigDecimal hashvalue) {
        this.hashvalue = hashvalue;
    }
    public BigDecimal getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }
    public Set getMview$AdvFjgs() {
        return this.mview$AdvFjgs;
    }
    
    public void setMview$AdvFjgs(Set mview$AdvFjgs) {
        this.mview$AdvFjgs = mview$AdvFjgs;
    }




}


