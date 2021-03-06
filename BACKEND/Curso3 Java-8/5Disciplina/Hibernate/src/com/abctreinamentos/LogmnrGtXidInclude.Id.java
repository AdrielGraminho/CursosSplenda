package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrGtXidInclude.Id generated by hbm2java
 */
public class LogmnrGtXidInclude.Id  implements java.io.Serializable {


     private BigDecimal xidusn;
     private BigDecimal xidslt;
     private BigDecimal xidsqn;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;
     private BigDecimal pdbid;
     private String pdbName;

    public LogmnrGtXidInclude.Id() {
    }

    public LogmnrGtXidInclude.Id(BigDecimal xidusn, BigDecimal xidslt, BigDecimal xidsqn, BigDecimal spare1, BigDecimal spare2, String spare3, BigDecimal pdbid, String pdbName) {
       this.xidusn = xidusn;
       this.xidslt = xidslt;
       this.xidsqn = xidsqn;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.pdbid = pdbid;
       this.pdbName = pdbName;
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
    public BigDecimal getPdbid() {
        return this.pdbid;
    }
    
    public void setPdbid(BigDecimal pdbid) {
        this.pdbid = pdbid;
    }
    public String getPdbName() {
        return this.pdbName;
    }
    
    public void setPdbName(String pdbName) {
        this.pdbName = pdbName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrGtXidInclude.Id) ) return false;
		 LogmnrGtXidInclude.Id castOther = ( LogmnrGtXidInclude.Id ) other; 
         
		 return ( (this.getXidusn()==castOther.getXidusn()) || ( this.getXidusn()!=null && castOther.getXidusn()!=null && this.getXidusn().equals(castOther.getXidusn()) ) )
 && ( (this.getXidslt()==castOther.getXidslt()) || ( this.getXidslt()!=null && castOther.getXidslt()!=null && this.getXidslt().equals(castOther.getXidslt()) ) )
 && ( (this.getXidsqn()==castOther.getXidsqn()) || ( this.getXidsqn()!=null && castOther.getXidsqn()!=null && this.getXidsqn().equals(castOther.getXidsqn()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) )
 && ( (this.getPdbid()==castOther.getPdbid()) || ( this.getPdbid()!=null && castOther.getPdbid()!=null && this.getPdbid().equals(castOther.getPdbid()) ) )
 && ( (this.getPdbName()==castOther.getPdbName()) || ( this.getPdbName()!=null && castOther.getPdbName()!=null && this.getPdbName().equals(castOther.getPdbName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getXidusn() == null ? 0 : this.getXidusn().hashCode() );
         result = 37 * result + ( getXidslt() == null ? 0 : this.getXidslt().hashCode() );
         result = 37 * result + ( getXidsqn() == null ? 0 : this.getXidsqn().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         result = 37 * result + ( getPdbid() == null ? 0 : this.getPdbid().hashCode() );
         result = 37 * result + ( getPdbName() == null ? 0 : this.getPdbName().hashCode() );
         return result;
   }   


}


