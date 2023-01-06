//WAP to find Product/Factorial of all the number in the range 1-5

package BasicProgramming1;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) 
	{
		int product=1;
		for(int i=1;i<=10;i++)
		{
			product=product*i;
			System.out.println("Factorial of "+i+"! :"+product);
		}
		
		prod();
	}
	
	//Factorial of range
	public static void prod()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter starting range for factorial: ");
		int a=sc.nextInt();

		System.out.print("\t> Enter end range for factorial: ");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			int prod=1;
			for(int j=1;j<=i;j++)
			{
				prod=prod*j;				
			}
			System.out.println("Factorial of: "+prod);
		}		
	}
	
	
	
}
