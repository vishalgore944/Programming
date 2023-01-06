//WAP to find largest digit in number
//largest---->Initialization will be the Smallest 0
//Smallest--->Initialization will be the Largest 9
package BasicProgramming1;

import java.util.Scanner;

public class P24 
{
	public static void main(String[] args) 
	{
		int n=12345;
		int max=0;
		while(n!=0)
		{
			int d=n%10;	
			if(d>max) 
			{
				max=d;
			}
			n=n/10;
		}
		System.out.println(max+ " Is a largest digit");
		
		small();
		larg();
		smalll();
	}
	
//Program to find smallest digit in number
	public static void small() 
	{
		int n=12345;
		int min=9;
		while (n!=0) 
		{
			int d=n%10;
			if(d<min)
			{
				min=d;
			}
			
			n=n/10;
		}
		System.out.println(min+ " Is a smallest digit");
	}
	
//Program to find largest digit in number
	public static void larg() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter a number to search largest digit: ");
		int n=sc.nextInt();
		int max=0;
		while (n!=0) 
		{
			int d=n%10;
			if(d>max)
			{
				max=d;
			}
			n=n/10;
		}
		System.out.println(max+ " Is a largest digit");
	}
	
//Program to find small digit in number
	public static void smalll() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter a number to search smallest digit: ");
		int n=sc.nextInt();
		
		int min=9;
		while (n!=0) 
		{
			int d=n%10;
			if(d<min)
			{
				min=d;
			}
			n=n/10;
		}
		System.out.println(min+ " Is a smallest digit");
	}
}
































