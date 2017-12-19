package com.hospital.models;


public class BloodGroup implements java.io.Serializable {

	private Integer bloodGroupId;
	private String bloodGroupName;

        
	public Integer getBloodGroupId() {
		return this.bloodGroupId;
	}

	public void setBloodGroupId(Integer bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}

	public String getBloodGroupName() {
		return this.bloodGroupName;
	}

	public void setBloodGroupName(String bloodGroupName) {
		this.bloodGroupName = bloodGroupName;
	}

}
