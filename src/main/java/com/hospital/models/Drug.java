package com.hospital.models;

import java.util.Date;

public class Drug implements java.io.Serializable {

    private Integer drugId;
	private double cost;
	private String name;
	private int quantity;
	private Date drug_expired;
	private Date startDate;
	
	

	private Employee employee;

	public Drug() {
	}
        
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

        public Date getDrug_expired() {
		return this.drug_expired;
	}

	public void setDrug_expired(Date drug_expired) {
		this.drug_expired = drug_expired;
	}
        
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Integer getDrugId() {
		return drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}



	public Employee getEmployee() {
		return employee;
	}



	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
