package Module3abstractinterface;//abstract example 3
abstract class classC
{
	abstract void method1();
	abstract void method2();
	// we can add concrete methods here also
	//static and non static both methods
}
abstract class classB extends classC
{
	abstract void method3();
	abstract void method4();
}
public class ClassA extends classB
{
public static void main(String[] args)
{
}

void method3() //access specifier will be same as method
{
	System.out.println("method3");
}
void method4() 
{
	System.out.println("method4");
}
void method1() 
{
	System.out.println("method1");
}
void method2() 
{
	System.out.println("method2");
}
}
