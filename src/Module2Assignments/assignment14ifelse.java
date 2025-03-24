package Module2Assignments;
import java.util.Scanner;
public class assignment14ifelse
{	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=a.nextInt();
	
	if (age>=18)
	{
		System.out.println("you can vote");
	}
	else
	{
		System.out.println("sorry, you cant vote");
	}
	a.close();
}
}
