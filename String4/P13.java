//toCharArray() return type charArray(char[]) it conver String into array
//split() return type is StringArray(String[])

//Welcome to Mettel convert this string into Mettel to Welcome

package String4;

import java.util.Scanner;

public class P13 
{
	public static void main(String[] args) 
	{
		String s="Welcome to mettel";
		String[] a=s.split(" ");
//		String[] b=s.split("o");	
		for (int i = a.length-1; i>=0; i--) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		st();
	}
	
	public static void st() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		String[] a=s.split(" ");
		for (int i = a.length-1; i>=0; i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
