//Remove the first character and last character from String

package String4;

public class P22 
{
	public static void main(String[] args) 
	{
		String s="COMBINATION";
		System.out.println(s);
		int i=0;
		while (s.length()!=1) 
		{
			if(i%2==0)
			{
				s=s.substring(1);
			}
			else 
			{
				s=s.substring(0,s.length()-1);
			}
			System.out.println(s);
			i++;
		}
	}
}
 