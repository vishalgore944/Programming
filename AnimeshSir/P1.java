//WAP to find a missing number in the arrary //One element is missing
//Check duplicates or not
//Check Range
//Check Sorted or not

package AnimeshSir;

public class P1 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,8,9};
		int sum1=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of all the elements: "+sum1);
		
		int sum2=0;
		for (int i = 1; i <=9; i++) 
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of all the elements in range: "+sum2);
		int missing=sum2-sum1;
		System.out.println("Missing number is: "+missing);
	}
}
