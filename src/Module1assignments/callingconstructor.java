package Module1assignments;

public class callingconstructor

{
	callingconstructor(int a)
	{System.out.println("Calling First Constructor");}
	
	callingconstructor(float f, boolean b, char gender, String name)
	{System.out.println("Calling Second Constructor");}
	
	callingconstructor(double d)
	{System.out.println("Calling Thrid Constructor");}
	
	public static void main(String[] args)
	{
		new callingconstructor(20.4f,true,'M',"Rijwan");
		new callingconstructor(20);
		new callingconstructor(20.45);
	}
	
}
