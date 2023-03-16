//WAP to find sum of all the rows and sum of all the column

package AnimeshSir;

public class P9 
{
	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Matrix row column addition \n");
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			int col=0;
			for (int j = 0; j < a[0].length; j++) 
			{
//					System.out.print(a[i][j]+" ");
					sum=sum+a[i][j];  //row sum
					col=col+a[j][i]; //column
			}
			
//			System.out.println();
			System.out.println("Sum of row "+" "+sum);
			System.out.println("Sum of column "+" "+col);
		}
	}
}
