package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrLobfrag.Id;
import java.math.BigDecimal;

/**
 * LogmnrLobfrag. generated by hbm2java
 */
public class LogmnrLobfrag.  implements java.io.Serializable {


     private LogmnrLobfrag.Id id;
     private BigDecimal parentobj#;
     private BigDecimal tabfragobj#;
     private BigDecimal indfragobj#;
     private BigDecimal frag#;
     private BigDecimal logmnrFlags;

    public LogmnrLobfrag.() {
    }

	
    public LogmnrLobfrag.(LogmnrLobfrag.Id id, BigDecimal frag#) {
        this.id = id;
        this.frag# = frag#;
    }
    public LogmnrLobfrag.(LogmnrLobfrag.Id id, BigDecimal parentobj#, BigDecimal tabfragobj#, BigDecimal indfragobj#, BigDecimal frag#, BigDecimal logmnrFlags) {
       this.id = id;
       this.parentobj# = parentobj#;
       this.tabfragobj# = tabfragobj#;
       this.indfragobj# = indfragobj#;
       this.frag# = frag#;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrLobfrag.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrLobfrag.Id id) {
        this.id = id;
    }
    public BigDecimal getParentobj#() {
        return this.parentobj#;
    }
    
    public void setParentobj#(BigDecimal parentobj#) {
        this.parentobj# = parentobj#;
    }
    public BigDecimal getTabfragobj#() {
        return this.tabfragobj#;
    }
    
    public void setTabfragobj#(BigDecimal tabfragobj#) {
        this.tabfragobj# = tabfragobj#;
    }
    public BigDecimal getIndfragobj#() {
        return this.indfragobj#;
    }
    
    public void setIndfragobj#(BigDecimal indfragobj#) {
        this.indfragobj# = indfragobj#;
    }
    public BigDecimal getFrag#() {
        return this.frag#;
    }
    
    public void setFrag#(BigDecimal frag#) {
        this.frag# = frag#;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


