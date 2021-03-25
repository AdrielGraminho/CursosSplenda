package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * LogmnrError.Id generated by hbm2java
 */
public class LogmnrError.Id  implements java.io.Serializable {


     private BigDecimal session#;
     private Date timeOfError;
     private BigDecimal code;
     private String message;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private BigDecimal spare3;
     private String spare4;
     private String spare5;

    public LogmnrError.Id() {
    }

    public LogmnrError.Id(BigDecimal session#, Date timeOfError, BigDecimal code, String message, BigDecimal spare1, BigDecimal spare2, BigDecimal spare3, String spare4, String spare5) {
       this.session# = session#;
       this.timeOfError = timeOfError;
       this.code = code;
       this.message = message;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.spare4 = spare4;
       this.spare5 = spare5;
    }
   
    public BigDecimal getSession#() {
        return this.session#;
    }
    
    public void setSession#(BigDecimal session#) {
        this.session# = session#;
    }
    public Date getTimeOfError() {
        return this.timeOfError;
    }
    
    public void setTimeOfError(Date timeOfError) {
        this.timeOfError = timeOfError;
    }
    public BigDecimal getCode() {
        return this.code;
    }
    
    public void setCode(BigDecimal code) {
        this.code = code;
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
    public BigDecimal getSpare3() {
        return this.spare3;
    }
    
    public void setSpare3(BigDecimal spare3) {
        this.spare3 = spare3;
    }
    public String getSpare4() {
        return this.spare4;
    }
    
    public void setSpare4(String spare4) {
        this.spare4 = spare4;
    }
    public String getSpare5() {
        return this.spare5;
    }
    
    public void setSpare5(String spare5) {
        this.spare5 = spare5;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrError.Id) ) return false;
		 LogmnrError.Id castOther = ( LogmnrError.Id ) other; 
         
		 return ( (this.getSession#()==castOther.getSession#()) || ( this.getSession#()!=null && castOther.getSession#()!=null && this.getSession#().equals(castOther.getSession#()) ) )
 && ( (this.getTimeOfError()==castOther.getTimeOfError()) || ( this.getTimeOfError()!=null && castOther.getTimeOfError()!=null && this.getTimeOfError().equals(castOther.getTimeOfError()) ) )
 && ( (this.getCode()==castOther.getCode()) || ( this.getCode()!=null && castOther.getCode()!=null && this.getCode().equals(castOther.getCode()) ) )
 && ( (this.getMessage()==castOther.getMessage()) || ( this.getMessage()!=null && castOther.getMessage()!=null && this.getMessage().equals(castOther.getMessage()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) )
 && ( (this.getSpare4()==castOther.getSpare4()) || ( this.getSpare4()!=null && castOther.getSpare4()!=null && this.getSpare4().equals(castOther.getSpare4()) ) )
 && ( (this.getSpare5()==castOther.getSpare5()) || ( this.getSpare5()!=null && castOther.getSpare5()!=null && this.getSpare5().equals(castOther.getSpare5()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSession#() == null ? 0 : this.getSession#().hashCode() );
         result = 37 * result + ( getTimeOfError() == null ? 0 : this.getTimeOfError().hashCode() );
         result = 37 * result + ( getCode() == null ? 0 : this.getCode().hashCode() );
         result = 37 * result + ( getMessage() == null ? 0 : this.getMessage().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         result = 37 * result + ( getSpare4() == null ? 0 : this.getSpare4().hashCode() );
         result = 37 * result + ( getSpare5() == null ? 0 : this.getSpare5().hashCode() );
         return result;
   }   


}

