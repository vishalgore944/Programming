package Patterns5;

public class P11
{
	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++) 
		{
			for(int c=1;c<=5;c++) 
			{
				if(r>=c) 
				{
					System.out.print(c+" ");
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
