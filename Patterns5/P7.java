package Patterns5;

public class P7 
{
	public static void main(String[] args) 
	{
		for(int c=1;c<=5;c++) 
		{
			for(int r=1;r<=5;r++) 
			{
				if(r==1 || r==3 || (c==1 && r<=3) || (c==5 && r<=3) || (c==3 && r>=3)) 
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