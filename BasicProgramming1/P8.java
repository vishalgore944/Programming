//WAP sum of all the factors of a number 
package BasicProgramming1;

import java.util.Scanner;

public class P8 
{
	public static void main(String[] args) 
		{
			int b=10;
			int sum =0;
			for(int i=1;i<=b;i++)
			{
				if(b%i==0)
				{
					sum=sum+i;
					System.out.println(i);
				}
			}
			System.out.println(" "
					+ " ");
			System.out.println(sum);
			
			fact();
		}
	
	public static void fact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter number to sum the factors of that number: ");
		int b=sc.nextInt();
		int sum=0;
		for(int i=1;i<=b;i++)
		{	if(b%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("\t> Sum is: "+sum);
	}
}