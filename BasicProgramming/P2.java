//Take string input from user
package BasicProgramming;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=sc.nextLine();
//		String name=sc.next(); in takes first string from input
		System.out.print("The entered name is: ");
		System.out.println(name);
	}
}
