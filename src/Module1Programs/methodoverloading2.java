package Module1Programs;

public class methodoverloading2 
{
static void first()
	{
	System.out.println("First Static Method");
	}
void second()
	{
	System.out.println("First Non Static Method");
	}
static void third()
	{
	System.out.println("second Static Method");
	}
void fourth()
{
System.out.println("second Non Static Method");
}
public static void main(String[] args) 
{
	methodoverloading2 m=new methodoverloading2();
	first();
	m.second();
	third();
	m.fourth();
}
}
