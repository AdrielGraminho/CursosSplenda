package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrTabsubpart.Id;
import java.math.BigDecimal;

/**
 * LogmnrTabsubpart. generated by hbm2java
 */
public class LogmnrTabsubpart.  implements java.io.Serializable {


     private LogmnrTabsubpart.Id id;
     private BigDecimal dataobj#;
     private BigDecimal subpart#;
     private BigDecimal ts#;
     private BigDecimal logmnrFlags;

    public LogmnrTabsubpart.() {
    }

	
    public LogmnrTabsubpart.(LogmnrTabsubpart.Id id, BigDecimal ts#) {
        this.id = id;
        this.ts# = ts#;
    }
    public LogmnrTabsubpart.(LogmnrTabsubpart.Id id, BigDecimal dataobj#, BigDecimal subpart#, BigDecimal ts#, BigDecimal logmnrFlags) {
       this.id = id;
       this.dataobj# = dataobj#;
       this.subpart# = subpart#;
       this.ts# = ts#;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrTabsubpart.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrTabsubpart.Id id) {
        this.id = id;
    }
    public BigDecimal getDataobj#() {
        return this.dataobj#;
    }
    
    public void setDataobj#(BigDecimal dataobj#) {
        this.dataobj# = dataobj#;
    }
    public BigDecimal getSubpart#() {
        return this.subpart#;
    }
    
    public void setSubpart#(BigDecimal subpart#) {
        this.subpart# = subpart#;
    }
    public BigDecimal getTs#() {
        return this.ts#;
    }
    
    public void setTs#(BigDecimal ts#) {
        this.ts# = ts#;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


