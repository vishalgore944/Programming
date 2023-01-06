//Take character input
package BasicProgramming;

import java.util.Scanner;

public class P3 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the character: ");
			char ch=sc.next().charAt(0); //It takes only single character from user (String)
			System.out.print("The entered character is: ");
			System.out.println(ch);
		}
}
