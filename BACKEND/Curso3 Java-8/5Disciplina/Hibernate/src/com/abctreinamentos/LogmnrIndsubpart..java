package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrIndsubpart.Id;
import java.math.BigDecimal;

/**
 * LogmnrIndsubpart. generated by hbm2java
 */
public class LogmnrIndsubpart.  implements java.io.Serializable {


     private LogmnrIndsubpart.Id id;
     private BigDecimal dataobj#;
     private BigDecimal subpart#;
     private BigDecimal ts#;
     private BigDecimal logmnrFlags;

    public LogmnrIndsubpart.() {
    }

	
    public LogmnrIndsubpart.(LogmnrIndsubpart.Id id, BigDecimal ts#) {
        this.id = id;
        this.ts# = ts#;
    }
    public LogmnrIndsubpart.(LogmnrIndsubpart.Id id, BigDecimal dataobj#, BigDecimal subpart#, BigDecimal ts#, BigDecimal logmnrFlags) {
       this.id = id;
       this.dataobj# = dataobj#;
       this.subpart# = subpart#;
       this.ts# = ts#;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrIndsubpart.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrIndsubpart.Id id) {
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


