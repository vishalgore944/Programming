//WAP to convert integer to String

package String4;

public class P9 
{
	public static void main(String[] args) 
	{
		int n=48;
		String res=n+"";//1st Way to convert primitive data into non primitive concatinate with String
		System.out.println(res);
		
		int a=10;
		String s1=String.valueOf(a); //2nd Way to convert primitive data into non primitive Pass the integer in valueOf() method
		System.out.println(s1);
	}
}