package com.user.user_service.entity;

public class Contact {
	
	private Long cId;
	private String email;
	private String contactName;
	private Long userID;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long cId, String email, String contactName, Long userID) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.userID = userID;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
		
}
