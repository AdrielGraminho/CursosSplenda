package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mview.AdvLevelId generated by hbm2java
 */
public class Mview.AdvLevelId  implements java.io.Serializable {


     private BigDecimal runid#;
     private BigDecimal levelid#;

    public Mview.AdvLevelId() {
    }

    public Mview.AdvLevelId(BigDecimal runid#, BigDecimal levelid#) {
       this.runid# = runid#;
       this.levelid# = levelid#;
    }
   
    public BigDecimal getRunid#() {
        return this.runid#;
    }
    
    public void setRunid#(BigDecimal runid#) {
        this.runid# = runid#;
    }
    public BigDecimal getLevelid#() {
        return this.levelid#;
    }
    
    public void setLevelid#(BigDecimal levelid#) {
        this.levelid# = levelid#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvLevelId) ) return false;
		 Mview.AdvLevelId castOther = ( Mview.AdvLevelId ) other; 
         
		 return ( (this.getRunid#()==castOther.getRunid#()) || ( this.getRunid#()!=null && castOther.getRunid#()!=null && this.getRunid#().equals(castOther.getRunid#()) ) )
 && ( (this.getLevelid#()==castOther.getLevelid#()) || ( this.getLevelid#()!=null && castOther.getLevelid#()!=null && this.getLevelid#().equals(castOther.getLevelid#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRunid#() == null ? 0 : this.getRunid#().hashCode() );
         result = 37 * result + ( getLevelid#() == null ? 0 : this.getLevelid#().hashCode() );
         return result;
   }   


}

