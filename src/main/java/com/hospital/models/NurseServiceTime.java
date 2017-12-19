package com.hospital.models;

import java.util.Date;


public class NurseServiceTime {
	
	private int nurseServiceTimeID;	
	private Date serviceDate;
	private ShiftTime shiftTime;
	private Nurse nurse;
	
	
	private String department;

	public int getNurseServiceTimeID() {
		return nurseServiceTimeID;
	}

	public void setNurseServiceTimeID(int nurseServiceTimeID) {
		this.nurseServiceTimeID = nurseServiceTimeID;
	}

	public Date getServiceDate() {
		return serviceDate;
	}

	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}

	public ShiftTime getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(ShiftTime shiftTime) {
		this.shiftTime = shiftTime;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
