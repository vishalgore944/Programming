//WAP to check the enteres String is valid or not
package String4;

import java.util.Scanner;

public class P23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your email: ");
		String email=sc.nextLine();
		if(email.endsWith("@jspiders.com"))
		{
			System.out.println("Valid email ID");
		}
		else 
		{
			System.out.println("Enter valid email ID");
		}
		System.out.print("Enter a contact number: ");
		String contact=sc.nextLine();
		if(contact.startsWith("+91"))
		{
			System.out.println("Contact number is valid");
		}
		else 
		{
			System.out.println("Enter valid contact number");
		}
	}
}