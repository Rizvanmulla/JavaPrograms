package Module1Programs;

public class paramconstruct 
{
	paramconstruct(int a)
	{System.out.println("parameterized constructor");}
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method output");
		new paramconstruct(10);
		
	}

}