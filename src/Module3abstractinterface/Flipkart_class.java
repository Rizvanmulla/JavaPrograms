package Module3abstractinterface;
interface FlipkartAPI
{
	void method1();
	void method2();
	void method3();
}
interface GoogleAPI extends FlipkartAPI
{
	void method4();
	void method5();
	void method6();
}
public class Flipkart_class implements GoogleAPI // using this API companies use other company code, eg google authentication.
{
public static void main(String[] args) 
{
}
public void method1()
{
}
public void method2() 
{
}
public void method3() 
{
}
public void method4() 
{
}
public void method5() 
{
}
public void method6() 
{	
}
}
