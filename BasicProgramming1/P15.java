/* Wao to Separate each digit from number
531%10		531/10
53%10		53/10
5%10		5/10 */

package BasicProgramming1;

public class P15 
{
	public static void main(String[] args) 
	{
		int n=243;
		while(n!=0)
		{
			int d=n%10;
			System.out.println(d);
			n=n/10;
		}
	}
}