//WAP to print matrix and transpose of matrix

package AnimeshSir;

public class P7 
{
	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Matrix \n");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		System.out.println("Transpose of Matrix \n");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
}