//Updation to add a new element

package Array3;

import java.util.Arrays;

public class P10 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		int index=2;
		int element=17;
		a=update(index,element,a);
		System.out.println(Arrays.toString(a));
		index=3;
		element=5654;
		a=update(index,element,a);
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] update(int index,int element,int[] a) 
	{
		if(index<0 || index>=a.length)
		{
			System.out.println("Index not found");
			return a;
		}
		a[index]=element;
		return a;
	}
	
}

