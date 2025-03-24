package Module1Programs;

public class MethOverloading //method overloading program

{
	static void add(int a, int b) //as we already defined a method as add we have to add parameters in this one,
	//this is called parameterized method
	
				{
					int sum=a+b;
				
					System.out.println(sum);
				}
	
	static void add(double a, int b)
	
	{
		double sum=a+b;
	
		System.out.println(sum);
	}
	
	static void add(double a, double b)
	
	{
		double sum=a+b;
	
		System.out.println(sum);
	}
	
		static void add(double a)//as we already defined a method as add we have to add parameters in this one, this is called parameterized method
	{
		System.out.println("Half of the number is "+a/2);
	}
	
	
		
	public static void main(String[] args) 
	{
		System.out.println("method outputs are");
		add(11,99);
		add(11.22,99);
		add(11.22,110.15);
		add(45);
		
		
	}
}
