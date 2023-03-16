//Multiplication of matrices
//first row multilpy with first col =sum 
//First element first row multiply with first column and sum3

package Array3;

public class P23 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] c=new int[3][3];
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				c[i][j]=0;
				for (int k = 0; k < c[j].length; k++) 
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		matadd();
	}	
	
	public static void matadd() 
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b= {{1,2,1},{1,3,1},{0,1,1}};
		
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b.length; j++) 
			{
				int sum=0;
				for (int k = 0; k < b.length; k++) 
				{	
					sum=sum+a[i][k]*b[k][j];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}




















