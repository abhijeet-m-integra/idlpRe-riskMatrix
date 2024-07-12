package com.ruleengine.idlpre;

import java.math.BigDecimal;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class riskMatrix implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("loan_size")
	private java.lang.String loan_size;
	@org.kie.api.definition.type.Label("risk_rating")
	private java.lang.String risk_rating;

	@org.kie.api.definition.type.Label("product_id")
	private java.lang.String product_id;

	@org.kie.api.definition.type.Label("member_group")
	private java.lang.String member_group;

	@org.kie.api.definition.type.Label("age")
	private java.lang.Integer age;

	@org.kie.api.definition.type.Label("int_type")
	private java.lang.String int_type;

	@org.kie.api.definition.type.Label("int_rate")
	private BigDecimal int_rate;

	public riskMatrix() {
	}

	public java.lang.String getLoan_size() {
		return this.loan_size;
	}

	public void setLoan_size(java.lang.String loan_size) {
		this.loan_size = loan_size;
	}

	public java.lang.String getRisk_rating() {
		return this.risk_rating;
	}

	public void setRisk_rating(java.lang.String risk_rating) {
		this.risk_rating = risk_rating;
	}

	public java.lang.String getProduct_id() {
		return this.product_id;
	}

	public void setProduct_id(java.lang.String product_id) {
		this.product_id = product_id;
	}

	public java.lang.String getMember_group() {
		return this.member_group;
	}

	public void setMember_group(java.lang.String member_group) {
		this.member_group = member_group;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.String getInt_type() {
		return this.int_type;
	}

	public void setInt_type(java.lang.String int_type) {
		this.int_type = int_type;
	}

	public java.math.BigDecimal getInt_rate() {
		return this.int_rate;
	}

	public void setInt_rate(java.math.BigDecimal int_rate) {
		this.int_rate = int_rate;
	}

	public riskMatrix(java.lang.String loan_size, java.lang.String risk_rating,
			java.lang.String product_id, java.lang.String member_group,
			java.lang.Integer age, java.lang.String int_type,
			java.math.BigDecimal int_rate) {
		this.loan_size = loan_size;
		this.risk_rating = risk_rating;
		this.product_id = product_id;
		this.member_group = member_group;
		this.age = age;
		this.int_type = int_type;
		this.int_rate = int_rate;
	}

}