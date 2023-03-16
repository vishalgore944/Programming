//Binary to decimal

// Separate one digit from number
// Multiply the seaparated digit by base value of binary 2
// And power value will be start from 0 and incremented by 1 for each digit
//1110
//1*3 power 3 + 1*2 power 2 + 1*2 power 1 + 0*2 power 0

package NumberConversion2;

public class P4 
{
	public static void main(String[] args) 
	{
		int n=11200;
		int sum=0;
		int power=0;
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+d*pow(2,power);
			power++;
			n=n/10;
		}
		
		System.out.println(sum);
	}
	
	public static int pow(int n, int p) 
	{
		int res=1;
		for (int i=1;i<=p;i++) 
		{
			res=res*n;
		}
		return res;
	}
}