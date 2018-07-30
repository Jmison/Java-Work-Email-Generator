package realWorldChallenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Email {
	static Scanner scanner = new Scanner(System.in);
	//variables user(s) will establish, mailbox capacity preset
	private static String firstName;
	private static String lastName;
	private static String password;
	private static String department;
	private static int mailboxCapacity;
	private static String altEmail;
	private static String email;
	
	//constructor 
	public Email(String firstName, String lastName, String password, String department, int mailboxCapacity, String alternativeEmailAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.department = department;
		this.mailboxCapacity = mailboxCapacity;
		this.altEmail = altEmail;
	}
	
	//Generation of random password method
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*+"; 	//letters, numbers, special characters allowed
	private static String tempPassword;
	public static String randomPassword() {
		//the usual password char limit is 12-16, I went with 12
		int count = 12;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		tempPassword = builder.toString();
		return "Your temporary password: " + tempPassword;
	}
	
	//Department method
	public static void selectDepartment() {
		System.out.println("What department do you work for? (Please use one word only, special characters are not allowed.)");
		department = scanner.nextLine();
		while (	  
				//illegal characters, program will notice user placed one of these characters and will shoot an error message
				   (department.contains(" ")) 
				|| (department.matches(".*\\d+.*")) //searches for numbers
				|| (department.matches("")) 
				|| (department.contains("!")) 
				|| (department.contains("@"))	
				|| (department.contains("#")) 
				|| (department.contains("$")) 
				|| (department.contains("%")) 
				|| (department.contains("^"))
				|| (department.contains("&")) 
				|| (department.contains("*")) 
				|| (department.contains("[")) 
				|| (department.contains("{")) 
				|| (department.contains("]"))
				|| (department.contains("}")) 
				|| (department.contains("|")) 
				|| (department.contains(";")) 
				|| (department.contains(":"))
				|| (department.contains("'")) 
				|| (department.contains("<")) 
				|| (department.contains(">")) 
				|| (department.contains(",")) 
				|| (department.contains("."))
				|| (department.contains("?")) 
				) {
			//error message, try again
		System.out.println("ERROR MESSAGE: Please type your department without numbers, and with hypens if it contains more than one word." + '\n');
		System.out.println("What department do you work for? (Please use one word, or hypens only.)");
		department = scanner.nextLine();
		}
		System.out.println("Department: " + department);
	}
	
	//Name, Company, Email method
	public static void selectName() {
		String company;
		//establishing user's First name
		System.out.println("What is your first name?");
		firstName = scanner.nextLine();
		while (    
				//illegal characters, program will notice user placed one of these characters and will shoot an error message
				   (firstName.contains(" "))
				|| (firstName.matches(".*\\d+.*")) //searches for numbers
				|| (firstName.matches(""))	
				|| (firstName.contains("!")) 
				|| (firstName.contains("@"))	
				|| (firstName.contains("#")) 
				|| (firstName.contains("$")) 
				|| (firstName.contains("%")) 
				|| (firstName.contains("^"))
				|| (firstName.contains("&")) 
				|| (firstName.contains("*")) 
				|| (firstName.contains("[")) 
				|| (firstName.contains("{")) 
				|| (firstName.contains("]"))
				|| (firstName.contains("}")) 
				|| (firstName.contains("|")) 
				|| (firstName.contains(";")) 
				|| (firstName.contains(":"))
				|| (firstName.contains("'")) 
				|| (firstName.contains("<")) 
				|| (firstName.contains(">")) 
				|| (firstName.contains(",")) 
				|| (firstName.contains("."))
				|| (firstName.contains("?")) 
				) {
			//error message, try again
			System.out.println("ERROR MESSAGE: Please use no numbers, no spaces, or special characters within your first name. If you have more than one first name; please use one, add no spaces, or use a hypen." + '\n');
			System.out.println("What is your first name?");
			firstName = scanner.nextLine();
		}
		//establishing user's Last name
		System.out.println("What is your last name?");
		lastName = scanner.nextLine();
		while (	   
				//illegal characters, program will notice user placed one of these characters and will shoot an error message
				   (lastName.contains(" "))
				|| (lastName.matches(".*\\d+.*")) //searches for numbers
				|| (lastName.matches(""))	
				|| (lastName.contains("!")) 
				|| (lastName.contains("@"))	
				|| (lastName.contains("#")) 
				|| (lastName.contains("$")) 
				|| (lastName.contains("%")) 
				|| (lastName.contains("^"))
				|| (lastName.contains("&")) 
				|| (lastName.contains("*")) 
				|| (lastName.contains("[")) 
				|| (lastName.contains("{")) 
				|| (lastName.contains("]"))
				|| (lastName.contains("}")) 
				|| (lastName.contains("|")) 
				|| (lastName.contains(";")) 
				|| (lastName.contains(":"))
				|| (lastName.contains("'")) 
				|| (lastName.contains("<")) 
				|| (lastName.contains(">")) 
				|| (lastName.contains(",")) 
				|| (lastName.contains("."))
				|| (lastName.contains("?")) 
				) {
			//error message, try again
			System.out.println("ERROR MESSAGE: Please use no numbers, no spaces, or special characters within your last name. If you have more than one last name; please use one, add no spaces, or use a hypen." + '\n');
			System.out.println("What is your last name?");
			lastName = scanner.nextLine();
		}
		//pieces together user's First and Last name
		String fullName = firstName + " " + lastName;
		System.out.println("Full Name: "  + fullName);
	
		//asks user what company they work for
		System.out.println("What company do you work for?");
		company = scanner.nextLine();
		while (	  
				//illegal characters, program will notice user placed one of these characters and will shoot an error message
				   (company.contains(" ")) 
				|| (company.matches(""))
				|| (company.contains("!")) 
				|| (company.contains("@"))	
				|| (company.contains("#")) 
				|| (company.contains("$")) 
				|| (company.contains("%")) 
				|| (company.contains("^"))
				|| (company.contains("&")) 
				|| (company.contains("*")) 
				|| (company.contains("[")) 
				|| (company.contains("{")) 
				|| (company.contains("]"))
				|| (company.contains("}")) 
				|| (company.contains("|")) 
				|| (company.contains(";")) 
				|| (company.contains(":"))
				|| (company.contains("'")) 
				|| (company.contains("<")) 
				|| (company.contains(">")) 
				|| (company.contains(",")) 
				|| (company.contains("."))
				|| (company.contains("?"))
				) {
			//error message, try again
			System.out.println("ERROR MESSAGE: Please type your company with hypens if it contains more than one word.");
			System.out.println("--------------------------------------------------------------------------------------------------------------");
			System.out.println("What company do you work for? (Please use one word, or hypens only.)");
			company = scanner.nextLine();
		}
		System.out.println("Current Company: " + company);
		//generates user's company email address, with First name + Last name + Company
		email = firstName + "." + lastName + "@" + department + "." + company + ".com";
		System.out.println("Company created email address is: " + email + " ✔");
	}
	
	//preset Mailbox Capacity
	public static void capacity() {
		mailboxCapacity = 1_000;
		System.out.println("Current Mailbox Capacity: " + mailboxCapacity);
	}
	
	//Alternative Email method
	public static void altEmail() {
		System.out.println("Please establish an alternative email address, incase you forget your password, etc.");
		altEmail = scanner.nextLine();
		while (   
				//illegal characters, program will notice user placed one of these characters and will shoot an error message
				   (altEmail.contains(" ")) 
				|| (altEmail.matches(email)) //must not match company email
				|| (!altEmail.contains("@")) //must contain
				|| (altEmail.matches("")) 
				|| (!altEmail.contains(".")) //must contain
				|| (altEmail.contains("!")) 
				|| (altEmail.contains("#")) 
				|| (altEmail.contains("$")) 
				|| (altEmail.contains("%")) 
				|| (altEmail.contains("^"))
				|| (altEmail.contains("&")) 
				|| (altEmail.contains("*")) 		
				|| (altEmail.contains("[")) 
				|| (altEmail.contains("{")) 
				|| (altEmail.contains("]"))
				|| (altEmail.contains("}")) 
				|| (altEmail.contains("|")) 
				|| (altEmail.contains(";")) 
				|| (altEmail.contains(":"))
				|| (altEmail.contains("'")) 
				|| (altEmail.contains("<")) 
				|| (altEmail.contains(">")) 
				|| (altEmail.contains(",")) 
				|| (altEmail.contains("?"))
				) {
			//error message, try again
			System.out.println("ERROR MESSAGE: Invalid email address, please try again." + '\n');
			altEmail = scanner.nextLine();
			System.out.println("Alternative Email Address saved as: " + altEmail + " ✔");
		}
	}
	
	//changing Password method
	public static void changePassword() {
		System.out.println("Would you like to change the temporary password sent to you? (Yes/No)");
		String answer = scanner.nextLine();
		if ((answer.equalsIgnoreCase("yes")) || (answer.equalsIgnoreCase("y"))) {
			System.out.println("User would like to change password.");
			System.out.println("Please enter your new password, you will need atleast one special character and one number. Spaces are not accepted." + '\n');
			password = scanner.nextLine();
			while (	  
					//if password is blank, or contains a space error message will occur
					   (password.contains(" ")) 
					|| (password.matches(""))
					//special characters allowed, if one is not found error message will occur 
					|| !(password.contains("!")) 
					&& !(password.contains("@"))	
					&& !(password.contains("#")) 
					&& !(password.contains("$")) 
					&& !(password.contains("%")) 
					&& !(password.contains("^"))
					&& !(password.contains("&")) 
					&& !(password.contains("*")) 
					&& !(password.contains("-")) 
					&& !(password.contains("+")) 
					&& !(password.contains("_")) 
					&& !(password.contains("=")) 
					//numbers allowed, if one is not found error message will occur 
					|| !(password.contains("0")) 
					&& !(password.contains("1")) 
					&& !(password.contains("2")) 
					&& !(password.contains("3")) 
					&& !(password.contains("4")) 
					&& !(password.contains("5")) 
					&& !(password.contains("6")) 
					&& !(password.contains("7")) 
					&& !(password.contains("8")) 
					&& !(password.contains("9")) 
					){
				//error message, try again
				System.out.println("ERROR MESSAGE: Your password may not contain a space. Please insert a new password.");
				password = scanner.nextLine();
			}
			System.out.println("Password has successfully been changed to: " + password + " ✔");
		} else if ((answer.equalsIgnoreCase("no")) || (answer.equalsIgnoreCase("n"))) {
			System.out.println("User would not like to change password.");
			password = tempPassword;
			System.out.println("Passowrd: " + password);
		} else {
			//"Would user like to change password (Y/N)?" question error message
			System.out.println("Error Occuried, Try Again Please.");
		}
	}
}
