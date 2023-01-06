//Create Unused objects for garbage collection
package BasicProgramming;

public class P7 {
	public static void main(String[] args) 
	{
		System.out.println(new P7());//Anonymous Object
		
		P6 ref=new P6();
		ref=null;//Assigning the reference as null
		System.out.println(ref);	
		
		P6 ref1=new P6();
		P6 ref2=new P6();
		ref1=ref2;//Assigning the ref of 1 object into another
		System.out.println(ref1);
		System.out.println(ref2);
	}
}
