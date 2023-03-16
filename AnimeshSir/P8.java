//WAP to find sum of rows

package AnimeshSir;

public class P8
{
	public static void main(String[] args) 
	{
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Matrix \n");
		for (int i = 0; i < a.length; i++) 
		{
			int sum=0;
			for (int j = 0; j < a[0].length; j++) 
			{
				sum=sum+a[i][j];
			}
			
			System.out.println(" "+i+1+" "+sum);
			
		}
	}
}