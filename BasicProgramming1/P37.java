//WAP to find all the ArmStrong number from 1 to 1000

package BasicProgramming1;

public class P37 
{
	public static void main(String[] args) 
	{
		for(int n=1;n<=1000;n++)
		{
		int temp =n,sum=0,count=(countOfDigits(n));
		
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+pow(d,count);
			n=n/10;
		}
		
		if (sum==temp) 
		{
			System.out.println(temp);
		} 
		
		n=temp;
		}
	}
	
	public static int pow(int n,int p) 
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		
		return res;
	}
	
	public static int countOfDigits(int n) 
	{
		int count=0;
		while (n!=0) 
		{
			count++;
			n=n/10;
		}
		return count;
	}
}
