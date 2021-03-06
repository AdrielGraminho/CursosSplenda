package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrcSeqGg generated by hbm2java
 */
public class LogmnrcSeqGg implements java.io.Serializable {

	private LogmnrcSeqGgId id;
	private BigDecimal dropScn;
	private BigDecimal seqFlags;
	private BigDecimal owner#;
	private String ownername;
	private String objname;
	private BigDecimal seqcache;
	private BigDecimal seqinc;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;
	private String spare4;

	public LogmnrcSeqGg() {
	}

	public LogmnrcSeqGg(LogmnrcSeqGgId id, BigDecimal seqFlags, BigDecimal owner#, String ownername, String objname) {
        this.id = id;
        this.seqFlags = seqFlags;
        this.owner# = owner#;
        this.ownername = ownername;
        this.objname = objname;
    }

	public LogmnrcSeqGg(LogmnrcSeqGgId id, BigDecimal dropScn, BigDecimal seqFlags, BigDecimal owner#, String ownername, String objname, BigDecimal seqcache, BigDecimal seqinc, BigDecimal spare1, BigDecimal spare2, String spare3, String spare4) {
       this.id = id;
       this.dropScn = dropScn;
       this.seqFlags = seqFlags;
       this.owner# = owner#;
       this.ownername = ownername;
       this.objname = objname;
       this.seqcache = seqcache;
       this.seqinc = seqinc;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.spare4 = spare4;
    }

	public LogmnrcSeqGgId getId() {
		return this.id;
	}

	public void setId(LogmnrcSeqGgId id) {
		this.id = id;
	}

	public BigDecimal getDropScn() {
		return this.dropScn;
	}

	public void setDropScn(BigDecimal dropScn) {
		this.dropScn = dropScn;
	}

	public BigDecimal getSeqFlags() {
		return this.seqFlags;
	}

	public void setSeqFlags(BigDecimal seqFlags) {
		this.seqFlags = seqFlags;
	}

	public BigDecimal getOwner#()
	{
        return this.owner#;
    }

	public void setOwner#(
	BigDecimal owner#)
	{
        this.owner# = owner#;
    }

	public String getOwnername() {
		return this.ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getObjname() {
		return this.objname;
	}

	public void setObjname(String objname) {
		this.objname = objname;
	}

	public BigDecimal getSeqcache() {
		return this.seqcache;
	}

	public void setSeqcache(BigDecimal seqcache) {
		this.seqcache = seqcache;
	}

	public BigDecimal getSeqinc() {
		return this.seqinc;
	}

	public void setSeqinc(BigDecimal seqinc) {
		this.seqinc = seqinc;
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

	public String getSpare4() {
		return this.spare4;
	}

	public void setSpare4(String spare4) {
		this.spare4 = spare4;
	}

}
