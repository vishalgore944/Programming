//WAP to Print number from 5 to 10 Using scenner class
package BasicProgramming1;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) 
	{
		for(int a=5;a<=10;a++)
		{
			System.out.println(a);
		}
		print();
	}

	public static void print()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter starting range for print: ");
		int b=sc.nextInt();
		System.out.print("\t> Enter ending range for print: ");
		int c=sc.nextInt();
		for(int a=b;a<=c;a++)
		{
			System.out.println(a);
		}
	}
}
