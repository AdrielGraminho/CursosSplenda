package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrShardTsId generated by hbm2java
 */
public class LogmnrShardTsId implements java.io.Serializable {

	private BigDecimal logmnrUid;
	private String tablespaceName;

	public LogmnrShardTsId() {
	}

	public LogmnrShardTsId(BigDecimal logmnrUid, String tablespaceName) {
		this.logmnrUid = logmnrUid;
		this.tablespaceName = tablespaceName;
	}

	public BigDecimal getLogmnrUid() {
		return this.logmnrUid;
	}

	public void setLogmnrUid(BigDecimal logmnrUid) {
		this.logmnrUid = logmnrUid;
	}

	public String getTablespaceName() {
		return this.tablespaceName;
	}

	public void setTablespaceName(String tablespaceName) {
		this.tablespaceName = tablespaceName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogmnrShardTsId))
			return false;
		LogmnrShardTsId castOther = (LogmnrShardTsId) other;

		return ((this.getLogmnrUid() == castOther.getLogmnrUid()) || (this.getLogmnrUid() != null
				&& castOther.getLogmnrUid() != null && this.getLogmnrUid().equals(castOther.getLogmnrUid())))
				&& ((this.getTablespaceName() == castOther.getTablespaceName())
						|| (this.getTablespaceName() != null && castOther.getTablespaceName() != null
								&& this.getTablespaceName().equals(castOther.getTablespaceName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLogmnrUid() == null ? 0 : this.getLogmnrUid().hashCode());
		result = 37 * result + (getTablespaceName() == null ? 0 : this.getTablespaceName().hashCode());
		return result;
	}

}