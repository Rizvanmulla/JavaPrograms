package package2;
import package1.*;
public class class3 extends class1
{
public static void main(String[] args) 
{
	class1.add();
	class1.add2();
	//class1.add3(); its private
	//class1.add1(); its default/package
}
}
