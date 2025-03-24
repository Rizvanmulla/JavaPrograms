package Module2Assignments;

import java.util.Scanner;

public class squareassignscanner 
{
public static void main(String[] args) 
{
//formula for area of square is a*a	and circumference is 4*a
	Scanner s1=new Scanner(System.in);
	
	System.out.println("Please Enter the value of side of a square");
	double a=s1.nextDouble();
	
	double area=a*a;
	System.out.println("The area of a square is " +area);
	
	double circumference=4*a;
	System.out.println("The circumference of a square is " +circumference);
	
	s1.close();

}
}
