package Module1Programs;

public class constover 


{
	constover(int a)
	{
		System.out.println("constructor 1");
	}
	constover(boolean b1, boolean b2, char gender,String name)
	{
		System.out.println("constructor 2");
	}	
	constover()
	{
		System.out.println("constructor 3");
	}	
						
		public static void main(String[] args)
		{
			new constover();
			new constover(10);
			new constover(true,false,'m',"Rijwan");
		}
}
