package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrLob.Id;
import java.math.BigDecimal;

/**
 * LogmnrLob. generated by hbm2java
 */
public class LogmnrLob.  implements java.io.Serializable {


     private LogmnrLob.Id id;
     private BigDecimal col#;
     private BigDecimal lobj#;
     private BigDecimal chunk;
     private BigDecimal logmnrFlags;

    public LogmnrLob.() {
    }

	
    public LogmnrLob.(LogmnrLob.Id id, BigDecimal chunk) {
        this.id = id;
        this.chunk = chunk;
    }
    public LogmnrLob.(LogmnrLob.Id id, BigDecimal col#, BigDecimal lobj#, BigDecimal chunk, BigDecimal logmnrFlags) {
       this.id = id;
       this.col# = col#;
       this.lobj# = lobj#;
       this.chunk = chunk;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrLob.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrLob.Id id) {
        this.id = id;
    }
    public BigDecimal getCol#() {
        return this.col#;
    }
    
    public void setCol#(BigDecimal col#) {
        this.col# = col#;
    }
    public BigDecimal getLobj#() {
        return this.lobj#;
    }
    
    public void setLobj#(BigDecimal lobj#) {
        this.lobj# = lobj#;
    }
    public BigDecimal getChunk() {
        return this.chunk;
    }
    
    public void setChunk(BigDecimal chunk) {
        this.chunk = chunk;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}

