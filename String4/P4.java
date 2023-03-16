//WAP to check a string is palindrome or not 

package String4;

public class P4
{
	public static void main(String[] args) 
	{
		String s="CCOCC";
		String reverse=""; //OutPut Should not be affected
		for (int i = s.length()-1; i >=0; i--) 
		{
			reverse=reverse+s.charAt(i);
		}	
		
		if(s.equals(reverse))
		{
			System.out.println("String is Palindrome: "+reverse);
		}
		
		else 
		{
			System.out.println("Not a plaindrome");
		}
		
//		if (s.compareTo(reverse)==0) 
//		{
//			System.out.println("String is palindrome: "+reverse);
//		} 
//		else 
//		{
//			System.out.println("Not a palindrome");
//		}
	}
}