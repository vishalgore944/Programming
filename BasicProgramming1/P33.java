//Special number 
//addition of the 1>sum of digits and 2>product of digits is equal to the original number 
//26
//2+6=8
//2*6=12
//    20
//26==Original number

package BasicProgramming1;

public class P33 
{
	public static void main(String[] args) 
	{
		int n=11;
		int temp=n;
		int sum=0;
		int prod=1;
		int add=0;
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+d;
			
			prod=prod*d;
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(prod);
		add=sum+prod;
		System.out.println(add);
		
		if(temp==add)
		{
			System.out.println("Special number");
		}
		
		else {
			System.out.println("Not a special number");
		}
		
	}
}
