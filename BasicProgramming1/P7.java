//find Factors of numbers the number which is divisible by other number with remainder is 0
package BasicProgramming1;
import java.util.Scanner;
public class P7 
{
	public static void main(String[] args) 
	{
		int b=6;
		for(int i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				System.out.println(i);
			}
		}
		fact();
		scan();
	}
	
	public static void fact()
	{
		int a=6;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println("\t> "+i);
				System.out.println(" "
						+ "");
			}
		}
	}
	
	public static void scan() 
	{
		Scanner sc=new Scanner(System.in);
        System.out.print("\t> Enter number to find factors: ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println("\t> "+i);
            }
        }	
	}
}