//Print all the odd digits from the number
package BasicProgramming1;

public class P16 
{
	public static void main(String[] args) 
	{
		int n=3567;
		while(n!=0)
		{
			int d=n%10;
//			System.out.println(d);
			if(d%2!=0)
			{
				System.out.println("\t> "+d);
			}
			n=n/10;
		}
	}
}