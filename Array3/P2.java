//WAP to print all the even element from the array

package Array3;

public class P2 
{
	public static void main(String[] args) 
	{
		int[] a= {1,8,3,4,5,6};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
