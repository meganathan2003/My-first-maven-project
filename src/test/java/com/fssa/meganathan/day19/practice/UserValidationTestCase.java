package com.fssa.meganathan.day19.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTestCase {

	@Test
	public void testId() {
		Assertions.assertTrue(UserValidator.idValidator("1"));
	}

	@Test
	public void testIdException() {
		try {
			Assertions.assertTrue(UserValidator.idValidator("-1"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The entered UserID is Invaild,ID must be Number", ex.getMessage());
		}
	}

	// Test Case for UserName
	@Test
	public void testUserName() {
		Assertions.assertTrue(UserValidator.nameValidator("Meganathan"));
	}

	@Test
	public void testUserNameException() {
		try {
			Assertions.assertTrue(UserValidator.idValidator("Dina"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("User name should be minimum 2 letters", ex.getMessage());
		}
	}


	// Test Case for UserEmail
	@Test
	public void testUserEmail() {
		Assertions.assertTrue(UserValidator.emailValidator("meganathan212003@gmail.com"));
	}

	@Test
	public void testUserEmailException() {
		try {
			Assertions.assertTrue(UserValidator.emailValidator("ar"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Users email is invaild", ex.getMessage());
		}
	}

	// Test Case for UserPassword
	@Test
	public void testUserPassword() {
		Assertions.assertTrue(UserValidator.passwordValidator("Meganathan@2003"));
	}

	@Test
	public void testUserPasswordException() {
		try {
			Assertions.assertTrue(UserValidator.passwordValidator("Welcome"));
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Users email is invaild", ex.getMessage());
		}
	}

}