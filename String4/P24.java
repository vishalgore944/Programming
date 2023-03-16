//WAP to check whether a String is anagram String or not
//Anagram String EX: cat and act
//LISTEN and SILENT
//Length of anagram should be same
//Both String characters are same
//String convert into cahracter array
//Then sort both char array in Ascending order

package String4;

public class P24 
{
	public static void sort(char[] c) 
	{
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]>c[j])
				{
					char temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		String a="BV";
		String b="VB";
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		sort(c1);
		sort(c2);		
		if(c1.length==c2.length)
		{
			boolean c=true;
			for (int i = 0; i < c1.length; i++) 
			{
				if(c1[i]!=c2[i])
				{
					c=false;
					break;
				}
			}
			if(c==true)
			{
				System.out.println("Both string are anagram");
			}
			else 
			{
				System.out.println("Both strings are not anagram");
			}
		}
		
		else 
		{
			System.out.println("Both strings are not anagram");
		}
	
	}
}
