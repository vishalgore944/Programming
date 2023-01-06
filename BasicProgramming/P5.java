//Print 16 11 6 1 -4 1 6 11 16 
package BasicProgramming;

public class P5 {
	public static void main(String[] args) 
	{
		demo(16);
	}
	
	public static void demo(int n)
	{
		if(n!=-4)
		{
			System.out.print(n+" ");
			demo(n-5);
		}
		System.out.print(n+" ");
	}
}
