package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrProps.Id;
import java.math.BigDecimal;

/**
 * LogmnrProps. generated by hbm2java
 */
public class LogmnrProps.  implements java.io.Serializable {


     private LogmnrProps.Id id;
     private String value$;
     private String comment$;
     private BigDecimal logmnrFlags;

    public LogmnrProps.() {
    }

	
    public LogmnrProps.(LogmnrProps.Id id) {
        this.id = id;
    }
    public LogmnrProps.(LogmnrProps.Id id, String value$, String comment$, BigDecimal logmnrFlags) {
       this.id = id;
       this.value$ = value$;
       this.comment$ = comment$;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrProps.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrProps.Id id) {
        this.id = id;
    }
    public String getValue$() {
        return this.value$;
    }
    
    public void setValue$(String value$) {
        this.value$ = value$;
    }
    public String getComment$() {
        return this.comment$;
    }
    
    public void setComment$(String comment$) {
        this.comment$ = comment$;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


