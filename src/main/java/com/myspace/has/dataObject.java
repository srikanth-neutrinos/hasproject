package com.myspace.has;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class dataObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("isDuplicate")
	private java.lang.Boolean isDuplicate;
	@org.kie.api.definition.type.Label("isContactRequired")
	private java.lang.Boolean isContactRequired;

	@org.kie.api.definition.type.Label(value = "owner")
	private java.lang.String owner;

	public dataObject() {
	}

	public java.lang.Boolean getIsDuplicate() {
		return this.isDuplicate;
	}

	public void setIsDuplicate(java.lang.Boolean isDuplicate) {
		this.isDuplicate = isDuplicate;
	}

	public java.lang.Boolean getIsContactRequired() {
		return this.isContactRequired;
	}

	public void setIsContactRequired(java.lang.Boolean isContactRequired) {
		this.isContactRequired = isContactRequired;
	}

	public java.lang.String getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	public dataObject(java.lang.Boolean isDuplicate,
			java.lang.Boolean isContactRequired, java.lang.String owner) {
		this.isDuplicate = isDuplicate;
		this.isContactRequired = isContactRequired;
		this.owner = owner;
	}

}