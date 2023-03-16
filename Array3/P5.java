//Bubble sort
//1st loop to select element which i want to compare
//2nd loop to compare the selected element to other elements

package Array3;

public class P5 
{
	public static void main(String[] args) 
	{
		int[] a= {10,9,8,7,6,5,4,3,2,1};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
