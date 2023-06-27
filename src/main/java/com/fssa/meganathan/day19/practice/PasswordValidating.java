package com.fssa.meganathan.day19.practice;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class PasswordValidator {
	// for regex
	public static void CheckPasswordRegex(String inputpassword) throws IllegalArgumentException {
		String regex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(inputpassword);
		Boolean isMatch = matcher.matches();
//		Boolean isMatch = Pattern.matches(regex, email);
		if (!isMatch) {
//			System.out.println("The password is: Valid");

			throw new IllegalArgumentException("The password is Invalid");
		} else {
			System.out.println("The password is valid");
		}

	}
}

// Create a class 

public class PasswordValidating {
	public static void main(String[] args) {

		// with using regex

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				String inputstr = scan.nextLine();
				System.out.print("Enter your password the A valid password should contain\r\n"
						+ "at least one uppercase letter, one lowercase letter, one digit, and one\r\n"
						+ "special character, and it should be at least 8 characters long ");
				PasswordValidator.CheckPasswordRegex(inputstr);
				scan.close();
				break;

			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
		}

	}
}