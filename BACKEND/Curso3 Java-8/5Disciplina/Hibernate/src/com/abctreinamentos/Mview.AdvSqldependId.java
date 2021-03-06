package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Mview.AdvSqldependId generated by hbm2java
 */
public class Mview.AdvSqldependId  implements java.io.Serializable {


     private BigDecimal collectionid#;
     private BigDecimal instId;
     private byte[] fromAddress;
     private BigDecimal fromHash;
     private String toOwner;
     private String toName;
     private BigDecimal toType;
     private BigDecimal cardinality;

    public Mview.AdvSqldependId() {
    }

    public Mview.AdvSqldependId(BigDecimal collectionid#, BigDecimal instId, byte[] fromAddress, BigDecimal fromHash, String toOwner, String toName, BigDecimal toType, BigDecimal cardinality) {
       this.collectionid# = collectionid#;
       this.instId = instId;
       this.fromAddress = fromAddress;
       this.fromHash = fromHash;
       this.toOwner = toOwner;
       this.toName = toName;
       this.toType = toType;
       this.cardinality = cardinality;
    }
   
    public BigDecimal getCollectionid#() {
        return this.collectionid#;
    }
    
    public void setCollectionid#(BigDecimal collectionid#) {
        this.collectionid# = collectionid#;
    }
    public BigDecimal getInstId() {
        return this.instId;
    }
    
    public void setInstId(BigDecimal instId) {
        this.instId = instId;
    }
    public byte[] getFromAddress() {
        return this.fromAddress;
    }
    
    public void setFromAddress(byte[] fromAddress) {
        this.fromAddress = fromAddress;
    }
    public BigDecimal getFromHash() {
        return this.fromHash;
    }
    
    public void setFromHash(BigDecimal fromHash) {
        this.fromHash = fromHash;
    }
    public String getToOwner() {
        return this.toOwner;
    }
    
    public void setToOwner(String toOwner) {
        this.toOwner = toOwner;
    }
    public String getToName() {
        return this.toName;
    }
    
    public void setToName(String toName) {
        this.toName = toName;
    }
    public BigDecimal getToType() {
        return this.toType;
    }
    
    public void setToType(BigDecimal toType) {
        this.toType = toType;
    }
    public BigDecimal getCardinality() {
        return this.cardinality;
    }
    
    public void setCardinality(BigDecimal cardinality) {
        this.cardinality = cardinality;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Mview.AdvSqldependId) ) return false;
		 Mview.AdvSqldependId castOther = ( Mview.AdvSqldependId ) other; 
         
		 return ( (this.getCollectionid#()==castOther.getCollectionid#()) || ( this.getCollectionid#()!=null && castOther.getCollectionid#()!=null && this.getCollectionid#().equals(castOther.getCollectionid#()) ) )
 && ( (this.getInstId()==castOther.getInstId()) || ( this.getInstId()!=null && castOther.getInstId()!=null && this.getInstId().equals(castOther.getInstId()) ) )
 && ( (this.getFromAddress()==castOther.getFromAddress()) || ( this.getFromAddress()!=null && castOther.getFromAddress()!=null && Arrays.equals(this.getFromAddress(), castOther.getFromAddress()) ) )
 && ( (this.getFromHash()==castOther.getFromHash()) || ( this.getFromHash()!=null && castOther.getFromHash()!=null && this.getFromHash().equals(castOther.getFromHash()) ) )
 && ( (this.getToOwner()==castOther.getToOwner()) || ( this.getToOwner()!=null && castOther.getToOwner()!=null && this.getToOwner().equals(castOther.getToOwner()) ) )
 && ( (this.getToName()==castOther.getToName()) || ( this.getToName()!=null && castOther.getToName()!=null && this.getToName().equals(castOther.getToName()) ) )
 && ( (this.getToType()==castOther.getToType()) || ( this.getToType()!=null && castOther.getToType()!=null && this.getToType().equals(castOther.getToType()) ) )
 && ( (this.getCardinality()==castOther.getCardinality()) || ( this.getCardinality()!=null && castOther.getCardinality()!=null && this.getCardinality().equals(castOther.getCardinality()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCollectionid#() == null ? 0 : this.getCollectionid#().hashCode() );
         result = 37 * result + ( getInstId() == null ? 0 : this.getInstId().hashCode() );
         int fromAddressHashcode = 0;
         byte[] fromAddressProperty = this.getFromAddress();
         if(fromAddressProperty != null) {
             fromAddressHashcode = 1;
             for (int i=0; i<fromAddressProperty.length; i++) {
                 fromAddressHashcode = 37 * fromAddressHashcode + fromAddressProperty[i];
             }
         }

         result = 37 * result + fromAddressHashcode;

         result = 37 * result + ( getFromHash() == null ? 0 : this.getFromHash().hashCode() );
         result = 37 * result + ( getToOwner() == null ? 0 : this.getToOwner().hashCode() );
         result = 37 * result + ( getToName() == null ? 0 : this.getToName().hashCode() );
         result = 37 * result + ( getToType() == null ? 0 : this.getToType().hashCode() );
         result = 37 * result + ( getCardinality() == null ? 0 : this.getCardinality().hashCode() );
         return result;
   }   


}


