package com.hospital.models;


public class ShiftTime {
	
        private int shiftTimeID;
	private String fromTime;
	private String toTime;

	public int getShiftTimeID() {
		return shiftTimeID;
	}

	public void setShiftTimeID(int shiftTimeID) {
		this.shiftTimeID = shiftTimeID;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}


}
