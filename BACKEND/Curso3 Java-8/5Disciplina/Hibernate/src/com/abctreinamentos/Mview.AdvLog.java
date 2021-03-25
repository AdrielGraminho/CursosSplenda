package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Mview.AdvLog generated by hbm2java
 */
public class Mview.AdvLog  implements java.io.Serializable {


     private BigDecimal runid#;
     private BigDecimal filterid#;
     private Date runBegin;
     private Date runEnd;
     private BigDecimal runType;
     private String uname;
     private BigDecimal status;
     private String message;
     private BigDecimal completed;
     private BigDecimal total;
     private String errorCode;
     private Set mview$AdvExceptionses = new HashSet(0);
     private Set mview$AdvEligibles = new HashSet(0);
     private Set mview$AdvOutputs = new HashSet(0);
     private Set mview$AdvRollups = new HashSet(0);
     private Set mview$AdvAjgs = new HashSet(0);
     private Set mview$AdvInfos = new HashSet(0);
     private Set mview$AdvCliques = new HashSet(0);
     private Set mview$AdvFilterinstances = new HashSet(0);
     private Set mview$AdvLevels = new HashSet(0);
     private Set mview$AdvJournals = new HashSet(0);

    public Mview.AdvLog() {
    }

	
    public Mview.AdvLog(BigDecimal runid#, BigDecimal status) {
        this.runid# = runid#;
        this.status = status;
    }
    public Mview.AdvLog(BigDecimal runid#, BigDecimal filterid#, Date runBegin, Date runEnd, BigDecimal runType, String uname, BigDecimal status, String message, BigDecimal completed, BigDecimal total, String errorCode, Set mview$AdvExceptionses, Set mview$AdvEligibles, Set mview$AdvOutputs, Set mview$AdvRollups, Set mview$AdvAjgs, Set mview$AdvInfos, Set mview$AdvCliques, Set mview$AdvFilterinstances, Set mview$AdvLevels, Set mview$AdvJournals) {
       this.runid# = runid#;
       this.filterid# = filterid#;
       this.runBegin = runBegin;
       this.runEnd = runEnd;
       this.runType = runType;
       this.uname = uname;
       this.status = status;
       this.message = message;
       this.completed = completed;
       this.total = total;
       this.errorCode = errorCode;
       this.mview$AdvExceptionses = mview$AdvExceptionses;
       this.mview$AdvEligibles = mview$AdvEligibles;
       this.mview$AdvOutputs = mview$AdvOutputs;
       this.mview$AdvRollups = mview$AdvRollups;
       this.mview$AdvAjgs = mview$AdvAjgs;
       this.mview$AdvInfos = mview$AdvInfos;
       this.mview$AdvCliques = mview$AdvCliques;
       this.mview$AdvFilterinstances = mview$AdvFilterinstances;
       this.mview$AdvLevels = mview$AdvLevels;
       this.mview$AdvJournals = mview$AdvJournals;
    }
   
    public BigDecimal getRunid#() {
        return this.runid#;
    }
    
    public void setRunid#(BigDecimal runid#) {
        this.runid# = runid#;
    }
    public BigDecimal getFilterid#() {
        return this.filterid#;
    }
    
    public void setFilterid#(BigDecimal filterid#) {
        this.filterid# = filterid#;
    }
    public Date getRunBegin() {
        return this.runBegin;
    }
    
    public void setRunBegin(Date runBegin) {
        this.runBegin = runBegin;
    }
    public Date getRunEnd() {
        return this.runEnd;
    }
    
    public void setRunEnd(Date runEnd) {
        this.runEnd = runEnd;
    }
    public BigDecimal getRunType() {
        return this.runType;
    }
    
    public void setRunType(BigDecimal runType) {
        this.runType = runType;
    }
    public String getUname() {
        return this.uname;
    }
    
    public void setUname(String uname) {
        this.uname = uname;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    public BigDecimal getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(BigDecimal completed) {
        this.completed = completed;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public Set getMview$AdvExceptionses() {
        return this.mview$AdvExceptionses;
    }
    
    public void setMview$AdvExceptionses(Set mview$AdvExceptionses) {
        this.mview$AdvExceptionses = mview$AdvExceptionses;
    }
    public Set getMview$AdvEligibles() {
        return this.mview$AdvEligibles;
    }
    
    public void setMview$AdvEligibles(Set mview$AdvEligibles) {
        this.mview$AdvEligibles = mview$AdvEligibles;
    }
    public Set getMview$AdvOutputs() {
        return this.mview$AdvOutputs;
    }
    
    public void setMview$AdvOutputs(Set mview$AdvOutputs) {
        this.mview$AdvOutputs = mview$AdvOutputs;
    }
    public Set getMview$AdvRollups() {
        return this.mview$AdvRollups;
    }
    
    public void setMview$AdvRollups(Set mview$AdvRollups) {
        this.mview$AdvRollups = mview$AdvRollups;
    }
    public Set getMview$AdvAjgs() {
        return this.mview$AdvAjgs;
    }
    
    public void setMview$AdvAjgs(Set mview$AdvAjgs) {
        this.mview$AdvAjgs = mview$AdvAjgs;
    }
    public Set getMview$AdvInfos() {
        return this.mview$AdvInfos;
    }
    
    public void setMview$AdvInfos(Set mview$AdvInfos) {
        this.mview$AdvInfos = mview$AdvInfos;
    }
    public Set getMview$AdvCliques() {
        return this.mview$AdvCliques;
    }
    
    public void setMview$AdvCliques(Set mview$AdvCliques) {
        this.mview$AdvCliques = mview$AdvCliques;
    }
    public Set getMview$AdvFilterinstances() {
        return this.mview$AdvFilterinstances;
    }
    
    public void setMview$AdvFilterinstances(Set mview$AdvFilterinstances) {
        this.mview$AdvFilterinstances = mview$AdvFilterinstances;
    }
    public Set getMview$AdvLevels() {
        return this.mview$AdvLevels;
    }
    
    public void setMview$AdvLevels(Set mview$AdvLevels) {
        this.mview$AdvLevels = mview$AdvLevels;
    }
    public Set getMview$AdvJournals() {
        return this.mview$AdvJournals;
    }
    
    public void setMview$AdvJournals(Set mview$AdvJournals) {
        this.mview$AdvJournals = mview$AdvJournals;
    }




}

