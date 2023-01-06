//WAP to find a sum of all the digits of a number until sum is a single digit number
//55>5+5=10>1+0=1

package BasicProgramming1;

public class P35
{
	public static void main(String[] args) 
	{
		int n=25486745;
		int sum=0;
		while(n!=0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println(sum);
	}	
}
