package String4;

import java.util.Arrays;

public class P27 
{
	public static void main(String[] args)
	{
		int[] a= {10,9,5,8,5,3,7};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
