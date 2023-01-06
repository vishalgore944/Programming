//final method
package BasicProgramming;

public class P9 
{
	public static void main(String[] args) 
	{
		CA a=new CB();
		a.test();
	}
}

class CA //SuperClass
{
	final public void test()
	{
		System.out.println("class CA");
	}
}

class CB extends CA //SubClass
{
//	public void test() //CTE
//	{
//		System.out.println("Class CB");
//	}
}