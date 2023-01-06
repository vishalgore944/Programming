//WAP to print all niven number from 1 to 100

package BasicProgramming1;

public class P23 
{ 
	public static void main(String[] args) 
	{
		for(int n=1;n<=100;n++)
		{
			int temp=n;
			int sum=0;
			while(n!=0)
			{
				int d=n%10;
				sum=sum+d;
				n=n/10;
			}
			if(temp%sum==0)
			{
				System.out.println(temp);
			}
			n=temp;
		}
	}
}
