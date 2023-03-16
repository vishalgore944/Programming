//String class.
//StringBuffer class.

/*
String buffer: 
			1. Is a class present inside java.lang package it is used to create mutable String object
			2. String buffer class is similar to String class Except it is mutable
			3. String buffer class in JAVA is thread safe that is multiple threads can not access it simultaneously
Methods of String BUffer class
				1. append(): Concat a string at end --> This method is used to concatinate the specified String with the current String.
				2. insert(): insert a string at any index --> This method is used to insert the specified String with current String at the specified position.
				3. delete(): 2 formal arg StartIndex and EndIndex end index is not deleted --> It is used to delete the String from the specified Start index to the End index.
				4. replace(): 3 formal arg StartIndex and EndIndex and replaced String --> This method is used to replace a String from the Specified Start index to End index.
				5. reverse(): Reverse a String --> This method is used to reverse the current String in the same object.

*/
				
				
package String4;

public class P29 
{
	public static void main(String[] args) 
	{
		String s="Qspiders";
		System.out.println(s);
		s.concat(" Thane");
		System.out.println(s);
		s=s.concat(" Thane");
		System.out.println(s);
		
		System.out.println("String Buffer");
		
		StringBuffer ab=new StringBuffer("Qspidersssss");
		System.out.println(ab);
		ab.append(" Thane");
		System.out.println(ab);
		System.out.println("*********************************************************");
		StringBuffer sb=new StringBuffer("Java a programming");
		System.out.println(sb);
		sb.append(" Language");
		System.out.println(sb);
		sb.insert(5, "is ");
		System.out.println(sb);
		sb.delete(10, 21);
		System.out.println(sb);
		sb.replace(0, 5, "English ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
}
