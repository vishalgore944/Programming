//WAP to print the transpose if a matrix

package AnimeshSir;

public class P6 
{
		public static void main(String[] args) 

		{
			int [][] a={{1,2,3},{4,5,6},{7,8,9}};	
			//i row
			//j column
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++) 
				{
					System.out.print(a[j][i]+" ");
				}
				System.out.println();//Print in matrix form
			}
		}
}