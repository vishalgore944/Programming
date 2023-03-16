//interview question
//WAP to print total decrement operations performed to make the element
//of the array divisible by an integer.
package Array3;

public class P13 
{
	public static void main(String[] args) 
	{
		int k=6;
		int[] a= {5,9,12,16,25};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+(a[i] % k);
		}
		
		System.out.println(sum);
	}
}
