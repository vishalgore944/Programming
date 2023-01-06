//Wap to find all the prime numbers in the range of 1 to 100
package BasicProgramming1;

public class P12 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" It is prime number");
			}
		}
		
	}
}
