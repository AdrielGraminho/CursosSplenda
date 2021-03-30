package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrCon.Id;
import java.math.BigDecimal;

/**
 * LogmnrCon. generated by hbm2java
 */
public class LogmnrCon.  implements java.io.Serializable {


     private LogmnrCon.Id id;
     private BigDecimal owner#;
     private String name;
     private BigDecimal logmnrFlags;
     private BigDecimal startScnbas;
     private BigDecimal startScnwrp;

    public LogmnrCon.() {
    }

	
    public LogmnrCon.(LogmnrCon.Id id, BigDecimal owner#, String name) {
        this.id = id;
        this.owner# = owner#;
        this.name = name;
    }
    public LogmnrCon.(LogmnrCon.Id id, BigDecimal owner#, String name, BigDecimal logmnrFlags, BigDecimal startScnbas, BigDecimal startScnwrp) {
       this.id = id;
       this.owner# = owner#;
       this.name = name;
       this.logmnrFlags = logmnrFlags;
       this.startScnbas = startScnbas;
       this.startScnwrp = startScnwrp;
    }
   
    public LogmnrCon.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrCon.Id id) {
        this.id = id;
    }
    public BigDecimal getOwner#() {
        return this.owner#;
    }
    
    public void setOwner#(BigDecimal owner#) {
        this.owner# = owner#;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }
    public BigDecimal getStartScnbas() {
        return this.startScnbas;
    }
    
    public void setStartScnbas(BigDecimal startScnbas) {
        this.startScnbas = startScnbas;
    }
    public BigDecimal getStartScnwrp() {
        return this.startScnwrp;
    }
    
    public void setStartScnwrp(BigDecimal startScnwrp) {
        this.startScnwrp = startScnwrp;
    }




}


