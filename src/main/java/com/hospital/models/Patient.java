package com.hospital.models;

import java.util.Date;

public class Patient implements java.io.Serializable {

	private Integer patientId;	
	private String address;
	private Date dob;
	private String email;
	private String familyName;
	private String fatherName;
	private String gender;
	private Date joiningDate;
	private String name;
	private long phone;
	private NextOfKin nextOfKin;

        public Patient() {
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}


	public NextOfKin getNextOfKin() {
		return this.nextOfKin;
	}

	public void setNextOfKin(NextOfKin nextOfKin) {
		this.nextOfKin = nextOfKin;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return this.phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	

}
