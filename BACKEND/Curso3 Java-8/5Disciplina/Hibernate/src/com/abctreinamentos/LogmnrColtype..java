package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1


import com.abctreinamentos.LogmnrColtype.Id;
import java.math.BigDecimal;

/**
 * LogmnrColtype. generated by hbm2java
 */
public class LogmnrColtype.  implements java.io.Serializable {


     private LogmnrColtype.Id id;
     private BigDecimal col#;
     private byte[] toid;
     private BigDecimal version#;
     private BigDecimal packed;
     private BigDecimal intcols;
     private byte[] intcol#s;
     private BigDecimal flags;
     private BigDecimal typidcol#;
     private BigDecimal synobj#;
     private BigDecimal logmnrFlags;

    public LogmnrColtype.() {
    }

	
    public LogmnrColtype.(LogmnrColtype.Id id) {
        this.id = id;
    }
    public LogmnrColtype.(LogmnrColtype.Id id, BigDecimal col#, byte[] toid, BigDecimal version#, BigDecimal packed, BigDecimal intcols, byte[] intcol#s, BigDecimal flags, BigDecimal typidcol#, BigDecimal synobj#, BigDecimal logmnrFlags) {
       this.id = id;
       this.col# = col#;
       this.toid = toid;
       this.version# = version#;
       this.packed = packed;
       this.intcols = intcols;
       this.intcol#s = intcol#s;
       this.flags = flags;
       this.typidcol# = typidcol#;
       this.synobj# = synobj#;
       this.logmnrFlags = logmnrFlags;
    }
   
    public LogmnrColtype.Id getId() {
        return this.id;
    }
    
    public void setId(LogmnrColtype.Id id) {
        this.id = id;
    }
    public BigDecimal getCol#() {
        return this.col#;
    }
    
    public void setCol#(BigDecimal col#) {
        this.col# = col#;
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
    public BigDecimal getPacked() {
        return this.packed;
    }
    
    public void setPacked(BigDecimal packed) {
        this.packed = packed;
    }
    public BigDecimal getIntcols() {
        return this.intcols;
    }
    
    public void setIntcols(BigDecimal intcols) {
        this.intcols = intcols;
    }
    public byte[] getIntcol#s() {
        return this.intcol#s;
    }
    
    public void setIntcol#s(byte[] intcol#s) {
        this.intcol#s = intcol#s;
    }
    public BigDecimal getFlags() {
        return this.flags;
    }
    
    public void setFlags(BigDecimal flags) {
        this.flags = flags;
    }
    public BigDecimal getTypidcol#() {
        return this.typidcol#;
    }
    
    public void setTypidcol#(BigDecimal typidcol#) {
        this.typidcol# = typidcol#;
    }
    public BigDecimal getSynobj#() {
        return this.synobj#;
    }
    
    public void setSynobj#(BigDecimal synobj#) {
        this.synobj# = synobj#;
    }
    public BigDecimal getLogmnrFlags() {
        return this.logmnrFlags;
    }
    
    public void setLogmnrFlags(BigDecimal logmnrFlags) {
        this.logmnrFlags = logmnrFlags;
    }




}


