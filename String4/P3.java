//indexOutofboundexception when get() method in collection
//arrayindexoutofboundexception in array index is not present in array
//stringoutofboundexception in String

//WAP to reverse a string
package String4;

public class P3 
{
	public static void main(String[] args) 
	{
		String s="VISHAL";
		String reverse=""; //OutPut Should not be affected
		for (int i = s.length()-1; i >=0; i--) 
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
}
