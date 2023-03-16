//WAP to count tottal number of duplicate words present in the String

package String4;

import java.util.Arrays;

public class P20 
{
	public static void main(String[] args) 
	{
		String s="Java It is a programming language It is used to programming to to do do do do";
		int count2=0;
		String[] a=s.split(" ");
		boolean[] b=new boolean[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			if(b[i]==false)
			{
				int count=1;
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i].equals(a[j]))
					{
						count++;
						b[j]=true;	
					}
				}		
//				if(count>1)
//				{
//					System.out.println(a[i]+" "+count);
//				}
				if(count>1)
				{
					count2++;
				}
			}
		}
		System.out.println(count2);
	}
}