package Module3abstractinterface;
abstract class Abstrakt //this is called abstract class as it has abstract method
{
abstract void printmsg1();//this is abstract method with no implementation
	
	void printmsg2()//this is concrete method with implementation
	{
		System.out.println("print method 2 with method body");
	}
}	
class regular extends Abstrakt
{
	void printmsg1()
	{
		System.out.println("print method 1 without method body");
	}
}
public class Absexample//concrete class as it does not have any abstract method
{
	public static void main(String[] args) 
	{
	regular a1=new regular();
	a1.printmsg1();
	a1.printmsg2();
	}
}
