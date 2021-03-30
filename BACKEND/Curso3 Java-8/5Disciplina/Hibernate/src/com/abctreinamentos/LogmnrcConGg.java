package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * LogmnrcConGg generated by hbm2java
 */
public class LogmnrcConGg implements java.io.Serializable {

	private LogmnrcConGgId id;
	private String name;
	private BigDecimal dropScn;
	private BigDecimal baseobj#;
	private BigDecimal baseobjv#;
	private BigDecimal flags;
	private BigDecimal indexobj#;
	private BigDecimal spare1;
	private BigDecimal spare2;
	private BigDecimal spare3;
	private String spare4;
	private String spare5;
	private String spare6;

	public LogmnrcConGg() {
	}

	public LogmnrcConGg(LogmnrcConGgId id, String name, BigDecimal baseobj#, BigDecimal baseobjv#, BigDecimal flags) {
        this.id = id;
        this.name = name;
        this.baseobj# = baseobj#;
        this.baseobjv# = baseobjv#;
        this.flags = flags;
    }

	public LogmnrcConGg(LogmnrcConGgId id, String name, BigDecimal dropScn, BigDecimal baseobj#, BigDecimal baseobjv#, BigDecimal flags, BigDecimal indexobj#, BigDecimal spare1, BigDecimal spare2, BigDecimal spare3, String spare4, String spare5, String spare6) {
       this.id = id;
       this.name = name;
       this.dropScn = dropScn;
       this.baseobj# = baseobj#;
       this.baseobjv# = baseobjv#;
       this.flags = flags;
       this.indexobj# = indexobj#;
       this.spare1 = spare1;
       this.spare2 = spare2;
       this.spare3 = spare3;
       this.spare4 = spare4;
       this.spare5 = spare5;
       this.spare6 = spare6;
    }

	public LogmnrcConGgId getId() {
		return this.id;
	}

	public void setId(LogmnrcConGgId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getDropScn() {
		return this.dropScn;
	}

	public void setDropScn(BigDecimal dropScn) {
		this.dropScn = dropScn;
	}

	public BigDecimal getBaseobj#()
	{
        return this.baseobj#;
    }

	public void setBaseobj#(
	BigDecimal baseobj#)
	{
        this.baseobj# = baseobj#;
    }
	public BigDecimal getBaseobjv#()
	{
        return this.baseobjv#;
    }

	public void setBaseobjv#(
	BigDecimal baseobjv#)
	{
        this.baseobjv# = baseobjv#;
    }

	public BigDecimal getFlags() {
		return this.flags;
	}

	public void setFlags(BigDecimal flags) {
		this.flags = flags;
	}

	public BigDecimal getIndexobj#()
	{
        return this.indexobj#;
    }

	public void setIndexobj#(
	BigDecimal indexobj#)
	{
        this.indexobj# = indexobj#;
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

	public BigDecimal getSpare3() {
		return this.spare3;
	}

	public void setSpare3(BigDecimal spare3) {
		this.spare3 = spare3;
	}

	public String getSpare4() {
		return this.spare4;
	}

	public void setSpare4(String spare4) {
		this.spare4 = spare4;
	}

	public String getSpare5() {
		return this.spare5;
	}

	public void setSpare5(String spare5) {
		this.spare5 = spare5;
	}

	public String getSpare6() {
		return this.spare6;
	}

	public void setSpare6(String spare6) {
		this.spare6 = spare6;
	}

}
