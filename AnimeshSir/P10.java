//Wap to find the sum of all digonal digits in the matrix Primary digonal

package AnimeshSir;

public class P10 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.println();
		System.out.print("Sum of diagonal is: "+sum);
	}
}
