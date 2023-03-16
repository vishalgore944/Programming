//Find the largest element in the each row of matrix
package Array3;

class P20 
{
	public static void main(String[] args) 
	{
		int[][] a= {{1,8,7},{9,6,5},{3,8,4}};
		for (int i = 0; i < a.length; i++) 
		{
			int large=Integer.MIN_VALUE;
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.print(a[i][j]+" ");
				if(large<a[i][j])
				{
					large=a[i][j];
				}
			}
			System.out.print("largest number is: "+large);
			System.out.println();	
		}
	}
}
