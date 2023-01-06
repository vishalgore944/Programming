//WAP to find the result for number raise to power

package BasicProgramming1;

import java.util.Iterator;

public class P32 
{
	public static void main(String[] args) 
	{
		int n=15;
		int p=2;
		int res=1;
		
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		System.out.println(res);
	}
}
