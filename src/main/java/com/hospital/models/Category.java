package com.hospital.models;


public class Category implements java.io.Serializable {

    private static final long serialVersionUID = 1L;	
	private String categoryName;

	public Category() {
	}

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
