package com.brandon.project1;

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contactList;
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	public boolean addContact (Contact newContact) {
		// Boolean returns if contact exists or not
		boolean exist = false;
		
		// check each contact in the list
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {
				// add contact to list
				contactList.add(newContact);
				// set the exist boolean to true if it exists
				exist = true;
				break;
			}
		}
		
		return exist;
	}
	
	public boolean removeContact (String contactID) {
		boolean removed = false;
		
		// Check each contact in the list
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				// Remove contact from list
				contactList.remove(c);
				removed = true;
				break;
			}
		}
		// Returns false if a match is never found, otherwise true
		return removed;
	}
	
	// Each update method is identical
	public boolean updateFirstName (String contactID, String newFirstName) {
		boolean update = false;
		
		// check contact list
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				// Change name
				c.setFirstName(newFirstName);
				update = true;
			}
		}
		
		return update;
	}
	
	public boolean updateLastName (String contactID, String newLastName) {
		boolean update = false;
		
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				// change name
				c.setLastName(newLastName);
				update = true;
			}
		}
		
		return update;
	}
	
	public boolean updateNumber (String contactID, String newNumber) {
		boolean update = false;
		
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				// Change number
				c.setPhoneNumber(newNumber);
				update = true;
			}
		}
		
		return update;
	}
	
	public boolean updateAddress (String contactID, String newAddress) {
		boolean update = false;
		
		for (Contact c:contactList) {
			if (c.getContactID().equalsIgnoreCase(contactID)) {
				// Change address
				c.setAddress(newAddress);
				update = true;
			}
		}
		
		return update;
	}
}