//WAP to find all the special number from 1 to 500
package BasicProgramming1;

public class P34 
{
	public static void main(String[] args) 
	{
	  for(int n=1;n<=500;n++)
	  {
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
			n=temp;

			add=sum+prod;
			if(temp==add)
			{
				System.out.println("Special number is: "+temp);
			}
	  	}
	}
}
