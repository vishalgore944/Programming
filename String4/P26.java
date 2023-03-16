//WAP to sort all the String in lexographical (Alphabetical) Order

package String4;

import java.util.Arrays;

public class P26 
{
	public static void main(String[] args) 
	{
		String[] a= {"Welcome","Hi","Bye","Hello"};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}
}
