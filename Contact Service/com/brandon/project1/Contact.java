package com.brandon.project1;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		// limit length of contact ID
		if (contactID.length() <= 10 && contactID != null) {
			this.contactID = contactID;
		}
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
	}
	
	// Limit length of first name, last name, and phone number to 10
	public void setFirstName(String name) {
		if (name.length() <= 10 && name != null) {
			this.firstName = name;
		}
	}
	
	public void setLastName(String name) {
		if (name.length() <= 10 && name != null) {
			this.lastName = name;
		}
	}
	
	public void setPhoneNumber(String number) {
		if (number.length() == 10 && number != null) {
			this.phoneNumber = number;
		}
	}
	
	// Limit address to 30
	public void setAddress(String address) {
		if (address.length() <= 30 && address != null) {
			this.address = address;
		}
	}
	
	// get each item from contact
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
}












