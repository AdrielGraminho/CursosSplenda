package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

/**
 * Help generated by hbm2java
 */
public class Help implements java.io.Serializable {

	private HelpId id;
	private String info;

	public Help() {
	}

	public Help(HelpId id) {
		this.id = id;
	}

	public Help(HelpId id, String info) {
		this.id = id;
		this.info = info;
	}

	public HelpId getId() {
		return this.id;
	}

	public void setId(HelpId id) {
		this.id = id;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
