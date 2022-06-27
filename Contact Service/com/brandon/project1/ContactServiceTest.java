package com.brandon.project1;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContactServiceTest {
	Contact contact = new Contact("1", "firstName", "lastName", "12345678910", "123 street st");
	
	// Test contact adding
	@Test
	public void testMethodAddContactPass() {
		ContactService cs = new ContactService();
		Contact c1 = new Contact("01", "John", "Doe", "12345678910", "123 State St");
		assertEquals(true, cs.addContact(c1));
	}
	
	// Test contact deletion
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		
		// Add contacts
		Contact c1 = new Contact("01", "John", "Doe", "12345678910", "123 State St");
		Contact c2 = new Contact("02", "Jane", "Doe", "01987654321", "321 Country Rd");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		// Remove contacts
		assertEquals(true, cs.removeContact("02"));
		assertEquals(true, cs.removeContact("01"));
	}
	
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		
		// Add contacts
		Contact c1 = new Contact("01", "John", "Doe", "12345678910", "123 State St");
		Contact c2 = new Contact("02", "Jane", "Doe", "01987654321", "321 Country Rd");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		// Remove contacts
		assertEquals(false, cs.removeContact("04"));
		assertEquals(true, cs.removeContact("01"));
	}
	
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		
		// Add contacts
		Contact c1 = new Contact("01", "John", "Doe", "12345678910", "123 State St");
		Contact c2 = new Contact("02", "Jane", "Smith", "01987654321", "321 Country Rd");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		// Remove contacts
		assertEquals(true, cs.updateFirstName("01", "Mark"));
		assertEquals(true, cs.updateLastName("02", "Jones"));
		assertEquals(true, cs.updateNumber("01", "1234789562"));
		assertEquals(true, cs.updateAddress("02", "1600 Pennsylvania ave"));
	}
	
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		
		// Add contacts
		Contact c1 = new Contact("01", "John", "Doe", "12345678910", "123 State St");
		Contact c2 = new Contact("02", "Jane", "Smith", "01987654321", "321 Country Rd");
		assertEquals(true, cs.addContact(c1));
		assertEquals(true, cs.addContact(c2));
		
		// Remove contacts
		assertEquals(false, cs.updateFirstName("03", "Mark"));
		assertEquals(false, cs.updateLastName("03", "Jones"));
		assertEquals(false, cs.updateNumber("03", "1234789562"));
		assertEquals(false, cs.updateAddress("03", "1600 Pennsylvania ave"));
	}
}