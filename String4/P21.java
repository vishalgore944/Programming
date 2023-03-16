//Swap a two string

package String4;

public class P21 
{
	public static void main(String[] args) 
	{
		String a="Hello";
		String b="Welcome";
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b= "+b);
		a=a.concat(b);
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b= "+b);
	}
}