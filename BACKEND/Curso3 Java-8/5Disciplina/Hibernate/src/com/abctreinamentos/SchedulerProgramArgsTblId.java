package com.abctreinamentos;
// Generated 16/03/2021 08:37:56 by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * SchedulerProgramArgsTblId generated by hbm2java
 */
public class SchedulerProgramArgsTblId implements java.io.Serializable {

	private String owner;
	private String programName;
	private String argumentName;
	private BigDecimal argumentPosition;
	private String argumentType;
	private String metadataAttribute;
	private String defaultValue;
	private Serializable defaultAnydataValue;
	private String outArgument;

	public SchedulerProgramArgsTblId() {
	}

	public SchedulerProgramArgsTblId(String owner, String programName, BigDecimal argumentPosition) {
		this.owner = owner;
		this.programName = programName;
		this.argumentPosition = argumentPosition;
	}

	public SchedulerProgramArgsTblId(String owner, String programName, String argumentName, BigDecimal argumentPosition,
			String argumentType, String metadataAttribute, String defaultValue, Serializable defaultAnydataValue,
			String outArgument) {
		this.owner = owner;
		this.programName = programName;
		this.argumentName = argumentName;
		this.argumentPosition = argumentPosition;
		this.argumentType = argumentType;
		this.metadataAttribute = metadataAttribute;
		this.defaultValue = defaultValue;
		this.defaultAnydataValue = defaultAnydataValue;
		this.outArgument = outArgument;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getProgramName() {
		return this.programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getArgumentName() {
		return this.argumentName;
	}

	public void setArgumentName(String argumentName) {
		this.argumentName = argumentName;
	}

	public BigDecimal getArgumentPosition() {
		return this.argumentPosition;
	}

	public void setArgumentPosition(BigDecimal argumentPosition) {
		this.argumentPosition = argumentPosition;
	}

	public String getArgumentType() {
		return this.argumentType;
	}

	public void setArgumentType(String argumentType) {
		this.argumentType = argumentType;
	}

	public String getMetadataAttribute() {
		return this.metadataAttribute;
	}

	public void setMetadataAttribute(String metadataAttribute) {
		this.metadataAttribute = metadataAttribute;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public Serializable getDefaultAnydataValue() {
		return this.defaultAnydataValue;
	}

	public void setDefaultAnydataValue(Serializable defaultAnydataValue) {
		this.defaultAnydataValue = defaultAnydataValue;
	}

	public String getOutArgument() {
		return this.outArgument;
	}

	public void setOutArgument(String outArgument) {
		this.outArgument = outArgument;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchedulerProgramArgsTblId))
			return false;
		SchedulerProgramArgsTblId castOther = (SchedulerProgramArgsTblId) other;

		return ((this.getOwner() == castOther.getOwner()) || (this.getOwner() != null && castOther.getOwner() != null
				&& this.getOwner().equals(castOther.getOwner())))
				&& ((this.getProgramName() == castOther.getProgramName())
						|| (this.getProgramName() != null && castOther.getProgramName() != null
								&& this.getProgramName().equals(castOther.getProgramName())))
				&& ((this.getArgumentName() == castOther.getArgumentName())
						|| (this.getArgumentName() != null && castOther.getArgumentName() != null
								&& this.getArgumentName().equals(castOther.getArgumentName())))
				&& ((this.getArgumentPosition() == castOther.getArgumentPosition())
						|| (this.getArgumentPosition() != null && castOther.getArgumentPosition() != null
								&& this.getArgumentPosition().equals(castOther.getArgumentPosition())))
				&& ((this.getArgumentType() == castOther.getArgumentType())
						|| (this.getArgumentType() != null && castOther.getArgumentType() != null
								&& this.getArgumentType().equals(castOther.getArgumentType())))
				&& ((this.getMetadataAttribute() == castOther.getMetadataAttribute())
						|| (this.getMetadataAttribute() != null && castOther.getMetadataAttribute() != null
								&& this.getMetadataAttribute().equals(castOther.getMetadataAttribute())))
				&& ((this.getDefaultValue() == castOther.getDefaultValue())
						|| (this.getDefaultValue() != null && castOther.getDefaultValue() != null
								&& this.getDefaultValue().equals(castOther.getDefaultValue())))
				&& ((this.getDefaultAnydataValue() == castOther.getDefaultAnydataValue())
						|| (this.getDefaultAnydataValue() != null && castOther.getDefaultAnydataValue() != null
								&& this.getDefaultAnydataValue().equals(castOther.getDefaultAnydataValue())))
				&& ((this.getOutArgument() == castOther.getOutArgument())
						|| (this.getOutArgument() != null && castOther.getOutArgument() != null
								&& this.getOutArgument().equals(castOther.getOutArgument())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOwner() == null ? 0 : this.getOwner().hashCode());
		result = 37 * result + (getProgramName() == null ? 0 : this.getProgramName().hashCode());
		result = 37 * result + (getArgumentName() == null ? 0 : this.getArgumentName().hashCode());
		result = 37 * result + (getArgumentPosition() == null ? 0 : this.getArgumentPosition().hashCode());
		result = 37 * result + (getArgumentType() == null ? 0 : this.getArgumentType().hashCode());
		result = 37 * result + (getMetadataAttribute() == null ? 0 : this.getMetadataAttribute().hashCode());
		result = 37 * result + (getDefaultValue() == null ? 0 : this.getDefaultValue().hashCode());
		result = 37 * result + (getDefaultAnydataValue() == null ? 0 : this.getDefaultAnydataValue().hashCode());
		result = 37 * result + (getOutArgument() == null ? 0 : this.getOutArgument().hashCode());
		return result;
	}

}
