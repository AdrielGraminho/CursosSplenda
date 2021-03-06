package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Rolling.eventsId generated by hbm2java
 */
public class Rolling.eventsId  implements java.io.Serializable {


     private BigDecimal eventid;
     private BigDecimal instid;
     private BigDecimal revision;
     private Serializable eventTime;
     private String type;
     private BigDecimal status;
     private String message;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;

    public Rolling.eventsId() {
    }

    public Rolling.eventsId(BigDecimal eventid, BigDecimal instid, BigDecimal revision, Serializable eventTime, String type, BigDecimal status, String message, BigDecimal spare1, BigDecimal spare2, String spare3) {
       this.eventid = eventid;
       this.instid = instid;
       this.revision = revision;
       this.eventTime = eventTime;
       this.type = type;
       this.status = status;
       this.message = message;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
    }
   
    public BigDecimal getEventid() {
        return this.eventid;
    }
    
    public void setEventid(BigDecimal eventid) {
        this.eventid = eventid;
    }
    public BigDecimal getInstid() {
        return this.instid;
    }
    
    public void setInstid(BigDecimal instid) {
        this.instid = instid;
    }
    public BigDecimal getRevision() {
        return this.revision;
    }
    
    public void setRevision(BigDecimal revision) {
        this.revision = revision;
    }
    public Serializable getEventTime() {
        return this.eventTime;
    }
    
    public void setEventTime(Serializable eventTime) {
        this.eventTime = eventTime;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public BigDecimal getStatus() {
        return this.status;
    }
    
    public void setStatus(BigDecimal status) {
        this.status = status;
    }
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Rolling.eventsId) ) return false;
		 Rolling.eventsId castOther = ( Rolling.eventsId ) other; 
         
		 return ( (this.getEventid()==castOther.getEventid()) || ( this.getEventid()!=null && castOther.getEventid()!=null && this.getEventid().equals(castOther.getEventid()) ) )
 && ( (this.getInstid()==castOther.getInstid()) || ( this.getInstid()!=null && castOther.getInstid()!=null && this.getInstid().equals(castOther.getInstid()) ) )
 && ( (this.getRevision()==castOther.getRevision()) || ( this.getRevision()!=null && castOther.getRevision()!=null && this.getRevision().equals(castOther.getRevision()) ) )
 && ( (this.getEventTime()==castOther.getEventTime()) || ( this.getEventTime()!=null && castOther.getEventTime()!=null && this.getEventTime().equals(castOther.getEventTime()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getMessage()==castOther.getMessage()) || ( this.getMessage()!=null && castOther.getMessage()!=null && this.getMessage().equals(castOther.getMessage()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEventid() == null ? 0 : this.getEventid().hashCode() );
         result = 37 * result + ( getInstid() == null ? 0 : this.getInstid().hashCode() );
         result = 37 * result + ( getRevision() == null ? 0 : this.getRevision().hashCode() );
         result = 37 * result + ( getEventTime() == null ? 0 : this.getEventTime().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         result = 37 * result + ( getStatus() == null ? 0 : this.getStatus().hashCode() );
         result = 37 * result + ( getMessage() == null ? 0 : this.getMessage().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         return result;
   }   


}


