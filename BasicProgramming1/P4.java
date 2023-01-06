//WAP to find product of all the even number in the range 1 to 10
package BasicProgramming1;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) 
	{
		int b=10;
		int prod=1;
		for(int a=1;a<=b;a++)
		{
			if(a%2==0)
				{
				prod=prod*a;
				}
		}
		System.out.println(prod);	
		
		prod();
	}
	
	public static void prod()
	{
		System.out.print("\t Enter start range for multiplication: ");
		Scanner sc =new Scanner(System.in);
		int s=sc.nextInt();
		System.out.print("\t Enter end range for multiplication: ");
		int b=sc.nextInt();
		int prod=1;
		for(int a=s;a<=b;a++)
		{
			if(a%2==0)
				{
				prod=prod*a;
				}
		}
		System.out.println(prod);
		
	}
}
