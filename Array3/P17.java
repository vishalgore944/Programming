//WAP to selection sort the alpahabets

package Array3;

import java.util.Arrays;

public class P17 
{
	public static void main(String[] args) 
	{
		char[] a= {'V','I','S','H','A','L'};
		System.out.println("Array: "+Arrays.toString(a));
		for (int i = 0; i < a.length; i++) 
		{
			int min=i;
			for (int j = 1+i; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
				min=j;
				}
			}
			
			char temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("Sorted array: "+Arrays.toString(a));
	}
}
