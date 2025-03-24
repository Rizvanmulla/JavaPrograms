package Module2Assignments;
public class upglbvariable 
{
	static double pi=Math.PI;

public static void statmeth()
	{
	System.out.println("Initial Value of PI is "+pi);
	pi=14.25;
	System.out.println("Updated Value of PI is "+pi);
	}

void nonstatmeth()
{
	System.out.println("Initial Value of PI is "+pi);
	pi=35;
	System.out.println("Updated Value of PI is "+pi);
	}
public static void main(String[] args) 
{
	statmeth();
	upglbvariable a1=new upglbvariable();
			a1.nonstatmeth();
}
}