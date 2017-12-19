package com.hospital.models;

import java.util.Date;


public class BookBed implements java.io.Serializable {
	private Integer bedId;
	private Date datePlaced;
	private String departement;
	private boolean status;
	private Room room;

	public BookBed() {
	}


	public Integer getBedId() {
		return this.bedId;
	}

	public void setBedId(Integer bedId) {
		this.bedId = bedId;
	}

	
	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	

	public Date getDatePlaced() {
		return this.datePlaced;
	}

	public void setDatePlaced(Date datePlaced) {
		this.datePlaced = datePlaced;
	}

	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	

}
