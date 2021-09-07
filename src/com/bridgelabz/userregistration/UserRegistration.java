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
		public static void checkEmail(String email) {
			boolean isEmail;
			Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
			Matcher matcher = pattern.matcher(email);
			isEmail = matcher.matches();
			if(checkFirstName(email)) 
				System.out.println("valid");
			else 
				System.out.println("Invalid");
		}
		public static boolean checkMobileNumber(String mobileNumber) {
			Pattern pattern = Pattern.compile("^[0-9]{2}[\s][0-9]{10}$");
			Matcher matcher = pattern.matcher(mobileNumber);
			return matcher.matches();
		}
		public static boolean checkPassword(String password) {
			Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])([a-zA-Z]*[@#$%^&-+=()])*(?=.*[0-9]).{8,}$");
			Matcher matcher = pattern.matcher(password);
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
				/*if(checkEmail(email)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");*/
				
				System.out.println("enter mobile number:");
				String mobileNumber = scanner.nextLine();
				if(checkMobileNumber(mobileNumber)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");
				
				System.out.println("enter  password:");
				String password = scanner.nextLine();
				if(checkPassword(password)) 
				System.out.println("valid");
				else 
					System.out.println("Invalid");
				scanner.close();
				System.out.println(" Valid Emails");
				
				email = "abc@bridgelabz.co.in";
				checkEmail(email);
				email = "abc@gmail.com.com";
				checkEmail(email);
				
				email = "abc@yahoo.com";
				checkEmail(email);
				
				email = "abc@1.com";
				checkEmail(email);
				
				email = "abc-100@yahoo.com";
				checkEmail(email);
				
				email = "abc.100@yahoo.com";
				checkEmail(email);
				
				email = "abc111@abc.com";
				checkEmail(email);
				
				email = "abc-100@abc.net";
				checkEmail(email);
				
				email = "abc.100@abc.com.au";
				checkEmail(email);
				
				email = "abc+100@gmail.com";
				checkEmail(email);
				
				System.out.println();

				System.out.println("Invalid Emails");
				
				email = ".abc@abc.com";
				checkEmail(email);
				
				email = "abc";
				checkEmail(email);

				email = "abc@.com.my";
				checkEmail(email);

				email = "abc@abc@gmail.com";
				checkEmail(email);
				
				email = "abc()*@gmail.com";
				checkEmail(email);

				email = "abc..2002@gmail.com";
				checkEmail(email);

				email = "abc.@gmail.com";
				checkEmail(email);

				email = "abc123@.com";
				checkEmail(email);

				email = "abc123@.com.com";
				checkEmail(email);

				email = "abc123@gmail.a";
				checkEmail(email);

				email = "abc@%*.com";
				checkEmail(email);

				email = "abc@gmail.com.1a";
				checkEmail(email);

				email = "abc@gmail.com.aa.au";
				checkEmail(email);
			
			}

		}
	
