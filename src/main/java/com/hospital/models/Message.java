package com.hospital.models;

import java.util.Date;

public class Message implements java.io.Serializable {

	private Integer messageId;
	private String messageBody;
	private String subject;
	private boolean messageStatus;
	private Date messageDate;
	private Employee fromEmployee;
	private Employee toEmployee;
	private Patient patient;

	public Message() {
	}

	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public boolean isMessageStatus() {
		return this.messageStatus;
	}

	public void setMessageStatus(boolean messageStatus) {
		this.messageStatus = messageStatus;
	}

	public Date getMessageDate() {
		return this.messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	public Employee getFromEmployee() {
		return fromEmployee;
	}

	public void setFromEmployee(Employee fromEmployee) {
		this.fromEmployee = fromEmployee;
	}

	public Employee getToEmployee() {
		return toEmployee;
	}

	public void setToEmployee(Employee toEmployee) {
		this.toEmployee = toEmployee;
	}

}
