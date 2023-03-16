//WAP to sort a character of name in array in aplhabetical order (ascending order)

package Array3;

public class P6 {

	public static void main(String[] args) 
	{
		char[] a= {'v','i','s','h','a','l'};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
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
