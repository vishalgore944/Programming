//WAP to find smallest element

//Selection sort

package Array3;

public class P14 
{
	public static void main(String[] args) 
	{
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

		int[] a= {7,8,1,4,3};
		int small=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println(small);
	}
}
