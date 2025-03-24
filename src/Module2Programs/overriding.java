package Module2Programs;
class parentclass
{
	void login()
	{
		System.out.println("Login with mobile number");
	}
}
public class overriding extends parentclass
{
	void login()
	{
		
		System.out.println("Login with email id");
		super.login();//this is not super calling statement, different, as its not the first line
		//super keyword is diff. than super calling, it calls parent class const. from child class
	}
	public static void main(String[] args) 
	{
		overriding r1=new overriding();
		r1.login();
	}
}
