package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 300;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "ayucompany.com";
	
	

	
// Contructor to receive the fname, lname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		//Call a method asking for the department - return the department
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);

		//Combine element to generate email
		email = firstName.toLowerCase()+""+lastName.toLowerCase()+ "@" + department +"."+ companySuffix;

	}

// Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none ");
		Scanner in =  new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice ==1) {return "sales";}
		else if (depChoice ==2) {return "dev";}
		else if (depChoice ==3) {return "acct";}
		else {return "";}
	}
	//Generate a random password
	private String randomPassword(int length) {
		String passswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand= (int) (Math.random() *passswordSet.length());
		    password[i] = passswordSet.charAt(rand);
		    
		}
		return new String(password);
		
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		}
	//get the mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;		
	}
	
	// set the alternative email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		}
	//get the alternateEmail
	public String getAlternativeEmail() {
		return alternateEmail;		
	}
	// change the passsword
	public void changePassword(String password) {
		this.password = password;
	}
	//get the alternateEmail
	public String getPassword() {
		return password;		
	}
		public String showInfo() {
			return "DISPLAY NAME:" +firstName+ " "+ lastName + "\n"+
					"COMPANY EMAIL: "+ email + "\n"+
					"MAIL BOX CAPACITY: " +mailboxCapacity +"mb";
		}
		
}
