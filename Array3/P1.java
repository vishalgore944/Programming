//WAP to print the all the elements of array

package Array3;

public class P1 
{
	public static void main(String[] args) 
	{
		int[] a= {10,20,30,40,50};
		System.out.println("=======================For loop========================");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		System.out.println("===========	============While loop========================");
		int j=0;
		while(j < a.length) 
		{
			System.out.println(a[j]);
			j++;
		}
		
		System.out.println("=======================Do while loop========================");
		int k=0;
		do 
		{
			System.out.println(a[k]);
			k++;
		}
		while(k < a.length);
		
		System.out.println("=======================For each loop========================");
		for (int i : a) 
		{
			System.out.println(i);
		}
	}
}
