//WAP to check a number is niven number or not
//Niven number is a number is divisible by sum of its digit

package BasicProgramming1;

public class P20 
{
	public static void main(String[] args) 
	{
		int n=14;
		int temp=n;
		int sum=0;
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		
		if(temp%sum==0)
		{
			System.out.println("\t> "+temp+ " It is a niven number");
		}
		
		else
		{
			System.out.println("\t> "+temp+ " It is not a niven number");
		}
	}
}