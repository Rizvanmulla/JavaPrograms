package Module2Assignments;

import java.util.Scanner;

public class rectscannerassign 
{
public static void main(String[] args)
{
	//area and circumference of rectangle
		//formula for area of a rectangle is a*b
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Value of a");
		double a=s1.nextDouble();
		System.out.println("Enter the Value of b");
		double b=s1.nextDouble();
		double area=a*b;
		double circumference=2*(a+b);
		System.out.println("the area of a rectangle is " +area);
		System.out.println("the circumference of a rectangle is " +circumference);
		
		s1.close();
}
}
