//WAP to find a armstrong Number


//Sum of each digits is raise to the total number of digits
//153
//1+5+3 digits raise to the number of digits
//1.Count the total number of digits
//2.Separate the digits
//3.power
//4.sum
//5.Compare

package BasicProgramming1;

public class P36 
{
	public static void main(String[] args) 
	{
		int n=371;
		int temp =n;
		int sum=0;
		int count=(countOfDigits(n));
	
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+pow(d,count);
			n=n/10;
		}
		
		if (sum==temp) 
		{
			System.out.println("ArmStrong number");
		} 
		
		else 
		{
			System.out.println("Not an ArmStrong number");
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

















