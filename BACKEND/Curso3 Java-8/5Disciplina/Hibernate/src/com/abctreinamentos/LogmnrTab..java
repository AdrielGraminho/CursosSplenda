package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrTab.Id;
import java.math.BigDecimal;

/**
 * LogmnrTab. generated by hbm2java
 */
public class LogmnrTab.  implements java.io.Serializable {


     private LogmnrTab.Id id;
     private BigDecimal ts#;
     private BigDecimal cols;
     private BigDecimal property;
     private BigDecimal intcols;
     private BigDecimal kernelcols;
     private BigDecimal bobj#;
     private BigDecimal trigflag;
     private BigDecimal flags;
     private BigDecimal logmnrFlags;
     private BigDecimal acdrflags;
     private BigDecimal acdrtsobj#;
     private BigDecimal acdrrowtsintcol#;

    public LogmnrTab.() {
    }

	
    public LogmnrTab.(LogmnrTab.Id id) {
        this.id = id;
    }
    public LogmnrTab.(LogmnrTab.Id id, BigDecimal ts#, BigDecimal cols, BigDecimal property, BigDecimal intcols, BigDecimal kernelcols, BigDecimal bobj#, BigDecimal trigflag, BigDecimal flags, BigDecimal logmnrFlags, BigDecimal acdrflags, BigDecimal acdrtsobj#, BigDecimal acdrrowtsintcol#) {
       this.id = id;
       this.ts# = ts#;
       this.cols = cols;
       this.property = property;
       this.intcols = intcols;
       this.kernelcols = kernelcols;
       this.bobj# = bobj#;
       this.trigflag = trigflag;
       this.flags = flags;
       this.logmnrFlags = logmnrFlags;
       this.acdrflags = acdrflags;
       this.acdrtsobj# = acdrtsobj#;
       this.acdrrowtsintcol# = acdrrowtsintcol#;
    }
   
    public LogmnrTab.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrTab.Id id) {
        this.id = id;
    }
    public BigDecimal getTs#() {
        return this.ts#;
    }
    
    public void setTs#(BigDecimal ts#) {
        this.ts# = ts#;
    }
    public BigDecimal getCols() {
        return this.cols;
    }
    
    public void setCols(BigDecimal cols) {
        this.cols = cols;
    }
    public BigDecimal getProperty() {
        return this.property;
    }
    
    public void setProperty(BigDecimal property) {
        this.property = property;
    }
    public BigDecimal getIntcols() {
        return this.intcols;
    }
    
    public void setIntcols(BigDecimal intcols) {
        this.intcols = intcols;
    }
    public BigDecimal getKernelcols() {
        return this.kernelcols;
    }
    
    public void setKernelcols(BigDecimal kernelcols) {
        this.kernelcols = kernelcols;
    }
    public BigDecimal getBobj#() {
        return this.bobj#;
    }
    
    public void setBobj#(BigDecimal bobj#) {
        this.bobj# = bobj#;
    }
    public BigDecimal getTrigflag() {
        return this.trigflag;
    }
    
    public void setTrigflag(BigDecimal trigflag) {
        this.trigflag = trigflag;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }
    public BigDecimal getAcdrflags() {
        return this.acdrflags;
    }
    
    public void setAcdrflags(BigDecimal acdrflags) {
        this.acdrflags = acdrflags;
    }
    public BigDecimal getAcdrtsobj#() {
        return this.acdrtsobj#;
    }
    
    public void setAcdrtsobj#(BigDecimal acdrtsobj#) {
        this.acdrtsobj# = acdrtsobj#;
    }
    public BigDecimal getAcdrrowtsintcol#() {
        return this.acdrrowtsintcol#;
    }
    
    public void setAcdrrowtsintcol#(BigDecimal acdrrowtsintcol#) {
        this.acdrrowtsintcol# = acdrrowtsintcol#;
    }




}


