//WAP to print a all perfect square from 1 to 100
package BasicProgramming1;

public class P30 
{
	public static void main(String[] args) 
	{
		for(int n=1;n<=100;n++)
		{
			boolean b=false;
			for(int i=1;i*i<=n;i++)
			{
				if(i*i==n)
				{
					b=true;
					System.out.println(n+" Is a perfect square");
				}
			}
		}
	}
}