package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrIndcompart.Id generated by hbm2java
 */
public class LogmnrIndcompart.Id  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal obj#;

    public LogmnrIndcompart.Id() {
    }

    public LogmnrIndcompart.Id(BigDecimal logmnrUid, BigDecimal obj#) {
       this.logmnrUid = logmnrUid;
       this.obj# = obj#;
    }
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public BigDecimal getObj#() {
        return this.obj#;
    }
    
    public void setObj#(BigDecimal obj#) {
        this.obj# = obj#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrIndcompart.Id) ) return false;
		 LogmnrIndcompart.Id castOther = ( LogmnrIndcompart.Id ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getObj#()==castOther.getObj#()) || ( this.getObj#()!=null && castOther.getObj#()!=null && this.getObj#().equals(castOther.getObj#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getObj#() == null ? 0 : this.getObj#().hashCode() );
         return result;
   }   


}


