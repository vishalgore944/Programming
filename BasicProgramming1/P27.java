//WAP to print all the palindrome number between 1 to 1000

package BasicProgramming1;

public class P27 
{
	public static void main(String[] args) 
	{
		
		for(int n=1;n<=1000;n++)
		{
			int temp=n;
			int rev=0;
			while (n!=0) 
			{
				int d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			n=temp;

			if(temp==rev)
			{
				System.out.println(rev);
			}
			
		}
	}
}
