//Wap to find sum of all the number from digit separated
package BasicProgramming1;

public class P17 
{
	public static void main(String[] args) 
	{
		int n=452;
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("\t> "+ sum);
	}
}
