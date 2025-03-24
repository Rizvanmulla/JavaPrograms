package Module2inheritance;
class parent1
{
	static void Login()
	{System.out.println("Login to Amazon");}
	static void Logout()
	{System.out.println("Logout from Amazon");}
}

public class inher extends parent1
{
	static void testcase1()
	{System.out.println("Searchin a Product");}
	
	static void testcase2()
	{System.out.println("Adding to Cart");}

public static void main(String[] args) 
{
	Login();
	testcase1();
	testcase2();
	Logout();
}
}
