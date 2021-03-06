package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrcConGgId generated by hbm2java
 */
public class LogmnrcConGgId implements java.io.Serializable {

	private BigDecimal logmnrUid;
	private BigDecimal con#;
	private BigDecimal commitScn;

	public LogmnrcConGgId() {
	}

	public LogmnrcConGgId(BigDecimal logmnrUid, BigDecimal con#, BigDecimal commitScn) {
       this.logmnrUid = logmnrUid;
       this.con# = con#;
       this.commitScn = commitScn;
    }

	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}

	public void setLogmnrUid(BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid;
	}

	public BigDecimal getCon#()
	{
        return this.con#;
    }

	public void setCon#(
	BigDecimal con#)
	{
        this.con# = con#;
    }

	public BigDecimal getCommitScn() {
		return this.commitScn;
	}

	public void setCommitScn(BigDecimal commitScn) {
		this.commitScn = commitScn;
	}

	public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LogmnrcConGgId) ) return false;
		 LogmnrcConGgId castOther = ( LogmnrcConGgId ) other; 
         
		 return ( (this.getLogmnrUid()==castOther.getLogmnrUid()) || ( this.getLogmnrUid()!=null && castOther.getLogmnrUid()!=null && this.getLogmnrUid().equals(castOther.getLogmnrUid()) ) )
 && ( (this.getCon#()==castOther.getCon#()) || ( this.getCon#()!=null && castOther.getCon#()!=null && this.getCon#().equals(castOther.getCon#()) ) )
 && ( (this.getCommitScn()==castOther.getCommitScn()) || ( this.getCommitScn()!=null && castOther.getCommitScn()!=null && this.getCommitScn().equals(castOther.getCommitScn()) ) );
   }

	public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode() );
         result = 37 * result + ( getCon#() == null ? 0 : this.getCon#().hashCode() );
         result = 37 * result + ( getCommitScn() == null ? 0 : this.getCommitScn().hashCode() );
         return result;
   }

}
