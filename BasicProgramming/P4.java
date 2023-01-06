//Print 1 to 5 without using loop
package BasicProgramming;

public class P4 {
		public static void main(String[] args) 
		{
//			System.out.println("MB");
			demo(1);
//			System.out.println("ME");
		}
		
		public static void demo(int n)
		{
			if(n<=5)
			{
				System.out.println(n);
				n++;
				demo(n);
			}
		}
}
