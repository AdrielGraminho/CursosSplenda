package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * LogmnrGtUserInclude.Id generated by hbm2java
 */
public class LogmnrGtUserInclude.Id  implements java.io.Serializable {


     private String userName;
     private BigDecimal userType;
     private String pdbName;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;

    public LogmnrGtUserInclude.Id() {
    }

    public LogmnrGtUserInclude.Id(String userName, BigDecimal userType, String pdbName, BigDecimal spare1, BigDecimal spare2, String spare3) {
       this.userName = userName;
       this.userType = userType;
       this.pdbName = pdbName;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
    }
   
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public BigDecimal getUserType() {
        return this.userType;
    }
    
    public void setUserType(BigDecimal userType) {
        this.userType = userType;
    }
    public String getPdbName() {
        return this.pdbName;
    }
    
    public void setPdbName(String pdbName) {
        this.pdbName = pdbName;
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
		 if ( !(other instanceof LogmnrGtUserInclude.Id) ) return false;
		 LogmnrGtUserInclude.Id castOther = ( LogmnrGtUserInclude.Id ) other; 
         
		 return ( (this.getUserName()==castOther.getUserName()) || ( this.getUserName()!=null && castOther.getUserName()!=null && this.getUserName().equals(castOther.getUserName()) ) )
 && ( (this.getUserType()==castOther.getUserType()) || ( this.getUserType()!=null && castOther.getUserType()!=null && this.getUserType().equals(castOther.getUserType()) ) )
 && ( (this.getPdbName()==castOther.getPdbName()) || ( this.getPdbName()!=null && castOther.getPdbName()!=null && this.getPdbName().equals(castOther.getPdbName()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUserName() == null ? 0 : this.getUserName().hashCode() );
         result = 37 * result + ( getUserType() == null ? 0 : this.getUserType().hashCode() );
         result = 37 * result + ( getPdbName() == null ? 0 : this.getPdbName().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         return result;
   }   


}


