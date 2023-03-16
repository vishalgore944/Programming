//WAP to convert decimal number to octal number

package NumberConversion2;

public class P2 
{
	public static void main(String[] args) {
		int n=12;
		String res="";
		while (n!=0) 
		{
			int r=n%8;
			res=r+res;
			n=n/8;
		}
		System.out.println(res);
	}	
}