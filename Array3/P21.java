//WAP to find sum of index number of 104 and if the sum if even find the sum of all the digits of element which is even or find sum of all the odd numbers digits

package Array3;

import java.util.Iterator;

public class P21 
{
	
	public static int sumOfDigits(int n) 
	{
		int sum=0;
		while (n!=0) 
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int[][] a= {{454,55,521,14},{78,326,104,989},{23447,174,87,845},{25,81,53,11}};
		int x=104;
		int r=0;
		int c=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]==x)
				{
					r=i;
					c=j;
				}
			}
		}
		int sum=0;
		if((r+c)%2==0)
		{
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++) 
				{
					if(a[i][j]%2==0)
					{
						sum=sum+sumOfDigits(a[i][j]);	
					}
				}
			}
			System.out.println(sum);
		}
		
		else 
		{
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = 0; j < a[i].length; j++) 
				{
					if(a[i][j]%2!=0)
					{
						sum=sum+sumOfDigits(a[i][j]);	
					}
				}
			}
			System.out.println(sum);
		}
	}
}