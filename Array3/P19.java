//Insertion sort the elements is shifted, no swapping (selection and bubble sort)
//Select one element and compare with previous element
//If previous value is greater than selected 
//Then shift selected value to previos value position and previous value shifted to selected value position
package Array3;

import java.util.Arrays;

public class P19 
{
	public static void main(String[] args) 
	{
		int[] a= {3,2,5,1,4};
		
		for (int i = 1; i < a.length; i++) 
		{
			int temp=a[i];
			int j=i;
			while (j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
