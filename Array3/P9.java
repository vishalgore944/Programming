//Insertion Operation at middle
//all the elements move
//3 variables needed
//1. Create new array

package Array3;

import java.util.Arrays;

public class P9 
{	
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		a=add(3,9,a);
		System.out.println(Arrays.toString(a));
		a=add(2,17,a);
		System.out.println(Arrays.toString(a));
		a=add(0,15,a);
		System.out.println(Arrays.toString(a));
//		a=add(-5,65,a);
//		System.out.println(Arrays.toString(a));
//		a=add(100,65,a);
//		System.out.println(Arrays.toString(a));
	}
	
	public static int[] add(int index,int element,int[] a)
	{
		if(index<0 || index>a.length)
		{
			System.out.println("Index not found");
			return a;
		}
		int[] b=new int[a.length+1];
		for (int i = 0; i < a.length; i++) {
			if (i<index) 
			{
				b[i]=a[i];
			}
			
			else 
			{
				b[i+1]=a[i];
			}
		}
		b[index]=element;
		return b;
	}
}