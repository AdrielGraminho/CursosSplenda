package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mview.AdvOutputId generated by hbm2java
 */
public class Mview.AdvOutputId  implements java.io.Serializable {


     private BigDecimal runid#;
     private BigDecimal rank#;

    public Mview.AdvOutputId() {
    }

    public Mview.AdvOutputId(BigDecimal runid#, BigDecimal rank#) {
       this.runid# = runid#;
       this.rank# = rank#;
    }
   
    public BigDecimal getRunid#() {
        return this.runid#;
    }
    
    public void setRunid#(BigDecimal runid#) {
        this.runid# = runid#;
    }
    public BigDecimal getRank#() {
        return this.rank#;
    }
    
    public void setRank#(BigDecimal rank#) {
        this.rank# = rank#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvOutputId) ) return false;
		 Mview.AdvOutputId castOther = ( Mview.AdvOutputId ) other; 
         
		 return ( (this.getRunid#()==castOther.getRunid#()) || ( this.getRunid#()!=null && castOther.getRunid#()!=null && this.getRunid#().equals(castOther.getRunid#()) ) )
 && ( (this.getRank#()==castOther.getRank#()) || ( this.getRank#()!=null && castOther.getRank#()!=null && this.getRank#().equals(castOther.getRank#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRunid#() == null ? 0 : this.getRunid#().hashCode() );
         result = 37 * result + ( getRank#() == null ? 0 : this.getRank#().hashCode() );
         return result;
   }   


}


