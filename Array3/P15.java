//WAP to find largest element in array
//WAP to find second largest element in array
package Array3;

public class P15 
{
	public static void main(String[] args) 
	{
		int[] a= {4,3,1,5,1};
		int largest=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println(largest);
		
		seecondlargest();//Second largest
	}
	
	public static void seecondlargest() 
	{
		{
			int[] a= {14,3,31,55,1};
			int largest=Integer.MIN_VALUE;
			int Slarge=Integer.MAX_VALUE;
			for (int i = 0; i < a.length; i++) 
			{
				if(a[i]>largest)
				{
					Slarge=largest;
					largest=a[i];
				}
				
				else if (a[i]>Slarge && a[i]!=largest)
				{
					Slarge=a[i];
				}
			}
			System.out.println("Large: "+largest);	
			System.out.println("Second Large: "+Slarge);	
		}
	}
}
