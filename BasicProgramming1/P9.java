//WAP to find first 10 numbers of fibonacci series

package BasicProgramming1;

public class P9 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int d=8;
		System.out.print(" "+a);		
		System.out.print(" "+b);
		for(int i=1;i<=d;i++)
		{
			int c=a+b;	
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println(" ");
		fib();
	}
	
	public static void fib()
	{
		int a=0;
		int b=1;
		int d=8;
		int c=0;
		System.out.print(" "+a);
		System.out.print(" "+b);
		for(int i=1;i<=d;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}