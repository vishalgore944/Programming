//WAP to convert decimal number to binary number

package NumberConversion2;

public class P1 
{
	public static void main(String[] args) 
	{
		int n=12;
		String res="";
		while (n!=0)
		{
			int r=n%2;
			res=r+res;
			n=n/2;
		}
		
		System.out.println(res);
	}
}
