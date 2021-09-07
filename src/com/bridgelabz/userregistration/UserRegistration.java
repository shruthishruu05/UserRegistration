package com.bridgelabz.userregistration;
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class UserRegistration {
		public static boolean checkFirstName(String firstName) {
			Pattern pattern = Pattern.compile("^[a-zA-Z]{3,}$");
			Matcher matcher = pattern.matcher(firstName);
			return matcher.matches();
		}
		public static boolean checkLastName(String lastName) {
			Pattern pattern = Pattern.compile("^[a-zA-Z]$");
			Matcher matcher = pattern.matcher(lastName);
			return matcher.matches();
		}
		public static boolean checkEmail(String email) {
			Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}
		public static boolean checkMobileNumber(String mobileNumber) {
			Pattern pattern = Pattern.compile("^[0-9]{2}[\s][0-9]{10}$");
			Matcher matcher = pattern.matcher(mobileNumber);
			return matcher.matches();
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
				System.out.println("enter First name :");
				String firstName = scanner.nextLine();
				if(checkFirstName(firstName)) 
					System.out.println("valid");
				else 
					System.out.println("Invalid");
				
				System.out.println("enter Last name :");
				String lastName = scanner.nextLine();
				if(checkLastName(lastName)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");
				
				System.out.println("enter email:");
				String email = scanner.nextLine();
				if(checkEmail(email)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");
				
				System.out.println("enter mobile number:");
				String mobileNumber = scanner.nextLine();
				if(checkMobileNumber(mobileNumber)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");
				scanner.close();
		}
	}

