//WAP to convert all the lowercase character in uppercase and uppercase character into lower case

package String4;

public class P12 
{
	public static void main(String[] args) 
	{
		String s="vishal GORE";
		char[] c=s.toCharArray();//To convert String into array
		for (int i = 0; i<s.length(); i++) 
		{
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
			}
			
			else if (c[i]>='A' && c[i]<='Z') 
			{
				c[i]=(char)(c[i]+32);
			}
		}
		s=new String(c); //Initialized the c array in String 
		System.out.println(s);
	}
}
