package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.sql.Clob;

/**
 * Ol.hintsId generated by hbm2java
 */
public class Ol.hintsId  implements java.io.Serializable {


     private String olName;
     private BigDecimal hint#;
     private String category;
     private BigDecimal hintType;
     private String hintText;
     private BigDecimal stage#;
     private BigDecimal node#;
     private String tableName;
     private BigDecimal tableTin;
     private BigDecimal tablePos;
     private BigDecimal refId;
     private String userTableName;
     private Double cost;
     private Double cardinality;
     private Double bytes;
     private BigDecimal hintTextoff;
     private BigDecimal hintTextlen;
     private String joinPred;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private Clob hintString;

    public Ol.hintsId() {
    }

    public Ol.hintsId(String olName, BigDecimal hint#, String category, BigDecimal hintType, String hintText, BigDecimal stage#, BigDecimal node#, String tableName, BigDecimal tableTin, BigDecimal tablePos, BigDecimal refId, String userTableName, Double cost, Double cardinality, Double bytes, BigDecimal hintTextoff, BigDecimal hintTextlen, String joinPred, BigDecimal spare1, BigDecimal spare2, Clob hintString) {
       this.olName = olName;
       this.hint# = hint#;
       this.category = category;
       this.hintType = hintType;
       this.hintText = hintText;
       this.stage# = stage#;
       this.node# = node#;
       this.tableName = tableName;
       this.tableTin = tableTin;
       this.tablePos = tablePos;
       this.refId = refId;
       this.userTableName = userTableName;
       this.cost = cost;
       this.cardinality = cardinality;
       this.bytes = bytes;
       this.hintTextoff = hintTextoff;
       this.hintTextlen = hintTextlen;
       this.joinPred = joinPred;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.hintString = hintString;
    }
   
    public String getOlName() {
        return this.olName;
    }
    
