//WAP to count total number of digits in a number

package BasicProgramming1;

public class P31 
{
	public static void main(String[] args) 
	{
		long n=12899;
		int count=0;
		while(n!=0)
		{
//			double d=n%10;
			count++;
			n=n/10;
		}
		System.out.println(count);
	}
}