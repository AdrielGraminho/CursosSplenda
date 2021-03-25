package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Logstdby.applyMilestoneId generated by hbm2java
 */
public class Logstdby.applyMilestoneId  implements java.io.Serializable {


     private BigDecimal sessionId;
     private BigDecimal commitScn;
     private Date commitTime;
     private BigDecimal synchScn;
     private BigDecimal epoch;
     private BigDecimal processedScn;
     private Date processedTime;
     private BigDecimal fetchlwmScn;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;
     private BigDecimal flags;
     private Date lwmUpdTime;
     private BigDecimal spare4;
     private BigDecimal spare5;
     private BigDecimal spare6;
     private Date spare7;
     private BigDecimal ptoRecoveryScn;
     private BigDecimal ptoRecoveryIncarnation;

    public Logstdby.applyMilestoneId() {
    }

	
    public Logstdby.applyMilestoneId(BigDecimal sessionId, BigDecimal commitScn, BigDecimal synchScn, BigDecimal epoch, BigDecimal processedScn, BigDecimal fetchlwmScn) {
        this.sessionId = sessionId;
        this.commitScn = commitScn;
        this.synchScn = synchScn;
        this.epoch = epoch;
        this.processedScn = processedScn;
        this.fetchlwmScn = fetchlwmScn;
    }
    public Logstdby.applyMilestoneId(BigDecimal sessionId, BigDecimal commitScn, Date commitTime, BigDecimal synchScn, BigDecimal epoch, BigDecimal processedScn, Date processedTime, BigDecimal fetchlwmScn, BigDecimal spare1, BigDecimal spare2, String spare3, BigDecimal flags, Date lwmUpdTime, BigDecimal spare4, BigDecimal spare5, BigDecimal spare6, Date spare7, BigDecimal ptoRecoveryScn, BigDecimal ptoRecoveryIncarnation) {
       this.sessionId = sessionId;
       this.commitScn = commitScn;
       this.commitTime = commitTime;
       this.synchScn = synchScn;
       this.epoch = epoch;
       this.processedScn = processedScn;
       this.processedTime = processedTime;
       this.fetchlwmScn = fetchlwmScn;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.flags = flags;
       this.lwmUpdTime = lwmUpdTime;
       this.spare4 = spare4;
       this.spare5 = spare5;
       this.spare6 = spare6;
       this.spare7 = spare7;
       this.ptoRecoveryScn = ptoRecoveryScn;
       this.ptoRecoveryIncarnation = ptoRecoveryIncarnation;
    }
   
    public BigDecimal getSessionId() {
        return this.sessionId;
    }
    
    public void setSessionId(BigDecimal sessionId) {
        this.sessionId = sessionId;
    }
    public BigDecimal getCommitScn() {
        return this.commitScn;
    }
    
