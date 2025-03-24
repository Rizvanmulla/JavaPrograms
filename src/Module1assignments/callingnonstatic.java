package Module1assignments;

public class callingnonstatic
{

	void addition()
		{
		int a=30;
		int b=50;
		System.out.println(a+b);
		}
	
	void mul()
		{
		int a=30;
		int b=50;
		System.out.println(a*b);
		}
	
	void div()
		{
		int a=15;
		int b=30;
		System.out.println(b/a);
		}
	
public static void main(String[] args)
	
		{
			System.out.println("Non Static Method Overloading");// non static method can't be called by its name; in order to access it we have to create an object
			//syntax
			//CN variable=new CN;
			//variable.nonstaticmethod();
			callingnonstatic r=new callingnonstatic();
			r.addition();
			r.mul();
			r.div();
		}
}
