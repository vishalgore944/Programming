//WAP to find sum of all the  even digits of a number
package BasicProgramming1;

public class P19 
{

	public static void main(String[] args) 
	{
		int n=558425721;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
//			System.out.println(d);
			if(d%2==0)
			{
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println(sum);
	}
}
