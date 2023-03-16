//WAP to convert lowercase alphabets into uppercae alphabets without using inbuilt method

package String4;

public class P11 
{
	public static void main(String[] args) 
	{
		String s="dihdfk65";
		char[] c=s.toCharArray(); 
		
		for (int i=0;i<s.length(); i++) 
		{
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
			}
		}
	
		s=new String(c);
		System.out.println(s);
	}
}
