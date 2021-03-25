package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Logstdby.skipId generated by hbm2java
 */
public class Logstdby.skipId  implements java.io.Serializable {


     private BigDecimal error;
     private String statementOpt;
     private String schema;
     private String name;
     private BigDecimal useLike;
     private String esc;
     private String proc;
     private BigDecimal active;
     private BigDecimal spare1;
     private BigDecimal spare2;
     private String spare3;

    public Logstdby.skipId() {
    }

    public Logstdby.skipId(BigDecimal error, String statementOpt, String schema, String name, BigDecimal useLike, String esc, String proc, BigDecimal active, BigDecimal spare1, BigDecimal spare2, String spare3) {
       this.error = error;
       this.statementOpt = statementOpt;
       this.schema = schema;
       this.name = name;
       this.useLike = useLike;
       this.esc = esc;
       this.proc = proc;
       this.active = active;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
    }
   
    public BigDecimal getError() {
        return this.error;
    }
    
    public void setError(BigDecimal error) {
        this.error = error;
    }
    public String getStatementOpt() {
        return this.statementOpt;
    }
    
    public void setStatementOpt(String statementOpt) {
        this.statementOpt = statementOpt;
    }
    public String getSchema() {
        return this.schema;
    }
    
    public void setSchema(String schema) {
        this.schema = schema;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getUseLike() {
        return this.useLike;
    }
    
    public void setUseLike(BigDecimal useLike) {
        this.useLike = useLike;
    }
    public String getEsc() {
        return this.esc;
    }
    
    public void setEsc(String esc) {
        this.esc = esc;
    }
    public String getProc() {
        return this.proc;
    }
    
    public void setProc(String proc) {
        this.proc = proc;
    }
    public BigDecimal getActive() {
        return this.active;
    }
    
    public void setActive(BigDecimal active) {
        this.active = active;
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
		 if ( !(other instanceof Logstdby.skipId) ) return false;
		 Logstdby.skipId castOther = ( Logstdby.skipId ) other; 
         
		 return ( (this.getError()==castOther.getError()) || ( this.getError()!=null && castOther.getError()!=null && this.getError().equals(castOther.getError()) ) )
 && ( (this.getStatementOpt()==castOther.getStatementOpt()) || ( this.getStatementOpt()!=null && castOther.getStatementOpt()!=null && this.getStatementOpt().equals(castOther.getStatementOpt()) ) )
 && ( (this.getSchema()==castOther.getSchema()) || ( this.getSchema()!=null && castOther.getSchema()!=null && this.getSchema().equals(castOther.getSchema()) ) )
 && ( (this.getName()==castOther.getName()) || ( this.getName()!=null && castOther.getName()!=null && this.getName().equals(castOther.getName()) ) )
 && ( (this.getUseLike()==castOther.getUseLike()) || ( this.getUseLike()!=null && castOther.getUseLike()!=null && this.getUseLike().equals(castOther.getUseLike()) ) )
 && ( (this.getEsc()==castOther.getEsc()) || ( this.getEsc()!=null && castOther.getEsc()!=null && this.getEsc().equals(castOther.getEsc()) ) )
 && ( (this.getProc()==castOther.getProc()) || ( this.getProc()!=null && castOther.getProc()!=null && this.getProc().equals(castOther.getProc()) ) )
 && ( (this.getActive()==castOther.getActive()) || ( this.getActive()!=null && castOther.getActive()!=null && this.getActive().equals(castOther.getActive()) ) )
 && ( (this.getSpare1()==castOther.getSpare1()) || ( this.getSpare1()!=null && castOther.getSpare1()!=null && this.getSpare1().equals(castOther.getSpare1()) ) )
 && ( (this.getSpare2()==castOther.getSpare2()) || ( this.getSpare2()!=null && castOther.getSpare2()!=null && this.getSpare2().equals(castOther.getSpare2()) ) )
 && ( (this.getSpare3()==castOther.getSpare3()) || ( this.getSpare3()!=null && castOther.getSpare3()!=null && this.getSpare3().equals(castOther.getSpare3()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getError() == null ? 0 : this.getError().hashCode() );
         result = 37 * result + ( getStatementOpt() == null ? 0 : this.getStatementOpt().hashCode() );
         result = 37 * result + ( getSchema() == null ? 0 : this.getSchema().hashCode() );
         result = 37 * result + ( getName() == null ? 0 : this.getName().hashCode() );
         result = 37 * result + ( getUseLike() == null ? 0 : this.getUseLike().hashCode() );
         result = 37 * result + ( getEsc() == null ? 0 : this.getEsc().hashCode() );
         result = 37 * result + ( getProc() == null ? 0 : this.getProc().hashCode() );
         result = 37 * result + ( getActive() == null ? 0 : this.getActive().hashCode() );
         result = 37 * result + ( getSpare1() == null ? 0 : this.getSpare1().hashCode() );
         result = 37 * result + ( getSpare2() == null ? 0 : this.getSpare2().hashCode() );
         result = 37 * result + ( getSpare3() == null ? 0 : this.getSpare3().hashCode() );
         return result;
   }   


}

