package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrNtab.Id generated by hbm2java
 */
public class LogmnrNtab.Id  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private BigDecimal obj#;
     private BigDecimal intcol#;

    public LogmnrNtab.Id() {
    }

	
    public LogmnrNtab.Id(BigDecimal obj#) {
        this.obj# = obj#;
    }
    public LogmnrNtab.Id(BigDecimal logmnrUid, BigDecimal obj#, BigDecimal intcol#) {
       this.logmnrUid = logmnrUid;
       this.obj# = obj#;
       this.intcol# = intcol#;
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
    public BigDecimal getIntcol#() {
        return this.intcol#;
    }
    
    public void setIntcol#(BigDecimal intcol#) {
        this.intcol# = intcol#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrNtab.Id) ) return false;
		 LogmnrNtab.Id castOther = ( LogmnrNtab.Id ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getObj#()==castOther.getObj#()) || ( this.getObj#()!=null && castOther.getObj#()!=null && this.getObj#().equals(castOther.getObj#()) ) )
 && ( (this.getIntcol#()==castOther.getIntcol#()) || ( this.getIntcol#()!=null && castOther.getIntcol#()!=null && this.getIntcol#().equals(castOther.getIntcol#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getObj#() == null ? 0 : this.getObj#().hashCode() );
         result = 37 * result + ( getIntcol#() == null ? 0 : this.getIntcol#().hashCode() );
         return result;
   }   


}


