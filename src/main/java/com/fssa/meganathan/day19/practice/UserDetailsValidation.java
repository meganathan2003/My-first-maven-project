package com.fssa.meganathan.day19.practice;

import java.util.Scanner;
import java.util.function.BooleanSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Creating the new class name USER
class User {
	String id;
	String name;
	String password;
	String email;

	// Create a unique Method with return
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static BooleanSupplier validateId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}

// uservalidator class by passing the object
class UserValidator {
// getting the userdetail validatye
	public static boolean validate(User user) {

		idValidator(user.id);
		nameValidator(user.name);
		emailValidator(user.email);
		passwordValidator(user.password);

		return true;
	}

// ID validate 

	public static boolean idValidator(String id) throws IllegalArgumentException {

		String intregex = "^[1-9]\\d{7}$";
		Pattern pattern = Pattern.compile(intregex);
		Matcher matcher = pattern.matcher(id);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("The entered UserID is Invaild,ID must be Number");

		}

		return true;

	}

	// Below the code for seprate class For name validate

	public static boolean nameValidator(String name) throws IllegalArgumentException {

		String nameregex = "^[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("User name should be minimum 2 letters");

		}

		return true;

	}

	// Below the code for seprpate class for Email validate

	public static boolean emailValidator(String email) throws IllegalArgumentException {

		String emailregex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(emailregex);
		Matcher matcher = pattern.matcher(email);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Users email is invaild");

		}

		return true;
	}

	// Below the code for password validate

	public static boolean passwordValidator(String password) throws IllegalArgumentException {
		String passwordregex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		Pattern pattern = Pattern.compile(passwordregex);
		Matcher matcher = pattern.matcher(password);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("User Password is Invaild");

		}

		return true;

	}
}

public class UserDetailsValidation {
	public static void main(String[] args) {

		// Get the input from the user

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user id with digit that contain 8 digit");

		String userid = scan.next();

		System.out.println("Enter the user name");
		String username = scan.next();

		System.out.println("Enter the user password");
		String userpassword = scan.next();

		System.out.println("Enter the user email");
		String useremail = scan.next();
		scan.close();

		User classuser = new User();
		classuser.setId(userid);
		classuser.setName(username);
		classuser.setPassword(userpassword);
		classuser.setEmail(useremail);

		try {

			boolean valid = UserValidator.validate(classuser);

			if (valid) { // If this condition turns ture then only it will stop
				System.out.println("All details is in correct format");
			}

		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		finally {
			System.out.println("The program is ended");
		}

	}
}