    public void setCommitScn(BigDecimal commitScn) {
        this.commitScn = commitScn;
    }
    public Date getCommitTime() {
        return this.commitTime;
    }
    
    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }
    public BigDecimal getSynchScn() {
        return this.synchScn;
    }
    
    public void setSynchScn(BigDecimal synchScn) {
        this.synchScn = synchScn;
    }
    public BigDecimal getEpoch() {
        return this.epoch;
    }
    
    public void setEpoch(BigDecimal epoch) {
        this.epoch = epoch;
    }
    public BigDecimal getProcessedScn() {
        return this.processedScn;
    }
    
    public void setProcessedScn(BigDecimal processedScn) {
        this.processedScn = processedScn;
    }
    public Date getProcessedTime() {
        return this.processedTime;
    }
    
    public void setProcessedTime(Date processedTime) {
        this.processedTime = processedTime;
    }
    public BigDecimal getFetchlwmScn() {
        return this.fetchlwmScn;
    }
    
    public void setFetchlwmScn(BigDecimal fetchlwmScn) {
        this.fetchlwmScn = fetchlwmScn;
    }
    public BigDecimal getSpare1() {
        return this.spare1;
    }
    
    public void setSpare1(BigDecimal spare1) {
        this.spare1 = spare1;
    }
    public BigDecimal getSpare2() {
        return this.spare2;
    }
    
    public void setSpare2(BigDecimal spare2) {
        this.spare2 = spare2;
    }
    public String getSpare3() {
        return this.spare3;
    }
    
    public void setSpare3(String spare3) {
        this.spare3 = spare3;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public Date getLwmUpdTime() {
        return this.lwmUpdTime;
    }
    
    public void setLwmUpdTime(Date lwmUpdTime) {
        this.lwmUpdTime = lwmUpdTime;
    }
    public BigDecimal getSpare4() {
        return this.spare4;
    }
    
    public void setSpare4(BigDecimal spare4) {
        this.spare4 = spare4;
    }
    public BigDecimal getSpare5() {
        return this.spare5;
    }
    
    public void setSpare5(BigDecimal spare5) {
        this.spare5 = spare5;
    }
    public BigDecimal getSpare6() {
        return this.spare6;
    }
    
    public void setSpare6(BigDecimal spare6) {
        this.spare6 = spare6;
    }
    public Date getSpare7() {
        return this.spare7;
    }
    
    public void setSpare7(Date spare7) {
        this.spare7 = spare7;
    }
    public BigDecimal getPtoRecoveryScn() {
        return this.ptoRecoveryScn;
    }
    
    public void setPtoRecoveryScn(BigDecimal ptoRecoveryScn) {
        this.ptoRecoveryScn = ptoRecoveryScn;
    }
    public BigDecimal getPtoRecoveryIncarnation() {
        return this.ptoRecoveryIncarnation;
    }
    
    public void setPtoRecoveryIncarnation(BigDecimal ptoRecoveryIncarnation) {
        this.ptoRecoveryIncarnation = ptoRecoveryIncarnation;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Logstdby.applyMilestoneId) ) return false;
		 Logstdby.applyMilestoneId castOther = ( Logstdby.applyMilestoneId ) other; 
         
		 return ( (this.getSessionId()==castOther.getSessionId()) || ( this.getSessionId()!=null && castOther.getSessionId()!=null && this.getSessionId().equals(castOther.getSessionId()) ) )
 && ( (this.getCommitScn()==castOther.getCommitScn()) || ( this.getCommitScn()!=null && castOther.getCommitScn()!=null && this.getCommitScn().equals(castOther.getCommitScn()) ) )
 && ( (this.getCommitTime()==castOther.getCommitTime()) || ( this.getCommitTime()!=null && castOther.getCommitTime()!=null && this.getCommitTime().equals(castOther.getCommitTime()) ) )
 && ( (this.getSynchScn()==castOther.getSynchScn()) || ( this.getSynchScn()!=null && castOther.getSynchScn()!=null && this.getSynchScn().equals(castOther.getSynchScn()) ) )
 && ( (this.getEpoch()==castOther.getEpoch()) || ( this.getEpoch()!=null && castOther.getEpoch()!=null && this.getEpoch().equals(castOther.getEpoch()) ) )
 && ( (this.getProcessedScn()==castOther.getProcessedScn()) || ( this.getProcessedScn()!=null && castOther.getProcessedScn()!=null && this.getProcessedScn().equals(castOther.getProcessedScn()) ) )
 && ( (this.getProcessedTime()==castOther.getProcessedTime()) || ( this.getProcessedTime()!=null && castOther.getProcessedTime()!=null && this.getProcessedTime().equals(castOther.getProcessedTime()) ) )
 && ( (this.getFetchlwmScn()==castOther.getFetchlwmScn()) || ( this.getFetchlwmScn()!=null && castOther.getFetchlwmScn()!=null && this.getFetchlwmScn().equals(castOther.getFetchlwmScn()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) )
 && ( (this.getFlags()==castOther.getFlags()) || ( this.getFlags()!=null && castOther.getFlags()!=null && this.getFlags().equals(castOther.getFlags()) ) )
 && ( (this.getLwmUpdTime()==castOther.getLwmUpdTime()) || ( this.getLwmUpdTime()!=null && castOther.getLwmUpdTime()!=null && this.getLwmUpdTime().equals(castOther.getLwmUpdTime()) ) )
 && ( (this.getSpare4()==castOther.getSpare4()) || ( this.getSpare4()!=null && castOther.getSpare4()!=null && this.getSpare4().equals(castOther.getSpare4()) ) )
 && ( (this.getSpare5()==castOther.getSpare5()) || ( this.getSpare5()!=null && castOther.getSpare5()!=null && this.getSpare5().equals(castOther.getSpare5()) ) )
 && ( (this.getSpare6()==castOther.getSpare6()) || ( this.getSpare6()!=null && castOther.getSpare6()!=null && this.getSpare6().equals(castOther.getSpare6()) ) )
 && ( (this.getSpare7()==castOther.getSpare7()) || ( this.getSpare7()!=null && castOther.getSpare7()!=null && this.getSpare7().equals(castOther.getSpare7()) ) )
 && ( (this.getPtoRecoveryScn()==castOther.getPtoRecoveryScn()) || ( this.getPtoRecoveryScn()!=null && castOther.getPtoRecoveryScn()!=null && this.getPtoRecoveryScn().equals(castOther.getPtoRecoveryScn()) ) )
 && ( (this.getPtoRecoveryIncarnation()==castOther.getPtoRecoveryIncarnation()) || ( this.getPtoRecoveryIncarnation()!=null && castOther.getPtoRecoveryIncarnation()!=null && this.getPtoRecoveryIncarnation().equals(castOther.getPtoRecoveryIncarnation()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSessionId() == null ? 0 : this.getSessionId().hashCode() );
         result = 37 * result + ( getCommitScn() == null ? 0 : this.getCommitScn().hashCode() );
         result = 37 * result + ( getCommitTime() == null ? 0 : this.getCommitTime().hashCode() );
         result = 37 * result + ( getSynchScn() == null ? 0 : this.getSynchScn().hashCode() );
         result = 37 * result + ( getEpoch() == null ? 0 : this.getEpoch().hashCode() );
         result = 37 * result + ( getProcessedScn() == null ? 0 : this.getProcessedScn().hashCode() );
         result = 37 * result + ( getProcessedTime() == null ? 0 : this.getProcessedTime().hashCode() );
         result = 37 * result + ( getFetchlwmScn() == null ? 0 : this.getFetchlwmScn().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         result = 37 * result + ( getFlags() == null ? 0 : this.getFlags().hashCode() );
         result = 37 * result + ( getLwmUpdTime() == null ? 0 : this.getLwmUpdTime().hashCode() );
         result = 37 * result + ( getSpare4() == null ? 0 : this.getSpare4().hashCode() );
         result = 37 * result + ( getSpare5() == null ? 0 : this.getSpare5().hashCode() );
         result = 37 * result + ( getSpare6() == null ? 0 : this.getSpare6().hashCode() );
         result = 37 * result + ( getSpare7() == null ? 0 : this.getSpare7().hashCode() );
         result = 37 * result + ( getPtoRecoveryScn() == null ? 0 : this.getPtoRecoveryScn().hashCode() );
         result = 37 * result + ( getPtoRecoveryIncarnation() == null ? 0 : this.getPtoRecoveryIncarnation().hashCode() );
         return result;
   }   


}

