//Selection sort
//Select 0 index and search for the smallest element
//Swap the selected element with index
//a{3,5,4,2,1}
//For one element we swap once
package Array3;

import java.util.Arrays;

public class P16 
{
	public static void main(String[] args) 
	{
		int[] a= {4,5,6,3,1,2};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
