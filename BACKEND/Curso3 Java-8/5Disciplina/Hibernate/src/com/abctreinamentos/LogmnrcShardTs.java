package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrcShardTs generated by hbm2java
 */
public class LogmnrcShardTs implements java.io.Serializable {

	private LogmnrcShardTsId id;
	private BigDecimal chunkNumber;
	private BigDecimal dropScn;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private String spare3;

	public LogmnrcShardTs() {
	}

	public LogmnrcShardTs(LogmnrcShardTsId id, BigDecimal chunkNumber) {
		this.id = id;
		this.chunkNumber = chunkNumber;
	}

	public LogmnrcShardTs(LogmnrcShardTsId id, BigDecimal chunkNumber, BigDecimal dropScn, BigDecimal spare1,
			BigDecimal spare2, String spare3) {
		this.id = id;
		this.chunkNumber = chunkNumber;
		this.dropScn = dropScn;
		this.spare1 = spare1;
		this.spare2 = spare2;
		this.spare3 = spare3;
	}

	public LogmnrcShardTsId getId() {
		return this.id;
	}

	public void setId(LogmnrcShardTsId id) {
		this.id = id;
	}

	public BigDecimal getChunkNumber() {
		return this.chunkNumber;
	}

	public void setChunkNumber(BigDecimal chunkNumber) {
		this.chunkNumber = chunkNumber;
	}

	public BigDecimal getDropScn() {
		return this.dropScn;
	}

	public void setDropScn(BigDecimal dropScn) {
		this.dropScn = dropScn;
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

}
