package Module2Assignments;

import java.util.Scanner;

public class assign15nestedifelse 
{
	public static void main(String[] args) 
	{	
		Scanner m=new Scanner(System.in);
		System.out.println("Enter your Percentage");
		double marks=m.nextDouble();
		
		if (marks>=75)
			{System.out.println("Congratulations, You are in Dinstiction");}
				
		else	
			{
				if (marks>=60)
							{System.out.println("Congratulations, You are in First Class");}
				else	
					{ if (marks>=35)
							{System.out.println("You are in Passed");}
						else
							{System.out.println("Sorry, You have Failed");}
					}
			}
		m.close();
	}
}