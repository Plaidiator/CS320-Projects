package com.brandon.project1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {
	// Set values for contact to be tested
	Contact contact = new Contact("1", "firstName", "lastName", "12345678910", "123 street st");
	
	// Check contact ID
	@Test
	void getContactID() {
		assertEquals("1", contact.getContactID());
	}
	
	// Check first name
	@Test
	void getFirstName() {
		assertEquals("lastName", contact.getLastName());
	}
	
	// Check last name
	@Test
	void getLastName() {
		assertEquals("lastName", contact.getLastName());
	}
	
	// Check phone number
	@Test
	void getPhoneNumber() {
		assertEquals("12345678910", contact.getPhoneNumber());
	}
	
	// Check address
	@Test
	void getAddress() {
		assertEquals("123 street st", contact.getAddress());
	}
}