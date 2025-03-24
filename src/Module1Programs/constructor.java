package Module1Programs;

public class constructor 
{
	constructor()//access modifier is non static, we can't write static modifier
	
		{
		System.out.println("Output of constructor");
		}

	
	public static void main(String[] args)
	{
		System.out.println("Main method output");
		//cn c=new cn();
		/*constructor c=new constructor();
		constructor d=new constructor();
		constructor e=new constructor();
		constructor f=new constructor();
		constructor g=new constructor(); */
		
		//syntax 2
		// v=new CN
		new constructor();
		
	}
}
