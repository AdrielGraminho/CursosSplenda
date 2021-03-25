package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mview.AdvFilterinstanceId generated by hbm2java
 */
public class Mview.AdvFilterinstanceId  implements java.io.Serializable {


     private BigDecimal runid#;
     private BigDecimal filterid#;
     private BigDecimal subfilternum#;
     private BigDecimal subfiltertype;
     private String strValue;
     private BigDecimal numValue1;
     private BigDecimal numValue2;
     private Date dateValue1;
     private Date dateValue2;

    public Mview.AdvFilterinstanceId() {
    }

	
    public Mview.AdvFilterinstanceId(BigDecimal runid#) {
        this.runid# = runid#;
    }
    public Mview.AdvFilterinstanceId(BigDecimal runid#, BigDecimal filterid#, BigDecimal subfilternum#, BigDecimal subfiltertype, String strValue, BigDecimal numValue1, BigDecimal numValue2, Date dateValue1, Date dateValue2) {
       this.runid# = runid#;
       this.filterid# = filterid#;
       this.subfilternum# = subfilternum#;
       this.subfiltertype = subfiltertype;
       this.strValue = strValue;
       this.numValue1 = numValue1;
       this.numValue2 = numValue2;
       this.dateValue1 = dateValue1;
       this.dateValue2 = dateValue2;
    }
   
    public BigDecimal getRunid#() {
        return this.runid#;
    }
    
    public void setRunid#(BigDecimal runid#) {
        this.runid# = runid#;
    }
    public BigDecimal getFilterid#() {
        return this.filterid#;
    }
    
    public void setFilterid#(BigDecimal filterid#) {
        this.filterid# = filterid#;
    }
    public BigDecimal getSubfilternum#() {
        return this.subfilternum#;
    }
    
    public void setSubfilternum#(BigDecimal subfilternum#) {
        this.subfilternum# = subfilternum#;
    }
    public BigDecimal getSubfiltertype() {
        return this.subfiltertype;
    }
    
    public void setSubfiltertype(BigDecimal subfiltertype) {
        this.subfiltertype = subfiltertype;
    }
    public String getStrValue() {
        return this.strValue;
    }
    
    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }
    public BigDecimal getNumValue1() {
        return this.numValue1;
    }
    
    public void setNumValue1(BigDecimal numValue1) {
        this.numValue1 = numValue1;
    }
    public BigDecimal getNumValue2() {
        return this.numValue2;
    }
    
    public void setNumValue2(BigDecimal numValue2) {
        this.numValue2 = numValue2;
    }
    public Date getDateValue1() {
        return this.dateValue1;
    }
    
    public void setDateValue1(Date dateValue1) {
        this.dateValue1 = dateValue1;
    }
    public Date getDateValue2() {
        return this.dateValue2;
    }
    
    public void setDateValue2(Date dateValue2) {
        this.dateValue2 = dateValue2;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvFilterinstanceId) ) return false;
		 Mview.AdvFilterinstanceId castOther = ( Mview.AdvFilterinstanceId ) other; 
         
		 return ( (this.getRunid#()==castOther.getRunid#()) || ( this.getRunid#()!=null && castOther.getRunid#()!=null && this.getRunid#().equals(castOther.getRunid#()) ) )
 && ( (this.getFilterid#()==castOther.getFilterid#()) || ( this.getFilterid#()!=null && castOther.getFilterid#()!=null && this.getFilterid#().equals(castOther.getFilterid#()) ) )
 && ( (this.getSubfilternum#()==castOther.getSubfilternum#()) || ( this.getSubfilternum#()!=null && castOther.getSubfilternum#()!=null && this.getSubfilternum#().equals(castOther.getSubfilternum#()) ) )
 && ( (this.getSubfiltertype()==castOther.getSubfiltertype()) || ( this.getSubfiltertype()!=null && castOther.getSubfiltertype()!=null && this.getSubfiltertype().equals(castOther.getSubfiltertype()) ) )
 && ( (this.getStrValue()==castOther.getStrValue()) || ( this.getStrValue()!=null && castOther.getStrValue()!=null && this.getStrValue().equals(castOther.getStrValue()) ) )
 && ( (this.getNumValue1()==castOther.getNumValue1()) || ( this.getNumValue1()!=null && castOther.getNumValue1()!=null && this.getNumValue1().equals(castOther.getNumValue1()) ) )
 && ( (this.getNumValue2()==castOther.getNumValue2()) || ( this.getNumValue2()!=null && castOther.getNumValue2()!=null && this.getNumValue2().equals(castOther.getNumValue2()) ) )
 && ( (this.getDateValue1()==castOther.getDateValue1()) || ( this.getDateValue1()!=null && castOther.getDateValue1()!=null && this.getDateValue1().equals(castOther.getDateValue1()) ) )
 && ( (this.getDateValue2()==castOther.getDateValue2()) || ( this.getDateValue2()!=null && castOther.getDateValue2()!=null && this.getDateValue2().equals(castOther.getDateValue2()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRunid#() == null ? 0 : this.getRunid#().hashCode() );
         result = 37 * result + ( getFilterid#() == null ? 0 : this.getFilterid#().hashCode() );
         result = 37 * result + ( getSubfilternum#() == null ? 0 : this.getSubfilternum#().hashCode() );
         result = 37 * result + ( getSubfiltertype() == null ? 0 : this.getSubfiltertype().hashCode() );
         result = 37 * result + ( getStrValue() == null ? 0 : this.getStrValue().hashCode() );
         result = 37 * result + ( getNumValue1() == null ? 0 : this.getNumValue1().hashCode() );
         result = 37 * result + ( getNumValue2() == null ? 0 : this.getNumValue2().hashCode() );
         result = 37 * result + ( getDateValue1() == null ? 0 : this.getDateValue1().hashCode() );
         result = 37 * result + ( getDateValue2() == null ? 0 : this.getDateValue2().hashCode() );
         return result;
   }   


}

