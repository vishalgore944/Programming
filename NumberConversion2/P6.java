//Binary to octal
//1. Bin to desimal
//2. desimal to octal
//1100 > desc > Octal

package NumberConversion2;

public class P6 
{
	public static void main(String[] args) 
	{
		int n=1100;
		int sum=0;
		int power=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d*pow(2,power);
			power++;
			n=n/10;
		}
		System.out.println(sum);

		String res="";
		
		while(sum!=0)
		{
			int r=sum%8;
			res=r+res;
			sum=sum/8;
		}
		System.out.println("Octal "+res);	
	}
	
	public static int pow(int n,int p) 
	{
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*n;
		}
		
		return res;
	}
}
