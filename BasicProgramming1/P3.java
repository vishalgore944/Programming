//Wap to find sum of all the number in the rane 1 to 5
package BasicProgramming1;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) 
	{
		int b=5;
		int sum=0;
		for(int a=1;a<=b;a++)
		{
			sum+=a;
		}
		System.out.println(sum);
		
		sum();
	}
	public static void sum()
	{
		System.out.print("\t> Enter number for start range: ");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		System.out.print("\t> Enter numbr for end range: ");
		int d=sc.nextInt();
		int ad=0;
		for(int a=c;a<=d;a++)
		{
			ad=ad+a;
		}
		System.out.print("\t> Addition of range is: "+ad);
	}
}
