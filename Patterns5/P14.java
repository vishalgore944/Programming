//Print your name

package Patterns5;

public class P14 
{
	public static void main(String[] args) 
	{
		for(int r=1;r<=10;r++) 
		{
			for(int c=1;c<=10;c++) 
			{
				if(r>=c+3 || r<=c+3) 
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
