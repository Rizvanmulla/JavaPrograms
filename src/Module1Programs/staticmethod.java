package Module1Programs;

public class staticmethod 
//program for calling a static method in main method, 
//also calling a method is called as invoking a method
{
	static void testcase1()
	
	{System.out.println("first static method");}
	
	static void testcase2()
	
	{System.out.println("second static method");}
	
	static void testcase3()
	{System.out.println("third static method");}
	
public static void main(String[] args) 
{
	System.out.println("Launch");
	testcase1();//these are the static methods and can be called directly in main method, if an only if its static method
	testcase2();
	testcase1();
	testcase1();
	testcase3();
	testcase2();//can call a method multiple times
}
}
