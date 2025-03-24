package Module2Assignments;
import java.util.Scanner;
public class triangleassignscanner 
{	public static void main(String[] args)
{	//area and circumference of Triangle, formula for area of a Triangle is  0.5*b*h
		//circumference of triangle formula is a+b+c
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Value of base");
		double d=s1.nextDouble();
		System.out.println("Enter the Value of height");
		double h=s1.nextDouble();
		double area=0.5*d*h;
		System.out.println("the area of a Triangle is " +area);
		System.out.println("Enter the Value of first side of triangle");
		double a=s1.nextDouble();
		System.out.println("Enter the Value of second side of triangle");
		double b=s1.nextDouble();
		System.out.println("Enter the Value of third side of triangle");
		double c=s1.nextDouble();
		double circumference=a+b+c;
		System.out.println("the circumference of a Triangle is " +circumference);
		s1.close();
} }
