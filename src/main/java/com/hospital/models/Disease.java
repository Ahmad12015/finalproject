package com.hospital.models;

import java.util.Date;


public class Disease implements java.io.Serializable {

	private Integer diseaseId;
	private String disease;
	private String note;
	private Patient patient;
	
	private Date diseaseDate;

	public Disease() {
	}

	public Integer getDiseaseId() {
		return this.diseaseId;
	}

	public void setDiseaseId(Integer diseaseId) {
		this.diseaseId = diseaseId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getDisease() {
		return this.disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getDiseaseDate() {
		return diseaseDate;
	}

	public void setDiseaseDate(Date diseaseDate) {
		this.diseaseDate = diseaseDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}