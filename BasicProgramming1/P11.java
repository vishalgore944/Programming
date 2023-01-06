//Prime number the number divisible by 1 and itself and factors are only two
//prime numbers are numbers that have only 2 factors like 1 or themselves 
package BasicProgramming1;

import java.util.Scanner;

public class P11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number to check number is prime: ");
		int a=sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
				System.out.println("Factors are: "+i);
			}	
		}
		if(count==2)
		{
			System.out.println("\t> " +a+" It is a prime number.");
		}
		else
		{
			System.out.println("\t> " +a+" It is not a prime number.");
		}
	}
}