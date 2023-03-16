//WAP to print all the element in array

package AnimeshSir;

public class P5 
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
				System.out.print(a[i][j]+" ");
			}
			System.out.println();//Print in matrix form
		}
	}
}

//i=0	i<3 true
//i=1  1<3 true
//
//		j<a[i].length
//	j=0 j<3
//	j=1 1<3 true
//	j=2 2<3 true
//	j=3 3<3 false
//
//a[0][0]
//a[0][1]
//a[0][2]
//		
//		j<a[i].length
//		0<a[0].lenght
//		0<3
//	j=0 j<3
//	j=1 1<3 true
//	j=2 2<3 true
//	j=3 3<3 false
