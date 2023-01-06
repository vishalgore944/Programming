//Strong number the sum of factorials of all the digits is equal to the original number is a Strong number
//145
//1!+4!+5!=145
//Separate digits> factorial> Sum> Compare
package BasicProgramming1;

import java.util.Scanner;

public class P21 
{
	public static void main(String[] args) 
	{
		int n=145;
		int temp=n;
		int sum=0;
		while (n!=0) 
		{
			int d=n%10;
			int fact=1;
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		if (sum==temp) 
		{
			System.out.println(temp+" Is strong number");
		}
		
		else 
		{
			System.out.println(temp+" Is not a strong number");
		}
	  strong();
	}
	
	public static void strong() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Entere a number to check it is strong number or not: ");
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		while (n!=0) 
		{
			int d=n%10;
			int fact=1;
//			System.out.println(d);
			for(int i=1;i<=d;i++)
			{
				fact=fact*i;
			}
//			System.out.println(fact);
			sum=sum+fact;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" Entered number is strong");
		}
		
		else {
			System.out.println(temp+" Entered number is not a strong number");
		}
	}
}

































