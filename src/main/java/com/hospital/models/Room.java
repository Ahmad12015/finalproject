package com.hospital.models;

public class Room implements java.io.Serializable {

	private Integer roomId;        
        private int roomNumber;
	private int numberOfBeds;
	private int numberOfAvailableBeds;
	private RoomType roomType;

	public Room() {
	}

	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public RoomType getRoomType() {
		return this.roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public int getNumberOfBeds() {
		return this.numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public int getNumberOfAvailableBeds() {
		return this.numberOfAvailableBeds;
	}

	public void setNumberOfAvailableBeds(int numberOfAvailableBeds) {
		this.numberOfAvailableBeds = numberOfAvailableBeds;
	}

    public int getRoomNumber() {
        return roomNumber;
    }

   
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

}
