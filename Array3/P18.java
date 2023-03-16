//Binary search
//Sort array in ascending order
//Binary search is in range SP MP EP
package Array3;

public class P18 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6};
		int search=4;
		int sp=0;
		int ep=a.length-1;
		int mp=(sp+ep)/2;
		while (sp<=ep) 
		{
			if(search==a[mp])
			{
				System.out.println("Elemet found at index: "+mp);
				break;
			}
			
			else if(search>a[mp])
			{
				sp=mp+1;
			}
			
			else if(search<a[mp])
			{
				ep=mp-1;
			}
			
			mp=(sp+ep)/2;
		}	
		
		if(sp>ep)
		{
			System.out.println("Element not found");
		}
	}
}
