package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrAgeSpill.Id generated by hbm2java
 */
public class LogmnrAgeSpill.Id  implements java.io.Serializable {


     private BigDecimal session#;
     private BigDecimal pdbid;
     private BigDecimal xidusn;
     private BigDecimal xidslt;
     private BigDecimal xidsqn;
     private BigDecimal chunk;
     private BigDecimal sequence#;

    public LogmnrAgeSpill.Id() {
    }

    public LogmnrAgeSpill.Id(BigDecimal session#, BigDecimal pdbid, BigDecimal xidusn, BigDecimal xidslt, BigDecimal xidsqn, BigDecimal chunk, BigDecimal sequence#) {
       this.session# = session#;
       this.pdbid = pdbid;
       this.xidusn = xidusn;
       this.xidslt = xidslt;
       this.xidsqn = xidsqn;
       this.chunk = chunk;
       this.sequence# = sequence#;
    }
   
    public BigDecimal getSession#() {
        return this.session#;
    }
    
    public void setSession#(BigDecimal session#) {
        this.session# = session#;
    }
    public BigDecimal getPdbid() {
        return this.pdbid;
    }
    
    public void setPdbid(BigDecimal pdbid) {
        this.pdbid = pdbid;
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
    public BigDecimal getChunk() {
        return this.chunk;
    }
    
    public void setChunk(BigDecimal chunk) {
        this.chunk = chunk;
    }
    public BigDecimal getSequence#() {
        return this.sequence#;
    }
    
    public void setSequence#(BigDecimal sequence#) {
        this.sequence# = sequence#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrAgeSpill.Id) ) return false;
		 LogmnrAgeSpill.Id castOther = ( LogmnrAgeSpill.Id ) other; 
         
		 return ( (this.getSession#()==castOther.getSession#()) || ( this.getSession#()!=null && castOther.getSession#()!=null && this.getSession#().equals(castOther.getSession#()) ) )
 && ( (this.getPdbid()==castOther.getPdbid()) || ( this.getPdbid()!=null && castOther.getPdbid()!=null && this.getPdbid().equals(castOther.getPdbid()) ) )
 && ( (this.getXidusn()==castOther.getXidusn()) || ( this.getXidusn()!=null && castOther.getXidusn()!=null && this.getXidusn().equals(castOther.getXidusn()) ) )
 && ( (this.getXidslt()==castOther.getXidslt()) || ( this.getXidslt()!=null && castOther.getXidslt()!=null && this.getXidslt().equals(castOther.getXidslt()) ) )
 && ( (this.getXidsqn()==castOther.getXidsqn()) || ( this.getXidsqn()!=null && castOther.getXidsqn()!=null && this.getXidsqn().equals(castOther.getXidsqn()) ) )
 && ( (this.getChunk()==castOther.getChunk()) || ( this.getChunk()!=null && castOther.getChunk()!=null && this.getChunk().equals(castOther.getChunk()) ) )
 && ( (this.getSequence#()==castOther.getSequence#()) || ( this.getSequence#()!=null && castOther.getSequence#()!=null && this.getSequence#().equals(castOther.getSequence#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSession#() == null ? 0 : this.getSession#().hashCode() );
         result = 37 * result + ( getPdbid() == null ? 0 : this.getPdbid().hashCode() );
         result = 37 * result + ( getXidusn() == null ? 0 : this.getXidusn().hashCode() );
         result = 37 * result + ( getXidslt() == null ? 0 : this.getXidslt().hashCode() );
         result = 37 * result + ( getXidsqn() == null ? 0 : this.getXidsqn().hashCode() );
         result = 37 * result + ( getChunk() == null ? 0 : this.getChunk().hashCode() );
         result = 37 * result + ( getSequence#() == null ? 0 : this.getSequence#().hashCode() );
         return result;
   }   


}

