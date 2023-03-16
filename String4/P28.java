/* Q how to make class immutable
       1. we have to make class final
	   2. All the data members should be private and final
	   3. To access the private members create only getter() method	   
	   */
//WAP to find a String which has smallest length

package String4;

public class P28 
{
	public static void main(String[] args) 
	{
		String[] s= {"ABCD","XYZ","HTMLL","QWERTT","RT","F"};
		String temp=s[0];
		for (int i = 0; i < s.length; i++) 
		{
				if(temp.length()>s[i].length())
				{
					temp=s[i];
				}
		}
		System.out.println(temp);
	}
}