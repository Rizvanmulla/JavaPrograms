package Module2Assignments;

import java.util.Scanner;

public class Circlescannerassign
{
public static void main(String[] args)
{
	Scanner s1=new Scanner(System.in);
	//Area and circumference of Circle
	
	System.out.println("Please enter Radius value of circle");
	
	double r=s1.nextDouble();
	
	double area=Math.PI*r*r;
	
	double circumference=2*Math.PI*r;
	
	System.out.println("are of circle is " +area);
	
	System.out.println("the circumference of circle is " +circumference);
	
	s1.close();
	
}
}
