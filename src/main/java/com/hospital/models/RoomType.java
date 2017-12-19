package com.hospital.models;

public class RoomType implements java.io.Serializable {

	private Integer roomTypeId;
	private String typeOfroom;
	private double roomCost;

	public RoomType() {
	}

	public Integer getRoomTypeId() {
		return this.roomTypeId;
	}

	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getTypeOfroom() {
		return this.typeOfroom;
	}

	public void setTypeOfroom(String typeOfroom) {
		this.typeOfroom = typeOfroom;
	}

	public double getRoomCost() {
		return roomCost;
	}

	public void setRoomCost(double roomCost) {
		this.roomCost = roomCost;
	}

}
