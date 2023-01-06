//WAP to print "Foo" if the number is divisible by 5 and "BOO" if the number is divisible by 7 and "FOOBOO" if the number is divisible by both 5 and 7 for all the number in the range 1-100
package BasicProgramming1;

import java.util.Scanner;

public class P13 
{
	public static void main(String[] args) 
	{
		for(int a=1;a<=100;a++)
		{		
			if(a%5==0)
			{
				System.out.println(a+" FOO");
			}
			
			else if(a%7==0)
			{
				System.out.println(a+" BOO");
			}
			
			if(a%5==0 && a%7==0)
			{
				System.out.println(a+" FOOBOO");
			}
		}
	}	
}