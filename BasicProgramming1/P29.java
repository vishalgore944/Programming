//WAP To check the number is perfect square or not
package BasicProgramming1;

public class P29 
{
	public static void main(String[] args) 
	{
		int n=81;
		boolean b=false;
		for(int i=1;i*i<=n;i++)
		{
			if(i*i==n)
			{
				b=true;
				System.out.println("Perfect square");
			}
		}
		if(b==false)
		{
			System.out.println("Not a perfect square");
		}
	}
}
