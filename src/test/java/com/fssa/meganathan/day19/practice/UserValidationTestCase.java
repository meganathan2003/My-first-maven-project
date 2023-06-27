package com.fssa.meganathan.day19.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTestCase {

	@Test
	public void testId() {
		Assertions.assertTrue(User.validateId(1));
	}

	@Test
	public void testIdException() {
		try {
			Assertions.assertTrue(User.validateId(-1));
			Assertions.fail("ValidateId failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("ID should be positive.", ex.getMessage());
		}
	}

	// Test Case for UserName
	@Test
	public void testUserName() {
		Assertions.assertTrue(User.validateName("Meganathan"));
	}

	@Test
	public void testUserNameException() {
		try {
			Assertions.assertTrue(User.validateName("Dinesh"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name should have a minimum length of 2 characters.", ex.getMessage());
		}
	}

	@Test
	public void testUserNameNullException() {
		try {
			Assertions.assertTrue(User.validateName(null));
			Assertions.fail("ValidateName failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Name should have a minimum length of 2 characters.", ex.getMessage());
		}
	}

	// Test Case for UserEmail
	@Test
	public void testUserEmail() {
		Assertions.assertTrue(User.getmail("aravind@gmail.com"));
	}

	@Test
	public void testUserEmailException() {
		try {
			Assertions.assertTrue(User.validateEmail("ar"));
			Assertions.fail("ValidateName failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid email format.", ex.getMessage());
		}
	}

	// Test Case for UserPassword
	@Test
	public void testUserPassword() {
		Assertions.assertTrue(User.setPassword("Meganathan@2003"));
	}

	@Test
	public void testUserPasswordException() {
		try {
			Assertions.assertTrue(User.setPassword("Welcome"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid password format.", ex.getMessage());
		}
	}

}