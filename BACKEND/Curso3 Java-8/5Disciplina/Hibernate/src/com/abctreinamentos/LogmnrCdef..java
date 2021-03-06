package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrCdef.Id;
import java.math.BigDecimal;

/**
 * LogmnrCdef. generated by hbm2java
 */
public class LogmnrCdef.  implements java.io.Serializable {


     private LogmnrCdef.Id id;
     private BigDecimal cols;
     private BigDecimal type#;
     private BigDecimal robj#;
     private BigDecimal rcon#;
     private BigDecimal enabled;
     private BigDecimal defer;
     private BigDecimal obj#;
     private BigDecimal logmnrFlags;

    public LogmnrCdef.() {
    }

	
    public LogmnrCdef.(LogmnrCdef.Id id, BigDecimal obj#) {
        this.id = id;
        this.obj# = obj#;
    }
    public LogmnrCdef.(LogmnrCdef.Id id, BigDecimal cols, BigDecimal type#, BigDecimal robj#, BigDecimal rcon#, BigDecimal enabled, BigDecimal defer, BigDecimal obj#, BigDecimal logmnrFlags) {
       this.id = id;
       this.cols = cols;
       this.type# = type#;
       this.robj# = robj#;
       this.rcon# = rcon#;
       this.enabled = enabled;
       this.defer = defer;
       this.obj# = obj#;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrCdef.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrCdef.Id id) {
        this.id = id;
    }
    public BigDecimal getCols() {
        return this.cols;
    }
    
    public void setCols(BigDecimal cols) {
        this.cols = cols;
    }
    public BigDecimal getType#() {
        return this.type#;
    }
    
    public void setType#(BigDecimal type#) {
        this.type# = type#;
    }
    public BigDecimal getRobj#() {
        return this.robj#;
    }
    
    public void setRobj#(BigDecimal robj#) {
        this.robj# = robj#;
    }
    public BigDecimal getRcon#() {
        return this.rcon#;
    }
    
    public void setRcon#(BigDecimal rcon#) {
        this.rcon# = rcon#;
    }
    public BigDecimal getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(BigDecimal enabled) {
        this.enabled = enabled;
    }
    public BigDecimal getDefer() {
        return this.defer;
    }
    
    public void setDefer(BigDecimal defer) {
        this.defer = defer;
    }
    public BigDecimal getObj#() {
        return this.obj#;
    }
    
    public void setObj#(BigDecimal obj#) {
        this.obj# = obj#;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


