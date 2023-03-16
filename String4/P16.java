//Question

package String4;

import java.util.Arrays;

public class P16 
{
	public static void main(String[] args) 
	{
		String s="11,5,7";
		String[] b=s.split(",");
		int[] c=new int[3];
		for (int i = 0; i < b.length; i++) 
		{
			c[i] =Integer.parseInt(b[i]);
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		int sum=c[0]*c[0]+c[1]*c[1];
		int sum1=c[1]*c[1]+c[2]*c[2];
		System.out.println(sum1-sum);
		System.out.println();
		max();
	}
	
	public static void max() 
	{
		String s="11,5,7";
		String[] a=s.split(",");
		int large1=Integer.MIN_VALUE;
		int large2=Integer.MIN_VALUE;
		int small1=Integer.MAX_VALUE;
		int small2=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) 
		{
			int x=Integer.parseInt(a[i]);
			if(x>large1)
			{
				large2=large1;
				large1=x;
			}
			else if(x>large2 && x!=large1)
			{
				large2=x;
			}
			
			if(x<small1)
			{
				small2=small1;
				small1=x;
			}
			else if(x<small2 && x!=small1)
			{
				small2=x;
			}
		}
		System.out.println(large1);
		System.out.println(large2);
		System.err.println(small1);
		System.out.println(small2);
		
		int sum=large1*large1+large2*large2;
		int sum1=small1*small1+small2*small2;
		System.out.println(sum-sum1);
	}
}
