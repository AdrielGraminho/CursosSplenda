package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrggcGtcsId generated by hbm2java
 */
public class LogmnrggcGtcsId implements java.io.Serializable {

	private BigDecimal logmnrUid;
	private BigDecimal obj#;
	private BigDecimal objv#;
	private BigDecimal intcol#;

	public LogmnrggcGtcsId() {
	}

	public LogmnrggcGtcsId(BigDecimal logmnrUid, BigDecimal obj#, BigDecimal objv#, BigDecimal intcol#) {
       this.logmnrUid = logmnrUid;
       this.obj# = obj#;
       this.objv# = objv#;
       this.intcol# = intcol#;
    }

	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}

	public void setLogmnrUid(BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid;
	}

	public BigDecimal getObj#()
	{
        return this.obj#;
    }

	public void setObj#(
	BigDecimal obj#)
	{
        this.obj# = obj#;
    }
	public BigDecimal getObjv#()
	{
        return this.objv#;
    }

	public void setObjv#(
	BigDecimal objv#)
	{
        this.objv# = objv#;
    }
	public BigDecimal getIntcol#()
	{
        return this.intcol#;
    }

	public void setIntcol#(
	BigDecimal intcol#)
	{
        this.intcol# = intcol#;
    }

	public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrggcGtcsId) ) return false;
		 LogmnrggcGtcsId castOther = ( LogmnrggcGtcsId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getObj#()==castOther.getObj#()) || ( this.getObj#()!=null && castOther.getObj#()!=null && this.getObj#().equals(castOther.getObj#()) ) )
 && ( (this.getObjv#()==castOther.getObjv#()) || ( this.getObjv#()!=null && castOther.getObjv#()!=null && this.getObjv#().equals(castOther.getObjv#()) ) )
 && ( (this.getIntcol#()==castOther.getIntcol#()) || ( this.getIntcol#()!=null && castOther.getIntcol#()!=null && this.getIntcol#().equals(castOther.getIntcol#()) ) );
   }

	public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getObj#() == null ? 0 : this.getObj#().hashCode() );
         result = 37 * result + ( getObjv#() == null ? 0 : this.getObjv#().hashCode() );
         result = 37 * result + ( getIntcol#() == null ? 0 : this.getIntcol#().hashCode() );
         return result;
   }

}
