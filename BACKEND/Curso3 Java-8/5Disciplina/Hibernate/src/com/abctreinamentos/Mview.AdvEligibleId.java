package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mview.AdvEligibleId generated by hbm2java
 */
public class Mview.AdvEligibleId  implements java.io.Serializable {


     private BigDecimal sumobjn#;
     private BigDecimal runid#;

    public Mview.AdvEligibleId() {
    }

    public Mview.AdvEligibleId(BigDecimal sumobjn#, BigDecimal runid#) {
       this.sumobjn# = sumobjn#;
       this.runid# = runid#;
    }
   
    public BigDecimal getSumobjn#() {
        return this.sumobjn#;
    }
    
    public void setSumobjn#(BigDecimal sumobjn#) {
        this.sumobjn# = sumobjn#;
    }
    public BigDecimal getRunid#() {
        return this.runid#;
    }
    
    public void setRunid#(BigDecimal runid#) {
        this.runid# = runid#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvEligibleId) ) return false;
		 Mview.AdvEligibleId castOther = ( Mview.AdvEligibleId ) other; 
         
		 return ( (this.getSumobjn#()==castOther.getSumobjn#()) || ( this.getSumobjn#()!=null && castOther.getSumobjn#()!=null && this.getSumobjn#().equals(castOther.getSumobjn#()) ) )
 && ( (this.getRunid#()==castOther.getRunid#()) || ( this.getRunid#()!=null && castOther.getRunid#()!=null && this.getRunid#().equals(castOther.getRunid#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSumobjn#() == null ? 0 : this.getSumobjn#().hashCode() );
         result = 37 * result + ( getRunid#() == null ? 0 : this.getRunid#().hashCode() );
         return result;
   }   


}


