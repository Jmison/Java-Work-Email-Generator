package realWorldChallenges;

import java.util.Scanner;

/*
 * JAVA-WORK-EMAIL-GENERATOR created by Jamison Nixon
 * 
 * This application generates a work email address for the user. The user will insert their name, place of employment, and position into the application then it will output thier 
 * created email address. A random password is also generated, with giving the user the option to keep the password or change it to one of their liking. An authentic alternative
 * email address is needed as well.
 */
public class EmailApp {
	static Scanner scanner = new Scanner(System.in);
	public static void main (String[]arg) {
		System.out.println("Welcome to your company's Email generator. Let's begin shall we?");
		
		//Department 
		Email.selectDepartment();
		
		//Name + Email Generator
		Email.selectName();
		
		//Random Password
		System.out.println(Email.randomPassword());
		
		//space
		System.out.println();
		
		//Alternative Email
		Email.altEmail();
		
		//Preset Email Mailbox Capacity
		Email.capacity();
		
		//Change Password
		Email.changePassword();
	}
}
