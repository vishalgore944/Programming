/*
 String=1BAN2G3ALO4RE
Calculate Total numbers of alphabetes in string
Display the characters
and sum the number present in String

*/
package String4;

public class P8 
{
	public static void main(String[] args) 
	{
		String s="1BAN2G3ALO4RE";
		System.out.print(countOfalphabets(s));
		System.out.println(sumOfnumber(s));
		
	}
	
	public static int sumOfnumber(String s) 
	{
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)>'0' && s.charAt(i)<'9') 
			{
				sum=sum+(s.charAt(i)-'0');//sum=sum+(s.charAt(i)-48);
			}
		}
		return sum;
	}
	
	public static String countOfalphabets(String s) 
	{
		int count=0;
		String res="";
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
				res=res+s.charAt(i);
			}
		}
		
		return count+res;
	}
}
