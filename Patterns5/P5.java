package Patterns5;

public class P5 
{
	public static void main(String[] args) 
	{
		for(int c=1;c<=5;c++) 
		{
			for(int r=1;r<=5;r++) 
			{
				if(r==c || r+c==6) 
				{
					System.out.print("* ");
				} 
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
