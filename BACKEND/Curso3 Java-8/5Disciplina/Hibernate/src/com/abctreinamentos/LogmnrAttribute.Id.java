package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Arrays;

/**
 * LogmnrAttribute.Id generated by hbm2java
 */
public class LogmnrAttribute.Id  implements java.io.Serializable {


     private BigDecimal logmnrUid;
     private byte[] toid;
     private BigDecimal version#;
     private BigDecimal attribute#;

    public LogmnrAttribute.Id() {
    }

	
    public LogmnrAttribute.Id(byte[] toid) {
        this.toid = toid;
    }
    public LogmnrAttribute.Id(BigDecimal logmnrUid, byte[] toid, BigDecimal version#, BigDecimal attribute#) {
       this.logmnrUid = logmnrUid;
       this.toid = toid;
       this.version# = version#;
       this.attribute# = attribute#;
    }
   
    public BigDecimal getLogmnrUid() {
        return this.logmnrUid;
    }
    
    public void setLogmnrUid(BigDecimal logmnrUid) {
        this.logmnrUid = logmnrUid;
    }
    public byte[] getToid() {
        return this.toid;
    }
    
    public void setToid(byte[] toid) {
        this.toid = toid;
    }
    public BigDecimal getVersion#() {
        return this.version#;
    }
    
    public void setVersion#(BigDecimal version#) {
        this.version# = version#;
    }
    public BigDecimal getAttribute#() {
        return this.attribute#;
    }
    
    public void setAttribute#(BigDecimal attribute#) {
        this.attribute# = attribute#;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrAttribute.Id) ) return false;
		 LogmnrAttribute.Id castOther = ( LogmnrAttribute.Id ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getToid()==castOther.getToid()) || ( this.getToid()!=null && castOther.getToid()!=null && Arrays.equals(this.getToid(), castOther.getToid()) ) )
 && ( (this.getVersion#()==castOther.getVersion#()) || ( this.getVersion#()!=null && castOther.getVersion#()!=null && this.getVersion#().equals(castOther.getVersion#()) ) )
 && ( (this.getAttribute#()==castOther.getAttribute#()) || ( this.getAttribute#()!=null && castOther.getAttribute#()!=null && this.getAttribute#().equals(castOther.getAttribute#()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         int toidHashcode = 0;
         byte[] toidProperty = this.getToid();
         if(toidProperty != null) {
             toidHashcode = 1;
             for (int i=0; i<toidProperty.length; i++) {
                 toidHashcode = 37 * toidHashcode + toidProperty[i];
             }
         }

         result = 37 * result + toidHashcode;

         result = 37 * result + ( getVersion#() == null ? 0 : this.getVersion#().hashCode() );
         result = 37 * result + ( getAttribute#() == null ? 0 : this.getAttribute#().hashCode() );
         return result;
   }   


}


