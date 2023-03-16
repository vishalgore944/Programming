//Types of array
//Multi-dimensional arrays:
		//It is also know as arrays of arrays, in this we have various types like 
			//2D array, 3D array and so on
		//int[] a,b; --> a-1D,b-1D
		//int a[],b; --> a-1D,b is int data type
		//int[][] a; a-2D	
		//int[] a[],b; a-2D,b-1D
		//int[][] a,b; a-2D,b-2D
		//int[][] a,b[];a-2D,b-3D
		//int[][] a,[]b; Syntax error

		//declaration and initialization of 2D Array
		//Syntax: datatype[][] var={{v1,v2,v3},{v1,v2,v3},{v1,v2}};
			//ex: int [][] a={{1,2,3},{4,5,6},{7,8,9}};
		//Syntax: datatype[][] var=new datatype [Outer size] [inner size];

package AnimeshSir;

public class P4 
{
	public static void main(String[] args) 
	{
		int [][] a={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a);
		System.out.println(a[0]);
		System.out.print(a[0][0]+" ");
		System.out.print(a[0][1]+" ");
		System.out.println(a[0][2]);
	
		
		for (int i = 0; i < a[0].length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}