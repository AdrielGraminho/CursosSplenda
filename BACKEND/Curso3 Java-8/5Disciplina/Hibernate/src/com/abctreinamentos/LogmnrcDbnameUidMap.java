package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrcDbnameUidMap generated by hbm2java
 */
public class LogmnrcDbnameUidMap implements java.io.Serializable {

	private LogmnrcDbnameUidMapId id;
	private BigDecimal logmnrUid;
	private BigDecimal flags;
	private String pdbName;

	public LogmnrcDbnameUidMap() {
	}

	public LogmnrcDbnameUidMap(LogmnrcDbnameUidMapId id) {
		this.id = id;
	}

	public LogmnrcDbnameUidMap(LogmnrcDbnameUidMapId id, BigDecimal logmnrUid, BigDecimal flags, String pdbName) {
		this.id = id;
		this.logmnrUid = logmnrUid;
		this.flags = flags;
		this.pdbName = pdbName;
	}

	public LogmnrcDbnameUidMapId getId() {
		return this.id;
	}

	public void setId(LogmnrcDbnameUidMapId id) {
		this.id = id;
	}

	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}

	public void setLogmnrUid(BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid;
	}

	public BigDecimal getFlags() {
		return this.flags;
	}

	public void setFlags(BigDecimal flags) {
		this.flags = flags;
	}

	public String getPdbName() {
		return this.pdbName;
	}

	public void setPdbName(String pdbName) {
		this.pdbName = pdbName;
	}

}
