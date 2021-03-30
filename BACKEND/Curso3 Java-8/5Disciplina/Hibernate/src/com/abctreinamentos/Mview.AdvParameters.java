package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Mview.AdvParameters generated by hbm2java
 */
public class Mview.AdvParameters  implements java.io.Serializable {


     private String parameterName;
     private BigDecimal parameterType;
     private String stringValue;
     private Date dateValue;
     private BigDecimal numericalValue;

    public Mview.AdvParameters() {
    }

	
    public Mview.AdvParameters(String parameterName, BigDecimal parameterType) {
        this.parameterName = parameterName;
        this.parameterType = parameterType;
    }
    public Mview.AdvParameters(String parameterName, BigDecimal parameterType, String stringValue, Date dateValue, BigDecimal numericalValue) {
       this.parameterName = parameterName;
       this.parameterType = parameterType;
       this.stringValue = stringValue;
       this.dateValue = dateValue;
       this.numericalValue = numericalValue;
    }
   
    public String getParameterName() {
        return this.parameterName;
    }
    
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }
    public BigDecimal getParameterType() {
        return this.parameterType;
    }
    
    public void setParameterType(BigDecimal parameterType) {
        this.parameterType = parameterType;
    }
    public String getStringValue() {
        return this.stringValue;
    }
    
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    public Date getDateValue() {
        return this.dateValue;
    }
    
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }
    public BigDecimal getNumericalValue() {
        return this.numericalValue;
    }
    
    public void setNumericalValue(BigDecimal numericalValue) {
        this.numericalValue = numericalValue;
    }




}


