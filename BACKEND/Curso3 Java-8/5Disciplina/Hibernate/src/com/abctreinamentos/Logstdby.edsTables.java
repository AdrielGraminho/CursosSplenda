package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.Logstdby.edsTablesId;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Logstdby.edsTables generated by hbm2java
 */
public class Logstdby.edsTables  implements java.io.Serializable {


     private Logstdby.edsTablesId id;
     private String shadowTableName;
     private String baseTriggerName;
     private String shadowTriggerName;
     private String dblink;
     private BigDecimal flags;
     private String state;
     private BigDecimal objv;
     private BigDecimal obj#;
     private BigDecimal sobj#;
     private Serializable ctime;
     private BigDecimal spare1;
     private String spare2;
     private BigDecimal spare3;
     private String mviewName;
     private String mviewLogName;
     private String mviewTriggerName;

    public Logstdby.edsTables() {
    }

	
    public Logstdby.edsTables(Logstdby.edsTablesId id) {
        this.id = id;
    }
    public Logstdby.edsTables(Logstdby.edsTablesId id, String shadowTableName, String baseTriggerName, String shadowTriggerName, String dblink, BigDecimal flags, String state, BigDecimal objv, BigDecimal obj#, BigDecimal sobj#, Serializable ctime, BigDecimal spare1, String spare2, BigDecimal spare3, String mviewName, String mviewLogName, String mviewTriggerName) {
       this.id = id;
       this.shadowTableName = shadowTableName;
       this.baseTriggerName = baseTriggerName;
       this.shadowTriggerName = shadowTriggerName;
       this.dblink = dblink;
       this.flags = flags;
       this.state = state;
       this.objv = objv;
       this.obj# = obj#;
       this.sobj# = sobj#;
       this.ctime = ctime;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.mviewName = mviewName;
       this.mviewLogName = mviewLogName;
       this.mviewTriggerName = mviewTriggerName;
    }
   
    public Logstdby.edsTablesId getId() {
        return this.id;
    }
    
    public void setId(Logstdby.edsTablesId id) {
        this.id = id;
    }
    public String getShadowTableName() {
        return this.shadowTableName;
    }
    
    public void setShadowTableName(String shadowTableName) {
        this.shadowTableName = shadowTableName;
    }
    public String getBaseTriggerName() {
        return this.baseTriggerName;
    }
    
    public void setBaseTriggerName(String baseTriggerName) {
        this.baseTriggerName = baseTriggerName;
    }
    public String getShadowTriggerName() {
        return this.shadowTriggerName;
    }
    
    public void setShadowTriggerName(String shadowTriggerName) {
        this.shadowTriggerName = shadowTriggerName;
    }
    public String getDblink() {
        return this.dblink;
    }
    
    public void setDblink(String dblink) {
        this.dblink = dblink;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public BigDecimal getObjv() {
        return this.objv;
    }
    
    public void setObjv(BigDecimal objv) {
        this.objv = objv;
    }
    public BigDecimal getObj#() {
        return this.obj#;
    }
    
    public void setObj#(BigDecimal obj#) {
        this.obj# = obj#;
    }
    public BigDecimal getSobj#() {
        return this.sobj#;
    }
    
    public void setSobj#(BigDecimal sobj#) {
        this.sobj# = sobj#;
    }
    public Serializable getCtime() {
        return this.ctime;
    }
    
    public void setCtime(Serializable ctime) {
        this.ctime = ctime;
    }
    public BigDecimal getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(BigDecimal spare1) {
        this.spare1 = spare1;
    }
    public String getSpare2() {
        return this.spare2;
    }
    
    public void setSpare2(String spare2) {
        this.spare2 = spare2;
    }
    public BigDecimal getSpare3() {
        return this.spare3;
    }
    
    public void setSpare3(BigDecimal spare3) {
        this.spare3 = spare3;
    }
    public String getMviewName() {
        return this.mviewName;
    }
    
    public void setMviewName(String mviewName) {
        this.mviewName = mviewName;
    }
    public String getMviewLogName() {
        return this.mviewLogName;
    }
    
    public void setMviewLogName(String mviewLogName) {
        this.mviewLogName = mviewLogName;
    }
    public String getMviewTriggerName() {
        return this.mviewTriggerName;
    }
    
    public void setMviewTriggerName(String mviewTriggerName) {
        this.mviewTriggerName = mviewTriggerName;
    }




}


