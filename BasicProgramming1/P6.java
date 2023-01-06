//Factorial of 5 to 10 product of range value
package BasicProgramming1;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) 
 {
	 for(int n=6;n<=10;n++)
	 {
		 int fact=1;
		 for (int a=1;a<=n;a++) 
			 {
				fact=fact*a;
			 }
		  System.out.println("Factorial of "+n+"!: "+fact);
	 }
System.out.println(""
		+ " ");
	 fac();
 }

	
	public static void fac()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\t> Enter starting range for factorial: ");
		int a=sc.nextInt();
		System.out.print("\t> Enter ending range for factorial: ");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("\t> Factorial of "+i+"!: "+fact);
		}
	}
}