package com.entity;

public class Jobs {
	private int id;
	private String title;
	private String desciption;
	private String category;
	private String status;
	private String location;
	private String pdate;

	public Jobs() {
		super();

	}

	public Jobs(String title, String desciption, String category, String status, String location, String pdate) {
		super();
		this.title = title;
		this.desciption = desciption;
		this.category = category;
		this.status = status;
		this.location = location;
		this.pdate = pdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPdate() {
		return pdate;
	}

	public void setPdate(String pdate) {
		this.pdate = pdate;
	}

}
