package Module2inheritance;

class grandparent
	{
		static void method1()
			{
			System.out.println("Method 1 Executed");
			}
	}
class parent extends grandparent
	{
		static void method2()
			{
			System.out.println("Method 2 Executed");
			}

	}

public class Child_class extends parent
	{
		static void method3()
			{
			System.out.println("Method 3 Executed");
			}	

public static void main(String[] args) 
	{
	
	method1();
	method2();
	method3();
	
	}
}
