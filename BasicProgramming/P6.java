package BasicProgramming;                               

public class P6 {
		public static void main(String[] args) {
			System.out.println(new P6()); //Anonymous Object                               
			
			P6 ref1=new P6();                               
			ref1=null;					//Assigning the refrence as null
			System.out.println(ref1);
			
			P6 ref2=new P6();
			P6 ref3=new P6();
			ref2=ref3;				//Assigning the ref of one object into another
			System.out.println(ref2);
			System.out.println(ref3);
			
			System.gc();
		}
		
		public void finalize()
		{
			System.out.println("Clean up activities");
		}
}
