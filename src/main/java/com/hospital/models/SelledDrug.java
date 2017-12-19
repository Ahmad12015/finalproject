package com.hospital.models;

import java.util.Date;

public class SelledDrug {

	private int selledDrugID;
	private Date startDate;
        private Date endDate;
	private String unitPerDay;
	private Drug drug;
	private Patient patient;
        private int quantity;
        private Date selledDate;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSelledDrugID() {
		return selledDrugID;
	}

	public void setSelledDrugID(int selledDrugID) {
		this.selledDrugID = selledDrugID;
	}

	public Date getSelledDate() {
		return selledDate;
	}

	public void setSelledDate(Date selledDate) {
		this.selledDate = selledDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getUnitPerDay() {
		return unitPerDay;
	}

	public void setUnitPerDay(String unitPerDay) {
		this.unitPerDay = unitPerDay;
	}

}
