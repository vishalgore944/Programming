//Perfect number> sum of all the factors of that number exluding that number is equal to original number
//WAP to check if the number is a perfect number or not
package BasicProgramming1;

import java.util.Scanner;

public class P14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter a number to check it is perfect number or not: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==n) 
		{
			System.out.println("\t> "+n+" It is a perfect number");
		} 
		else 
		{
			System.out.println("\t> "+n+" It is not perfect number");
		}
	}
}