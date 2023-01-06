//Wap to print product of all the separeted digits
package BasicProgramming1;

public class P18 {

	public static void main(String[] args) 
	{
		int n=456;
		int prod=1;
		while(n!=0)
		{
			int d=n%10;
			prod=prod*d;
			n=n/10;
		}
		System.out.println("\t> "+ prod);
	}
}
