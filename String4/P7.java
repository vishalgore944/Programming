//WAP to remove the consonants from the String

package String4;

import java.util.Iterator;

public class P7 
{
	public static void main(String[] args) 
	{
		String s="vishal";
		for (int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}