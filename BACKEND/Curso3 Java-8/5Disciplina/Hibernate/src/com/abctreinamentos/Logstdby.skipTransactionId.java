package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Logstdby.skipTransactionId generated by hbm2java
 */
public class Logstdby.skipTransactionId  implements java.io.Serializable {


     private BigDecimal xidusn;
     private BigDecimal xidslt;
     private BigDecimal xidsqn;
     private BigDecimal active;
     private BigDecimal commitScn;
     private BigDecimal spare2;
     private String spare3;
     private String conName;

    public Logstdby.skipTransactionId() {
    }

    public Logstdby.skipTransactionId(BigDecimal xidusn, BigDecimal xidslt, BigDecimal xidsqn, BigDecimal active, BigDecimal commitScn, BigDecimal spare2, String spare3, String conName) {
       this.xidusn = xidusn;
       this.xidslt = xidslt;
       this.xidsqn = xidsqn;
       this.active = active;
       this.commitScn = commitScn;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.conName = conName;
    }
   
    public BigDecimal getXidusn() {
        return this.xidusn;
    }
    
    public void setXidusn(BigDecimal xidusn) {
        this.xidusn = xidusn;
    }
    public BigDecimal getXidslt() {
        return this.xidslt;
    }
    
    public void setXidslt(BigDecimal xidslt) {
        this.xidslt = xidslt;
    }
    public BigDecimal getXidsqn() {
        return this.xidsqn;
    }
    
    public void setXidsqn(BigDecimal xidsqn) {
        this.xidsqn = xidsqn;
    }
    public BigDecimal getActive() {
        return this.active;
    }
    
    public void setActive(BigDecimal active) {
        this.active = active;
    }
    public BigDecimal getCommitScn() {
        return this.commitScn;
    }
    
    public void setCommitScn(BigDecimal commitScn) {
        this.commitScn = commitScn;
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
    public String getConName() {
        return this.conName;
    }
    
    public void setConName(String conName) {
        this.conName = conName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Logstdby.skipTransactionId) ) return false;
		 Logstdby.skipTransactionId castOther = ( Logstdby.skipTransactionId ) other; 
         
		 return ( (this.getXidusn()==castOther.getXidusn()) || ( this.getXidusn()!=null && castOther.getXidusn()!=null && this.getXidusn().equals(castOther.getXidusn()) ) )
 && ( (this.getXidslt()==castOther.getXidslt()) || ( this.getXidslt()!=null && castOther.getXidslt()!=null && this.getXidslt().equals(castOther.getXidslt()) ) )
 && ( (this.getXidsqn()==castOther.getXidsqn()) || ( this.getXidsqn()!=null && castOther.getXidsqn()!=null && this.getXidsqn().equals(castOther.getXidsqn()) ) )
 && ( (this.getActive()==castOther.getActive()) || ( this.getActive()!=null && castOther.getActive()!=null && this.getActive().equals(castOther.getActive()) ) )
 && ( (this.getCommitScn()==castOther.getCommitScn()) || ( this.getCommitScn()!=null && castOther.getCommitScn()!=null && this.getCommitScn().equals(castOther.getCommitScn()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) )
 && ( (this.getConName()==castOther.getConName()) || ( this.getConName()!=null && castOther.getConName()!=null && this.getConName().equals(castOther.getConName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getXidusn() == null ? 0 : this.getXidusn().hashCode() );
         result = 37 * result + ( getXidslt() == null ? 0 : this.getXidslt().hashCode() );
         result = 37 * result + ( getXidsqn() == null ? 0 : this.getXidsqn().hashCode() );
         result = 37 * result + ( getActive() == null ? 0 : this.getActive().hashCode() );
         result = 37 * result + ( getCommitScn() == null ? 0 : this.getCommitScn().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         result = 37 * result + ( getConName() == null ? 0 : this.getConName().hashCode() );
         return result;
   }   


}


