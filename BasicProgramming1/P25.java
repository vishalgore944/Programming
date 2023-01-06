// WAP to print the Reverse value of the number

//Separate digit>>Change position>>Add the digit
package BasicProgramming1;

public class P25 {

	public static void main(String[] args) 
	{
		int n=12345;
		int rev=0;
		while (n!=0) 
		{
			int d=n%10;
			rev= rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
	}
}
