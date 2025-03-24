package Module3abstractinterface;
class facebook_class//supercalling statement program
{
	facebook_class(int a)
	{System.out.println("facebook login");}
}
class Google_Auth extends facebook_class//supercalling statement
{
	Google_Auth(String name)//this is constructor, here supercalling statement is explicitly present
	{
		super(90);
		System.out.println("Google Authentication");
	}
}
public class Amazon extends Google_Auth
{
	Amazon()
	{
		super("Rijwan");//its used to call the parent class constructor from child class
		//it will always be the first line in every constructor
		System.out.println("Login to Amazon");
	}
	
public static void main(String[] args) 
	{
	new Amazon();//here we have called only child class constructor and it called parent class
	}
}