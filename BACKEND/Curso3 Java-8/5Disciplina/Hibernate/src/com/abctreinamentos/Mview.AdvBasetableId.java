package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Mview.AdvBasetableId generated by hbm2java
 */
public class Mview.AdvBasetableId  implements java.io.Serializable {


     private BigDecimal collectionid#;
     private BigDecimal queryid#;
     private String owner;
     private String tableName;
     private BigDecimal tableType;

    public Mview.AdvBasetableId() {
    }

	
    public Mview.AdvBasetableId(BigDecimal collectionid#, BigDecimal queryid#) {
        this.collectionid# = collectionid#;
        this.queryid# = queryid#;
    }
    public Mview.AdvBasetableId(BigDecimal collectionid#, BigDecimal queryid#, String owner, String tableName, BigDecimal tableType) {
       this.collectionid# = collectionid#;
       this.queryid# = queryid#;
       this.owner = owner;
       this.tableName = tableName;
       this.tableType = tableType;
    }
   
    public BigDecimal getCollectionid#() {
        return this.collectionid#;
    }
    
    public void setCollectionid#(BigDecimal collectionid#) {
        this.collectionid# = collectionid#;
    }
    public BigDecimal getQueryid#() {
        return this.queryid#;
    }
    
    public void setQueryid#(BigDecimal queryid#) {
        this.queryid# = queryid#;
    }
    public String getOwner() {
        return this.owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public BigDecimal getTableType() {
        return this.tableType;
    }
    
    public void setTableType(BigDecimal tableType) {
        this.tableType = tableType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvBasetableId) ) return false;
		 Mview.AdvBasetableId castOther = ( Mview.AdvBasetableId ) other; 
         
		 return ( (this.getCollectionid#()==castOther.getCollectionid#()) || ( this.getCollectionid#()!=null && castOther.getCollectionid#()!=null && this.getCollectionid#().equals(castOther.getCollectionid#()) ) )
 && ( (this.getQueryid#()==castOther.getQueryid#()) || ( this.getQueryid#()!=null && castOther.getQueryid#()!=null && this.getQueryid#().equals(castOther.getQueryid#()) ) )
 && ( (this.getOwner()==castOther.getOwner()) || ( this.getOwner()!=null && castOther.getOwner()!=null && this.getOwner().equals(castOther.getOwner()) ) )
 && ( (this.getTableName()==castOther.getTableName()) || ( this.getTableName()!=null && castOther.getTableName()!=null && this.getTableName().equals(castOther.getTableName()) ) )
 && ( (this.getTableType()==castOther.getTableType()) || ( this.getTableType()!=null && castOther.getTableType()!=null && this.getTableType().equals(castOther.getTableType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCollectionid#() == null ? 0 : this.getCollectionid#().hashCode() );
         result = 37 * result + ( getQueryid#() == null ? 0 : this.getQueryid#().hashCode() );
         result = 37 * result + ( getOwner() == null ? 0 : this.getOwner().hashCode() );
         result = 37 * result + ( getTableName() == null ? 0 : this.getTableName().hashCode() );
         result = 37 * result + ( getTableType() == null ? 0 : this.getTableType().hashCode() );
         return result;
   }   


}


