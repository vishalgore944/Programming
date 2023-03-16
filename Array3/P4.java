//Linear search algorithm 
//TO find one element we are comparing to all the elements
package Array3;

public class P4 
{
	public static void main(String[] args) 
	{
		int[] a= {1,5,4,6,8,7};
		int search=89;
		boolean b=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==search) 
			{
				System.out.println("The element is present at index: "+i);
				b=true;
				break;
			}
		}
		
		if (b==false) 
		{
			System.out.println("Element not present");
		}
	}
}
