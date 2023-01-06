//WAP to print all odd number from 11-20
package BasicProgramming1;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) 
	{
//		for(int a=11;a<=20;a++)
//		if(a%2!=0)
//		{
//			System.out.println(a);
//		}
		demo(); 
	}
	
	public static void demo() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\t> Enter start range for odd number: ");
		int b=sc.nextInt();
		System.out.println("\t> Enter end range for odd number: ");
		double c=sc.nextDouble();
		for(int a=b;a<=c;a++)
		if(a%2!=0)
		{
			System.out.println(a);
		}
	}
}