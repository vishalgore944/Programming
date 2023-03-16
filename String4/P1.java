//String It is a grp of characters or a collection of data 
//String is a final class present inside java.lang package
//String extends object class and implements 3 interfaces
//1. CharSequence
//2. Serializable 
//3. Comparable

//1. CharSequence :It is used to maintain the sequence of the data

//2. Serializable :It is marker interface which is used to provide additional properties
//					It is a empty interface
//					It is used to maintain the state of the object

//3. Comparable : It is used to compare the data present inside the same class with the help of various methods present inside this interface
//				compareTo(): this method follows camle case convention.
//				Class name follows pascul convention 


//How to create String 	
//1. Using directly String literal:
//					String s1="batman";  SCP(String constant pool) only one objec created inside SCP and address of that obj is given to other variables s2,s3
//					String s2="batman";
//					String s3="batman";
//					Whenever we use string literal implicitly JVM creates an object  inside String Constant pool
//					SCP (String constant pool), SCP is also know as String pool which is present inside heap area
//					whenever we create any obj using String literal the JVM first checks the SCP and if obj is already present it returns the reference of that obj.
					


//2. Using new keyword:
//					String s3=new String("batman");


package String4;

public class P1 
{
	public static void main(String[] args) 
	{
		//String literal
		String s1="batman";
		String s2="batman";
		System.out.println(s1==s2); //both are having same address that why true

		//Using new keyword
		String s3=new String("batman");
							  //String literal	
		String s4=new String("batman");
		System.out.println(s3==s4); // both are having different address that why false
		
		
		
		//equals() method
		
		//equals () present inside obj class is overriden by String class which is used to compare the data instead of comparing the address
		//equals() is case sensitive
		
		//Compare the data using equals method
		//== operator compares the address of obj and equal() method of obj class also compares the address but String class also have equal() method
		//we have to overrride the equal() method with the equal() method of String class
		
		System.out.println(s3.equals(s4)); //true data is compared here
		//StringBuffer
		System.out.println("StringBUFFER");
		StringBuffer s5=new StringBuffer("batman");
		StringBuffer s6=new StringBuffer("batman");
		System.out.println(s5.equals(s6)); //False address compared
		
		
		System.out.println("Ignore case");
		String s7=new String("batman");
		String s8=new String("Batman");
		System.out.println(s7.equals(s8)); //use ignore case method
		
//		length method
		String a="bat";
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(2));

	//	System.out.println(a.charAt(3)); StringIndexOutOfBoundsException
//		String is immutable
		String b="bat";
		b.concat("man");
		System.out.println(b);
		
		String c="bat";
		c=c.concat("man");
		System.out.println(c);
		
		
//		StringBuffer is mutable
		StringBuffer b1= new StringBuffer("BAT");
		b1.append("MAN");
		System.out.println(b1);
	}
}
