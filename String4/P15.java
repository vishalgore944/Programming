//WAP to check a string is rotation or not
package String4;

public class P15 
{
	public static void main(String[] args) 
	{
		String s1="XYZ";
		String s2="YZX";
		s1=s1+s1;
		System.out.println(s1);
		if (s1.indexOf(s2)!=-1) 
		{
			System.out.println("Both the strings are rotation of each others");
		} 
		else 
		{
			System.out.println("Both are not rotation");
		}
	}
}
