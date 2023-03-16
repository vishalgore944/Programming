//WAP to get input from user for array.

package Array3;

import java.util.Scanner;

public class P3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("==========================================");
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print("Enter the element of the array: ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("==========================================");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
