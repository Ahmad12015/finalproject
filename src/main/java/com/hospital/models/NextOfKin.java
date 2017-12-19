package com.hospital.models;

import java.util.HashSet;
import java.util.Set;


public class NextOfKin implements java.io.Serializable {

	private Integer nextOfKinId;	
	private String address;
	private String fullName;
	private String phone;
	private String relationship;


	public NextOfKin() {
	}

	public Integer getNextOfKinId() {
		return this.nextOfKinId;
	}

	public void setNextOfKinId(Integer nextOfKinId) {
		this.nextOfKinId = nextOfKinId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationship() {
		return this.relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}
