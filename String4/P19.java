//WAP to display first non repeated character

package String4;

public class P19 
{
	public static void main(String[] args) 
	{
		String s="calculate";
		char[] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		for (int i = 0; i < c.length; i++) 
		{
			if(b[i]==false)
			{
				int count=1;
				for (int j = i+1; j < b.length; j++) 
				{
					if(c[i]==c[j])
					{
						count++;
						b[j]=true;	
					}
				}
				if (count==1) //To get first non repeating character
				{
					System.out.println(c[i]+" " +count);
					break;
				}
			}
		}
	}
}