    public void setOlName(String olName) {
        this.olName = olName;
    }
    public BigDecimal getHint#() {
        return this.hint#;
    }
    
    public void setHint#(BigDecimal hint#) {
        this.hint# = hint#;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public BigDecimal getHintType() {
        return this.hintType;
    }
    
    public void setHintType(BigDecimal hintType) {
        this.hintType = hintType;
    }
    public String getHintText() {
        return this.hintText;
    }
    
    public void setHintText(String hintText) {
        this.hintText = hintText;
    }
    public BigDecimal getStage#() {
        return this.stage#;
    }
    
    public void setStage#(BigDecimal stage#) {
        this.stage# = stage#;
    }
    public BigDecimal getNode#() {
        return this.node#;
    }
    
    public void setNode#(BigDecimal node#) {
        this.node# = node#;
    }
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public BigDecimal getTableTin() {
        return this.tableTin;
    }
    
    public void setTableTin(BigDecimal tableTin) {
        this.tableTin = tableTin;
    }
    public BigDecimal getTablePos() {
        return this.tablePos;
    }
    
    public void setTablePos(BigDecimal tablePos) {
        this.tablePos = tablePos;
    }
    public BigDecimal getRefId() {
        return this.refId;
    }
    
    public void setRefId(BigDecimal refId) {
        this.refId = refId;
    }
    public String getUserTableName() {
        return this.userTableName;
    }
    
    public void setUserTableName(String userTableName) {
        this.userTableName = userTableName;
    }
    public Double getCost() {
        return this.cost;
    }
    
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Double getCardinality() {
        return this.cardinality;
    }
    
    public void setCardinality(Double cardinality) {
        this.cardinality = cardinality;
    }
    public Double getBytes() {
        return this.bytes;
    }
    
    public void setBytes(Double bytes) {
        this.bytes = bytes;
    }
    public BigDecimal getHintTextoff() {
        return this.hintTextoff;
    }
    
    public void setHintTextoff(BigDecimal hintTextoff) {
        this.hintTextoff = hintTextoff;
    }
    public BigDecimal getHintTextlen() {
        return this.hintTextlen;
    }
    
    public void setHintTextlen(BigDecimal hintTextlen) {
        this.hintTextlen = hintTextlen;
    }
    public String getJoinPred() {
        return this.joinPred;
    }
    
    public void setJoinPred(String joinPred) {
        this.joinPred = joinPred;
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
    public Clob getHintString() {
        return this.hintString;
    }
    
    public void setHintString(Clob hintString) {
        this.hintString = hintString;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Ol.hintsId) ) return false;
		 Ol.hintsId castOther = ( Ol.hintsId ) other; 
         
		 return ( (this.getOlName()==castOther.getOlName()) || ( this.getOlName()!=null && castOther.getOlName()!=null && this.getOlName().equals(castOther.getOlName()) ) )
 && ( (this.getHint#()==castOther.getHint#()) || ( this.getHint#()!=null && castOther.getHint#()!=null && this.getHint#().equals(castOther.getHint#()) ) )
 && ( (this.getCategory()==castOther.getCategory()) || ( this.getCategory()!=null && castOther.getCategory()!=null && this.getCategory().equals(castOther.getCategory()) ) )
 && ( (this.getHintType()==castOther.getHintType()) || ( this.getHintType()!=null && castOther.getHintType()!=null && this.getHintType().equals(castOther.getHintType()) ) )
 && ( (this.getHintText()==castOther.getHintText()) || ( this.getHintText()!=null && castOther.getHintText()!=null && this.getHintText().equals(castOther.getHintText()) ) )
 && ( (this.getStage#()==castOther.getStage#()) || ( this.getStage#()!=null && castOther.getStage#()!=null && this.getStage#().equals(castOther.getStage#()) ) )
 && ( (this.getNode#()==castOther.getNode#()) || ( this.getNode#()!=null && castOther.getNode#()!=null && this.getNode#().equals(castOther.getNode#()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getTableTin()==castOther.getTableTin()) || ( this.getTableTin()!=null && castOther.getTableTin()!=null && this.getTableTin().equals(castOther.getTableTin()) ) )
 && ( (this.getTablePos()==castOther.getTablePos()) || ( this.getTablePos()!=null && castOther.getTablePos()!=null && this.getTablePos().equals(castOther.getTablePos()) ) )
 && ( (this.getRefId()==castOther.getRefId()) || ( this.getRefId()!=null && castOther.getRefId()!=null && this.getRefId().equals(castOther.getRefId()) ) )
 && ( (this.getUserTableName()==castOther.getUserTableName()) || ( this.getUserTableName()!=null && castOther.getUserTableName()!=null && this.getUserTableName().equals(castOther.getUserTableName()) ) )
 && ( (this.getCost()==castOther.getCost()) || ( this.getCost()!=null && castOther.getCost()!=null && this.getCost().equals(castOther.getCost()) ) )
 && ( (this.getCardinality()==castOther.getCardinality()) || ( this.getCardinality()!=null && castOther.getCardinality()!=null && this.getCardinality().equals(castOther.getCardinality()) ) )
 && ( (this.getBytes()==castOther.getBytes()) || ( this.getBytes()!=null && castOther.getBytes()!=null && this.getBytes().equals(castOther.getBytes()) ) )
 && ( (this.getHintTextoff()==castOther.getHintTextoff()) || ( this.getHintTextoff()!=null && castOther.getHintTextoff()!=null && this.getHintTextoff().equals(castOther.getHintTextoff()) ) )
 && ( (this.getHintTextlen()==castOther.getHintTextlen()) || ( this.getHintTextlen()!=null && castOther.getHintTextlen()!=null && this.getHintTextlen().equals(castOther.getHintTextlen()) ) )
 && ( (this.getJoinPred()==castOther.getJoinPred()) || ( this.getJoinPred()!=null && castOther.getJoinPred()!=null && this.getJoinPred().equals(castOther.getJoinPred()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getHintString()==castOther.getHintString()) || ( this.getHintString()!=null && castOther.getHintString()!=null && this.getHintString().equals(castOther.getHintString()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOlName() == null ? 0 : this.getOlName().hashCode() );
         result = 37 * result + ( getHint#() == null ? 0 : this.getHint#().hashCode() );
         result = 37 * result + ( getCategory() == null ? 0 : this.getCategory().hashCode() );
         result = 37 * result + ( getHintType() == null ? 0 : this.getHintType().hashCode() );
         result = 37 * result + ( getHintText() == null ? 0 : this.getHintText().hashCode() );
         result = 37 * result + ( getStage#() == null ? 0 : this.getStage#().hashCode() );
         result = 37 * result + ( getNode#() == null ? 0 : this.getNode#().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getTableTin() == null ? 0 : this.getTableTin().hashCode() );
         result = 37 * result + ( getTablePos() == null ? 0 : this.getTablePos().hashCode() );
         result = 37 * result + ( getRefId() == null ? 0 : this.getRefId().hashCode() );
         result = 37 * result + ( getUserTableName() == null ? 0 : this.getUserTableName().hashCode() );
         result = 37 * result + ( getCost() == null ? 0 : this.getCost().hashCode() );
         result = 37 * result + ( getCardinality() == null ? 0 : this.getCardinality().hashCode() );
         result = 37 * result + ( getBytes() == null ? 0 : this.getBytes().hashCode() );
         result = 37 * result + ( getHintTextoff() == null ? 0 : this.getHintTextoff().hashCode() );
         result = 37 * result + ( getHintTextlen() == null ? 0 : this.getHintTextlen().hashCode() );
         result = 37 * result + ( getJoinPred() == null ? 0 : this.getJoinPred().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getHintString() == null ? 0 : this.getHintString().hashCode() );
         return result;
   }   


}


