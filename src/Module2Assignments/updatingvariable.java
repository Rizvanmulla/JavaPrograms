package Module2Assignments;

public class updatingvariable 
{
public static void statmeth()
	{
	int a=20;
	System.out.println("Initial Value of a is "+a);
	a=25;
	System.out.println("Updated Value of a is "+a);
	}
void nonstatmeth()
	{
	int b=10;
	System.out.println("Initial Value of a is "+b);
	b=35;
	System.out.println("Updated Value of a is "+b);
	}
public static void main(String[] args) 
{
	statmeth();
	updatingvariable a1=new updatingvariable();
			a1.nonstatmeth();
}
}
