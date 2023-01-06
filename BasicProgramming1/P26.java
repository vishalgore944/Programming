//WAP to check a number is palindrome or not

package BasicProgramming1;

public class P26 {

	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int rev=0;
		while (n!=0) 
		{
			int d=n%10;
			rev= rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("\t> Number is palindrome");
		}
		
		else
		{
			System.out.println("\t> Number is not palindrome");
		}
		pali();
	}
	
	public static void pali() 
	{
		int n=121;
		int temp=n;
		int rev=0;
		while (n!=0) 
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("\t> Number is palindrome");
		}
		
		else {
			System.out.println("\t> Number is not palindrome");
		}
	}

}




























