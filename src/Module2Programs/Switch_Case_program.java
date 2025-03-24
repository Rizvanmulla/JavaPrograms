package Module2Programs;

import java.util.Scanner;

public class Switch_Case_program 
{
	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Select 1 to launch Chrome Browser");
	System.out.println("Select 2 to launch Edge Browser");
	System.out.println("Select 3 to launch Mozilla Browser");
	System.out.println("Select 4 to launch Safari Browser");
	System.out.println("Please enter the value");

	int input=	s1.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Chrome");
			break;
			
		case 2:
			System.out.println("Edge");
			break;

		case 3:
			System.out.println("Mozilla");
			break;

		case 4:
			System.out.println("Safari");
			break;

		default:
				System.out.println("Sorry your selection is wrong");
				s1.close();		
		}
						
	}
	
}
