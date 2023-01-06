//Wap to swap two numbers 
package BasicProgramming1;

public class P10 
{
	public static void main(String[] args) 
	{
		int a=15;
		int b=9;
		int c=0;
		System.out.println("Before Swap: a="+a);
		System.out.println("Before Swap: b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swap: a="+a);
		System.out.println("After Swap: b="+b);
		System.out.println(" "
				+ "");
		
		swap();
	}
	public static void swap() 
	{
		int a=15;
		int b=9;
		System.out.println("Before Swap: a="+a);
		System.out.println("Before Swap: b="+b);
		a=a+b;//3+7
		b=a-b;//10-7
		a=a-b;//10-3
		System.out.println("After Swap: a="+a);
		System.out.println("After Swap: b="+b);	
		System.out.println(" "
				+ "");
	
		swap1();
	}
	
	public static void swap1() 
	{
		int a=5;
		int b=9;
		int c=0;
		System.out.println("Before Swap: a="+a);
		System.out.println("Before Swap: b="+b);
		c=b; 
		b=a;
		a=c;
		System.out.println("After Swap: a="+a);
		System.out.println("After Swap: b="+b);
		System.out.println("  "
				+ "");
	
		swap2();
	}
	
	public static void swap2() 
	{
		int a=10;
		int b=2;
		System.out.println("Before Swap: a="+a);
		System.out.println("Before Swap: b="+b);
		a=a+b;//12 10+2
		b=a-b;//10 10-2
		a=a-b;//2  12-10
		System.out.println("After Swap: a="+a);
		System.out.println("After Swap: b="+b);
	}
}